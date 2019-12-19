package 功能.交互;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownLoadDataWidget {
	@Override
	protected void display(Map<String, String> params) {
		
		HttpServletRequest request = ThreadContextHolder.getHttpRequest();
		String action = request.getParameter("action");
		
		if ("download".equals(action)) {
			download();
		}
	}
	
	private void download() {	
		HttpServletResponse response = ThreadContextHolder.getHttpResponse();//响应文件
		HttpServletRequest request = ThreadContextHolder.getHttpRequest();
		Integer catid = Integer.valueOf(request.getParameter("catid"));// 获取类别id
		Integer articleid = Integer.parseInt(request.getParameter("articleid"));// 获取文章id
		Map map = dataManager.get(articleid, catid, false);// 获取某一个音乐
		String path = (String) map.get("url");
		String title =(String)map.get("title");
		// 获取数据库的存储路径
		String[] paths = path.split(",");
		String shuju_title = paths[0];
		String shuju_path = paths[1];
		int first_dot = shuju_title.indexOf(".");
		String suffix = shuju_title.substring(first_dot);//获得后缀
		String fileName = null;
		if(title!=null&&!"".equals(title)){
			fileName = title+suffix;
		}else{
			fileName = shuju_title;
		}
		
		
		//替换路径为服务器上的路径
		String realpath = UploadUtil.replacePath(shuju_path);
		/**获取文件流*/
		InputStream inStream =null;
		OutputStream outs=null;
		try {
			URL url = new URL(realpath);
			URLConnection connection = url.openConnection();
			inStream = connection.getInputStream();// 获取文件输入流
			outs = response.getOutputStream();// 获取文件输出IO流
			response.setContentType("application/x-msdownload");// 告知浏览器下载
			/** 解决浏览器的中文乱码问题 */
			String userAgent = request.getHeader("User-Agent");
			byte[] bytes = userAgent.contains("MSIE") ? fileName.getBytes() : fileName.getBytes("UTF-8");
			fileName = new String(bytes, "ISO-8859-1");
			response.addHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\"");// 设置头部信息
			byte[] c = new byte[8096];
			int len = 0;
			while ((len = inStream.read(c)) != -1) {// 向网络传输文件流
				outs.write(c, 0, len);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				outs.close();
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
