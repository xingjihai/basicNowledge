/**������ʵ�ֶ�̬�ķ�ʽ֮һ;
 *��������:java��֧�ֶ��ͬ���ķ���:�����ǵĲ������������ͱ����в��
 */
package ��Ͷ���;
public class OverLoading {
	void method(){
		System.out.println("�޲η���������");
	}
	void method(int a){
			System.out.println("int�Ͳ���������");
		}
	void method(String b){
		System.out.println("String�Ͳ���������");
	}
	void method(double c){
		System.out.println("double�Ͳ���������");
	}

	public static void main(String[] args) {
		OverLoading we=new OverLoading();    //������
		we.method();
		we.method(1);
		we.method(4.5D);
		we.method("dskf");             //ͬ������,��ͬ��������:������
	}

}
