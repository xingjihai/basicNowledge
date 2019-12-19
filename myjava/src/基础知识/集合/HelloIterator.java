/**@ 集合输出的标准操作:使用Iterator接口(迭代输出)
 * 一.3个方法:
 *   1.boolean hasNext()         如果仍有元素可以迭代，则返回 true。 
     2.E       next()         返回迭代的下一个元素。 
     3.void    remove()     从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。 ??--->即移除当前元素
          二.子类:    
       ListIterator<E>, XMLEventReader 
           三.实例化 :
                  通过Set,或Collection的iterator()方法进行实例化      
              四.注意: 
                   在迭代输出中不能执行集合的remove操作eg:letteList.remove(),只能用iterator的remove()进行删除                                   
 */

package 集合;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class HelloIterator {

	public static void main(String[] args) {
		List<String> letterList=new ArrayList<String>();
		letterList.add("a");
		letterList.add("b");
		letterList.add("c");
		letterList.add("d");
		letterList.add("e");
		letterList.add("f");
		Iterator<String> iterator=letterList.iterator(); /**1.通过collection中的iterator()方法实例化iterator接口!!!!*/
		                                              /**2.iterator的方法的使用*/
		while(iterator.hasNext()){                //iterator.hasNext()方法:判断集合是否还有元素     (当还有元素是返回true)   
			String string=iterator.next();       //iterator.next()返回下一个元素给string
			if ("b".equals(string)) {            //判断b是否等于string
				iterator.remove();                //iterator.remove()移除当前元素   b
			}
			else {
				System.out.println(string);
			}
		}
		/**3.在迭代输出中不能执行集合的remove操作eg:letteList.remove(),只能用iterator的remove()进行删除*/
//		while(iterator.hasNext()){ 
//				System.out.println(iterator.next());
//		}输出全部的集合元素
	}

}
