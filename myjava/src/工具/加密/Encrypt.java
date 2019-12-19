package 工具.加密;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/*加盐操作: 如：在密码中加入用户名 一起进行加密   参考：http://www.cnblogs.com/guanghuiqq/archive/2012/09/08/2676384.html*/

/**
 *  加密算法步骤：
 *  1、选择加密算法，传入数据，加密处理
 *  2、对加密后的byte数据进行转换 <br>
 *  
 *  <b>词汇</b>：加盐操作
 */
public class Encrypt {
	public static void main(String[] args) throws Exception {
		String pwd="wszbd666wyjxy";
		System.out.println(md5(pwd));
		
		//Hmac加密
		byte[] bytes = encryptHMAC(pwd.getBytes(), "425");
		System.out.println(turnType(bytes));
	}
	public static final String KEY_SHA="SHA";
	  public static final String KEY_MD5="MD5";
	  public static final String KEY_MAC="HmacMD5";
	
	 //MD5 加密
	public static byte[] encryptMD5(byte[] data) throws Exception
	{
		MessageDigest md5=MessageDigest.getInstance(KEY_MD5);
		md5.update(data);
		return md5.digest();
	}
	//SHA 加密
	public static byte[] encryptSHA(byte[] data) throws Exception
	{
		MessageDigest sha=MessageDigest.getInstance(KEY_SHA);
		sha.update(data);
		return sha.digest();
	}
	//HmacMD5 加密
	public static byte[] encryptHMAC(byte[] data,String key) throws Exception
	{
		SecretKey sk=new SecretKeySpec(key.getBytes(),KEY_MAC);
		Mac mac=Mac.getInstance(sk.getAlgorithm());
		mac.init(sk);
		return mac.doFinal(data);
	}
	
	/**
	 * 对加密后的byte数据进行转换
	 */
	private static String  turnType(byte[] result){
		StringBuilder sb = new StringBuilder();
		for (byte b : result) {
			int number = b & 0xff; // byte转为int
			String hex = Integer.toHexString(number);  //十进制转十六进制
			if (hex.length() == 1) {
				sb.append("0" + hex);
			} else {
				sb.append(hex);
			}
		}
		return sb.toString();
	}
	
	
	public static String md5(String text) {
		try {
			MessageDigest digest = MessageDigest.getInstance("md5");
			byte[] result = digest.digest(text.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : result) {
				int number = b & 0xff; //  byte转为int
				String hex = Integer.toHexString(number);  //十进制转十六进制
				if (hex.length() == 1) {
					sb.append("0" + hex);
				} else {
					sb.append(hex);
				}
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			// can't reach
			return "";
		}
	}
}
