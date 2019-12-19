/**@ ��������ı�׼����:ʹ��Iterator�ӿ�(�������)
 * һ.3������:
 *   1.boolean hasNext()         �������Ԫ�ؿ��Ե������򷵻� true�� 
     2.E       next()         ���ص�������һ��Ԫ�ء� 
     3.void    remove()     �ӵ�����ָ��� collection ���Ƴ����������ص����һ��Ԫ�أ���ѡ�������� ??--->���Ƴ���ǰԪ��
          ��.����:    
       ListIterator<E>, XMLEventReader 
           ��.ʵ���� :
                  ͨ��Set,��Collection��iterator()��������ʵ����      
              ��.ע��: 
                   �ڵ�������в���ִ�м��ϵ�remove����eg:letteList.remove(),ֻ����iterator��remove()����ɾ��                                   
 */

package ����;

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
		Iterator<String> iterator=letterList.iterator(); /**1.ͨ��collection�е�iterator()����ʵ����iterator�ӿ�!!!!*/
		                                              /**2.iterator�ķ�����ʹ��*/
		while(iterator.hasNext()){                //iterator.hasNext()����:�жϼ����Ƿ���Ԫ��     (������Ԫ���Ƿ���true)   
			String string=iterator.next();       //iterator.next()������һ��Ԫ�ظ�string
			if ("b".equals(string)) {            //�ж�b�Ƿ����string
				iterator.remove();                //iterator.remove()�Ƴ���ǰԪ��   b
			}
			else {
				System.out.println(string);
			}
		}
		/**3.�ڵ�������в���ִ�м��ϵ�remove����eg:letteList.remove(),ֻ����iterator��remove()����ɾ��*/
//		while(iterator.hasNext()){ 
//				System.out.println(iterator.next());
//		}���ȫ���ļ���Ԫ��
	}

}
