package io操作字节字符流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyCharStream {
	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("hello.txt");
			InputStreamReader fir=new InputStreamReader(fi);
			FileOutputStream fo=new FileOutputStream("hello-new.txt");
			OutputStreamWriter fow=new OutputStreamWriter(fo);
			char r[]=new char[20];
			long before=System.currentTimeMillis();
			int count=0;
			int l=0;
			while((l=fir.read(r))!=-1){
				fow.write(r, 0, l);
				count++;
			}
			fir.close();
			fi.close();
			fow.close();
			fo.close();
			System.out.println("success"+count+"次");
			System.out.println(System.currentTimeMillis()-before+"ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
