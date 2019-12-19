package io操作字节字符流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ReadCharStream {
	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("hello.txt");
			InputStreamReader fir=new InputStreamReader(fi);
			char c[]=new char[20];
//			while(fir.read(c)!=-1){
//			System.out.println(new String(c));  //结尾会多出几个字节
//		}
			int l=0;
			while((l=fir.read(c))!=-1){
				System.out.println(new String(c,0,l));
//				System.out.println(c);                      /**可以不转换为字符串*/
			}
			fir.close();
			fi.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
