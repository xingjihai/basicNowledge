package io操作字节字符流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.NEW;

import 循环.BreakContinue;

public class ReadByteStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			
			FileInputStream stream=new FileInputStream("hello.txt");
			byte[] br=new byte[20];
			
			
//			while (stream.read(br)!=-1) {
//				String string=new String(br);
//				System.out.println(string);   //结尾会多出几个字节
//			}
			int l=0;
			while((l=stream.read(br))!=-1){
				System.out.println(new String(br,0,l));
			}
			stream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
