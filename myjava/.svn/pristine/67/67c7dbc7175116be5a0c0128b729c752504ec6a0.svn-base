package io操作字节字符流;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadBufferedCharStream {
	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("hello.txt");
			InputStreamReader fir=new InputStreamReader(fi);
			BufferedReader firb=new BufferedReader(fir);
			char c[]=new char[10];
			long before=System.currentTimeMillis();
			int count=0;
//			firb.read(c);
//			System.out.println(c);
			while(firb.read(c)!=-1){    //末尾还是多出了字符还是要加l
				System.out.println(c);
				count++;
			}
			firb.close();
			fir.close();
			fi.close();
			System.out.println("success:"+count+"次");
			System.out.println(System.currentTimeMillis()-before+"ms");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
