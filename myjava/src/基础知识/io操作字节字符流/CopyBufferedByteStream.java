package 基础知识.io操作字节字符流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBufferedByteStream {
	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("hello.txt");
			BufferedInputStream fib = new BufferedInputStream(fi);
			FileOutputStream fo=new FileOutputStream("hello-new.txt");
			BufferedOutputStream fob=new BufferedOutputStream(fo);
			byte f[] = new byte[10];
			int l=0;
			int count=0;
			long before=System.currentTimeMillis();
			while((l=fib.read(f))!=-1){
				fob.write(f, 0, l);
				count++;
			}
			fib.close();
			fi.close();
			fob.close();
			fo.close();
			System.out.println("success:"+count+"次");
			System.out.println(System.currentTimeMillis()-before+"ms");
		} catch (Exception e) {
		}
	}

}
