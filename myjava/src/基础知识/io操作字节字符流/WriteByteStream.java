package io²Ù×÷×Ö½Ú×Ö·ûÁ÷;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileOutputStream fi=new FileOutputStream("hello-new.txt");
			String outString="writeByteStream test1!";
			byte output[]=outString.getBytes();
			fi.write(output);
			fi.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		};
	}

}
