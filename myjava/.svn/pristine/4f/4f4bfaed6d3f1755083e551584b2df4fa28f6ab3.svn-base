package io操作字节字符流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriteCharStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fo=new FileOutputStream("hello-new.txt");
			OutputStreamWriter fow=new OutputStreamWriter(fo);
			String string=new String("58we 驾驶飞机");
			char w[]=string.toCharArray();     //!!!!终于找到转换成char的方法了
			fow.write(w);
			fow.close();
			fo.close();
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
