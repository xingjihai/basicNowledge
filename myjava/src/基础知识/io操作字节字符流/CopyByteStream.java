package 基础知识.io操作字节字符流;
/**字节型的输入(读)输出(写)流:以Stream结尾
 * 字节型的read,write方法的对象(只能?)是byte.    即在read(),write()前要将数据转换成byte
 * @ 字节型读写,先打开的先关闭
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyByteStream {


	public static void main(String[] args) {
		try {
			int count=0;
			FileInputStream fis = new FileInputStream("hello.txt");
			FileOutputStream fiso=new FileOutputStream("hello-new.txt");
			int l=0;
			byte b[] = new byte[1];
			long before=System.currentTimeMillis();
			while ((l=fis.read(b))!=-1) {
				fiso.write(b,0,l);

				count++;
			}
			fis.close();
			fiso.close();
			System.out.println("success :"+count+"次");
			System.out.println(System.currentTimeMillis()-before+"ms");
		} catch (Exception e) {
		}

	}

}
