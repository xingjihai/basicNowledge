package Ëæ»úÊý;

import java.util.Random;


import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Random_demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int t = r.nextInt(2);
			System.out.println(t);
		}
	}

}
