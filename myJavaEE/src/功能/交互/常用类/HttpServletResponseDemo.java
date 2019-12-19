package 功能.交互.常用类;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletResponseDemo extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.doPost(request, response);
		
		//---------------设置----------------------//
		//输出格式
		response.setContentType("application/json;charset=UTF-8" );   
																	/**  发送格式
																	 * 	 @json:  "application/json;charset=UTF-8"  
																	 *   @text:   "text/plain;charset=UTF-8"
																	 *   @xml:     "text/xml;charset=UTF-8"
																	 *   @下载：  "application/x-msdownload"
																	*/
		// 禁用IE缓存
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		
		//---------------输出----------------------//
		response.getWriter().write("输出的内容");
		
	}
}
