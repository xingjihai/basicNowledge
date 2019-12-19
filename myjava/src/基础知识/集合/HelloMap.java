/**1.������ʽ:
 *   key-->value�ķ�ʽ����(key�������ظ�)
 * 2.��������:
 *   HashMap: ������,key�������ظ�
 *   Hashtable:������,key�������ظ�
 * 3.����:
 *   put()-->�������!!  get()--���key   containsKey--�ж�key�Ƿ����  containsValue--�ж�value�Ƿ����
 *   keySet()---������еļ�,���ص���Set����     valuse()--������е�ֵ,���ص���collection����
 * @ java����:Map�ӿ�
 */
package ����֪ʶ.����;

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
		map.put("name", "С��");               /**1.put()�����������*/
		map.put("age", "15");
		map.put("sex", "��");
		System.out.println(map.get("name"));/**2.ͨ������key�����value��ֵ*/
		System.out.println(map.get("age"));
		System.out.println(map.get("sex"));
		if (map.containsKey("name")) {
			System.out.println("name����");
		}
		else{
			System.out.println("name������");
		}
		if(map.containsValue("ˮ��")){
			System.out.println("valueˮ������");
		}
		else {
			System.out.println("valueˮ��������");
		}
		                               /**3.Map�е�keySet()��values()������ʹ��:*/
		System.out.println("����Map�е�keySet()��values()����:");
		System.out.println("������м�:");
		Set<String> set1=map.keySet();        //����Map�е�keySet����������Set������
		Iterator<String> i1=set1.iterator();  //ͨ��iterator�ӿ����
		while (i1.hasNext()) {
			System.out.print(i1.next()+"\t");
		}
		
		System.out.println("\n�������ֵ:");
		Collection<String> collection=map.values();//����Map�е�values����������Collection������
		Iterator<String> i2=collection.iterator();
		while (i2.hasNext()) {
			System.out.print(i2.next()+"\t");
		}
	}
	
	/**
	 * ����Map�����ַ���
	 * link http://www.cnblogs.com/bukudekong/p/3889740.html
	 */
	@Test
	public void getMap(){
	    Map<String, Object> map=new HashMap<String, Object>();
        map.put("name", "С��");
        map.put("age", "15");
        map.put("sex", "��");
        
        /**1��keySet()  */
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        System.out.println("=============");
        /**2���Ƽ���������������ʱ  :ͨ��Map.entrySet����key��value */
        for (Entry<String, Object> entry : map.entrySet()) {
            System.out.println( entry.getValue() );
        }
        System.out.println("=============");
        /**3��  */
        Iterator<String> i=map.keySet().iterator();
        while (i.hasNext()) {
            String key = (String) i.next();
            System.out.println(map.get(key));
        }
        System.out.println("=============");
        /**4��  */
        for (Object obj : map.values()) {
            System.out.println(obj);
        }
        System.out.println("=============");
        
	}
	
}
