/**
 * ������abstract,��������ת��
 */
package ��Ͷ���;
abstract class Human3{
	String name;
	int age;
	void tell1(){
		System.out.println("human-tell1");
	}
	abstract void tell2();              /**1.�����󷽷�������豻����Ϊ������*/
}
class pupil extends Human3{
	int grade;
	void tell1(){
		System.out.println("pupil-tell1");
	}
	void tell2(){
		System.out.println("pupil-tell2");
	}
	void tell3(){
		System.out.println("pupil-tell3");
	}
}
public class UseAbstract {
	public static void main(String[] args) {
		//human man=new human();����:����ʵ�������� human  
		                                 /**2.�����಻�ܱ�ʵ����,�����Դ���������Ķ��������ָ�����ķǳ����������*/
		System.out.println("����1:������"); //���������෽��
		Human3 man=new pupil();
		man.tell1();
		
		System.out.println("����2:");
		upTurn();
		
		System.out.println("����3:");
		downTurn();
	}
	
	static void upTurn(){          
		pupil ren1=new pupil();
		Human3 ren2=ren1;        //����ת�� pupil->human
		ren2.tell1();//ע�⣺���õ�������pupil��tell1
		((pupil) ren2).tell3();
	}
	
	static void downTurn(){
		Human3 ren1=new pupil();
		pupil ren2=(pupil) ren1;  //����ת��:human->pupil
		ren2.tell1();
		//error:  ren.tell2();
		ren2.tell3();  
	}

}