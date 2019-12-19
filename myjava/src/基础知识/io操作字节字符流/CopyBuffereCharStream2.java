package io�����ֽ��ַ���;

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
			PrintWriter fowb=new PrintWriter(fow);         /**���ǻ�����,����*/
			int count=0;
			long before=System.currentTimeMillis();
			String string=null;
			while((string=firb.readLine())!=null){       /**readline()�������*/
//				fowb.write(string);//û�л���                   
				fowb.println(string);
				count++;
			}
			firb.close();
			fir.close();
			fi.close();
			fowb.close();
			fow.close();
			fo.close();
			System.out.println("success:"+count+"��");
			System.out.println(System.currentTimeMillis()-before+"ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
