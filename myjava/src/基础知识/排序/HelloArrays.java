/**Arrays.sort():排序*/
package 排序;

import java.util.Arrays;

public class HelloArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double random_array[]=new double[10];
		for (int i = 0; i < random_array.length; i++) {
			random_array[i]=Math.random();//Math.random()方法只有double型
		}
		System.out.println("排序前:");
		for (int i = 0; i < random_array.length; i++) {
			System.out.println(random_array[i]);
		}
		Arrays.sort(random_array);       //Arrays.sort():排序:有多个重载
		System.out.println("排序后:");
		for (int i = 0; i < random_array.length; i++) {
			System.out.println(random_array[i]);
		}
		
	}

}
