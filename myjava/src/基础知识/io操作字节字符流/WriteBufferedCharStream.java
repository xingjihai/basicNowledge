package io�����ֽ��ַ���;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteBufferedCharStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fo=new FileOutputStream("hello-new.txt");
			OutputStreamWriter fow=new OutputStreamWriter(fo);
			BufferedWriter fowb=new BufferedWriter(fow);
			String str=new String("skfj aweroj ��������122");
			fowb.write(str);
			fowb.close();
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
