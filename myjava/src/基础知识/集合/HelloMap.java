/**1.保存形式:
 *   key-->value的方式保存(key不允许重复)
 * 2.常用子类:
 *   HashMap: 无序存放,key不允许重复
 *   Hashtable:无序存放,key不允许重复
 * 3.方法:
 *   put()-->添加数据!!  get()--获得key   containsKey--判断key是否存在  containsValue--判断value是否存在
 *   keySet()---获得所有的键,返回的是Set集合     valuse()--获得所有的值,返回的是collection集合
 * @ java集合:Map接口
 */
package 基础知识.集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class HelloMap {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("name", "小明");               /**1.put()方法添加数据*/
		map.put("age", "15");
		map.put("sex", "男");
		System.out.println(map.get("name"));/**2.通过调用key来获得value的值*/
		System.out.println(map.get("age"));
		System.out.println(map.get("sex"));
		if (map.containsKey("name")) {
			System.out.println("name存在");
		}
		else{
			System.out.println("name不存在");
		}
		if(map.containsValue("水晶")){
			System.out.println("value水晶存在");
		}
		else {
			System.out.println("value水晶不存在");
		}
		                               /**3.Map中的keySet()和values()方法的使用:*/
		System.out.println("测试Map中的keySet()和values()方法:");
		System.out.println("输出所有键:");
		Set<String> set1=map.keySet();        //调用Map中的keySet方法保存在Set集合中
		Iterator<String> i1=set1.iterator();  //通过iterator接口输出
		while (i1.hasNext()) {
			System.out.print(i1.next()+"\t");
		}
		
		System.out.println("\n输出所有值:");
		Collection<String> collection=map.values();//调用Map中的values方法保存在Collection集合中
		Iterator<String> i2=collection.iterator();
		while (i2.hasNext()) {
			System.out.print(i2.next()+"\t");
		}
	}
	
	/**
	 * 遍历Map的四种方法
	 * link http://www.cnblogs.com/bukudekong/p/3889740.html
	 */
	@Test
	public void getMap(){
	    Map<String, Object> map=new HashMap<String, Object>();
        map.put("name", "小明");
        map.put("age", "15");
        map.put("sex", "男");
        
        /**1、keySet()  */
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        System.out.println("=============");
        /**2、推荐，尤其是容量大时  :通过Map.entrySet遍历key和value */
        for (Entry<String, Object> entry : map.entrySet()) {
            System.out.println( entry.getValue() );
        }
        System.out.println("=============");
        /**3、  */
        Iterator<String> i=map.keySet().iterator();
        while (i.hasNext()) {
            String key = (String) i.next();
            System.out.println(map.get(key));
        }
        System.out.println("=============");
        /**4、  */
        for (Object obj : map.values()) {
            System.out.println(obj);
        }
        System.out.println("=============");
        
	}
	
}
