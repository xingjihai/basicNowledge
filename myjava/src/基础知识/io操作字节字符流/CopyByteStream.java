/**�ֽ��͵�����(��)���(д)��:��Stream��β
 * �ֽ��͵�read,write�����Ķ���(ֻ��?)��byte.    ����read(),write()ǰҪ������ת����byte
 * @ �ֽ��Ͷ�д,�ȴ򿪵��ȹر�
 */
package io�����ֽ��ַ���;

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
			System.out.println("success :"+count+"��");
			System.out.println(System.currentTimeMillis()-before+"ms");
		} catch (Exception e) {
		}

	}

}
