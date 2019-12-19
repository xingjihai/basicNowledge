/**1.List�ɼ����ظ�Ԫ��
 * 2.List�ӿڳ������ࣺ
 *   ArrayList,Vector��������࣬ArrayList���ܸߣ����̰߳�ȫ��,Vector�̰߳�ȫ�Ժ�
 * 3.List���÷�����(�鿴api��java.util��) //Ҳ��ͨ��eclipse����鿴����Щ����
 *   List.add()  List.remove()   List.get()   List.isEmpty()  List.size()  List.indexOf()--�ַ��Ƿ���� 
 * @ Collection������List
 */
package ����;

import java.util.ArrayList;
import java.util.List;

public class HelloList {

	public static void main(String[] args) {
//		List<String> list=null;
//		list=new ArrayList<String>(); �����е��������һ��:
		List<String> list=new ArrayList<String>();
		list.add("A");                            //add()���Ԫ��
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("��"+list.size()+"��Ԫ��");
		for (int i = 0; i < list.size(); i++) {  //size():��ü���Ԫ������
			System.out.println(list.get(i));       //get():���Ԫ��
		}
		list.remove(1);                           //remove(1)ɾ���ּ��ϵڶ���Ԫ��
		System.out.println(list.indexOf("B"));  //indexOf()������Ϊ:-1
		System.out.println(list.isEmpty());   //isEmpty()��Ϊ����Ϊ:false
		list.remove(0);
		list.remove(0);
		list.remove(0);
		System.out.println(list.isEmpty());
	}

}
