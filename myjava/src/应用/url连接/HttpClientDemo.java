package 应用.url连接;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * 需要导入的包： 如果不知道导入什么包，可以在类上按F3查看，就可以看出是哪个包下的，或直接百度。
httpclient-4.0.1.jar
httpcore-4.0.1.jar
commons-logging-1.1.1.jar  (如果没有这个包会报：Caused by: java.lang.ClassNotFoundException: org.apache.commons.logging.LogFactory的错误) --控制台输出不了
 */
public class HttpClientDemo {
	public static void main(String[] args) {
		String str=execute("http://wap.kuaidi100.com/wap_result.jsp?rand=20120517&id=shentong&fromWeb=null&postid=3315484304396");
		System.out.println(str);
	}
	private static String execute(String uri) {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(uri);
		HttpResponse response;
		try {
			response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();
			String content = EntityUtils.toString(entity, "utf-8");
			return content;
		} catch (ClientProtocolException e) {
			// e.printStackTrace();
		} catch (IOException e) {
			// e.printStackTrace();
		}
		return null;
	}
}
