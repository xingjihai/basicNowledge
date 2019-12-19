/**1.List可加入重复元素
 * 2.List接口常用子类：
 *   ArrayList,Vector：方法差不多，ArrayList性能高（非线程安全）,Vector线程安全性好
 * 3.List常用方法：(查看api：java.util中) //也可通过eclipse联想查看有那些方法
 *   List.add()  List.remove()   List.get()   List.isEmpty()  List.size()  List.indexOf()--字符是否存在 
 * @ Collection的子类List
 */
package 集合;

import java.util.ArrayList;
import java.util.List;

public class HelloList {

	public static void main(String[] args) {
//		List<String> list=null;
//		list=new ArrayList<String>(); 这两行等于下面的一行:
		List<String> list=new ArrayList<String>();
		list.add("A");                            //add()添加元素
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("共"+list.size()+"个元素");
		for (int i = 0; i < list.size(); i++) {  //size():获得集合元素数量
			System.out.println(list.get(i));       //get():获得元素
		}
		list.remove(1);                           //remove(1)删除现集合第二个元素
		System.out.println(list.indexOf("B"));  //indexOf()不包含为:-1
		System.out.println(list.isEmpty());   //isEmpty()不为空则为:false
		list.remove(0);
		list.remove(0);
		list.remove(0);
		System.out.println(list.isEmpty());
	}

}
