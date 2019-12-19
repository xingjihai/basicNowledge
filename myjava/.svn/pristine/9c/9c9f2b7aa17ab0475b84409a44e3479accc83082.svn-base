package io操作字节字符流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyBuffereCharStream {
	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("hello.txt");
			FileOutputStream fo=new FileOutputStream("hello-new.txt");
			InputStreamReader fir=new InputStreamReader(fi);
			OutputStreamWriter fow=new OutputStreamWriter(fo);
			BufferedReader firb=new BufferedReader(fir);
			BufferedWriter fowb=new BufferedWriter(fow);
			int count=0;
			long before=System.currentTimeMillis();
			int l=0;
			char cbuf[]=new char[10];
			while((l=firb.read(cbuf))!=-1){
				fowb.write(cbuf,0,l);
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
