package io操作字节字符流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CopyBuffereCharStream2 {
	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("hello.txt");
			InputStreamReader fir=new InputStreamReader(fi);
			BufferedReader firb=new BufferedReader(fir);
			FileOutputStream fo=new FileOutputStream("hello-new.txt");
			OutputStreamWriter fow=new OutputStreamWriter(fo);
//			BufferedWriter fowb=new BufferedWriter(fow);
			PrintWriter fowb=new PrintWriter(fow);         /**不是缓冲流,较慢*/
			int count=0;
			long before=System.currentTimeMillis();
			String string=null;
			while((string=firb.readLine())!=null){       /**readline()整行输出*/
//				fowb.write(string);//没有换行                   
				fowb.println(string);
				count++;
			}
			firb.close();
			fir.close();
			fi.close();
			fowb.close();
			fow.close();
			fo.close();
			System.out.println("success:"+count+"次");
			System.out.println(System.currentTimeMillis()-before+"ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
