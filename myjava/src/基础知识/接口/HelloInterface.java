/**
 * @ �����ӿ�
 * һ�������ͬʱ�̳г������ʵ�ֽӿ�
 */
package �ӿ�;
// public interface TV{                //error:�������ͽӿ�ֻ�����Լ������ж���:һ���ļ�����ֻ����һ���౻public,�ɰ�publicȥ��.
//	 String channel=null;//Ƶ��
//	 }
public class HelloInterface {	
	public interface TV{                           /**1. �ӿڵĶ���       ���:1����,2����*/
		String channel=null;//Ƶ��             1.1����
		void on();                 
		void off();                //1.2���󷽷�
	}
	public interface furniture{
		String type=null;
		void old();
		void good();
	}
	                                             /**2.�ӿڵ�ʵ��:��/�ӿ�/HelloInterface1.java��*/
	public interface chair extends furniture{     /**3.�ӿڵļ̳�*/
		void shufu();//���
	}
	                                              /**4.�ͳ�����һ��,�ӿڲ���ʵ����,���ǿ��������ӿ����͵ı���,����ֵ������ʵ���˸ýӿڵ���Ķ���
	                                               * eg:chair yizi=new chair1;(chair1Ϊһ����)
	                                               *    ���Ե��ýӿ�chair���еķ���
	                                               * */
}
