package io�����ֽ��ַ���;

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
			String string=new String("58we ��ʻ�ɻ�");
			char w[]=string.toCharArray();     //!!!!�����ҵ�ת����char�ķ�����
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
