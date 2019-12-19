/** 1.Set接口中不能加入重复元素，但是可以排序
 *  2.Set接口常用子类：
 *     散列存放：HashSet(字母没有顺序)
 *     有序存放：TreeSet(系统自动排序)
 * @ Collection的子类Set
 */
package 集合;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HelloSet {
	public static void main(String[] args) {
		//HashSet 子类
		Set<Integer> array1=new HashSet<Integer>();
		Set<String> letterSet1=new HashSet<String>();
		array1.add(1);
		array1.add(8);
		array1.add(9);
		array1.add(4);
		array1.add(5);
		array1.add(6);
		System.out.println(array1);         //与list输出不同!!
		letterSet1.add("A");
		letterSet1.add("B");
		letterSet1.add("C");
		letterSet1.add("D");
		letterSet1.add("E");
		letterSet1.add("F");
		System.out.println(letterSet1);   //字母没有排序
		//TreeSet 子类
		Set<Integer> array2=new TreeSet<Integer>();
		Set<String> letterSet2=new TreeSet<String>();
		array2.add(1);
		array2.add(8);
		array2.add(9);
		array2.add(4);
		array2.add(5);
		array2.add(6);
		System.out.println(array2);        //
		letterSet2.add("C");
		letterSet2.add("B");
		letterSet2.add("E");
		letterSet2.add("D");
		letterSet2.add("A");
		letterSet2.add("F");
		System.out.println(letterSet2);    
	}

}
