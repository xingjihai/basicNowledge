/*���캯��*/
package ��Ͷ���;
class Human2{           //�����ﴴ����һ��Human��˵�����캯��
	String name;
	String sex;
	int age;
	//------------------------------------------------------------------------1.���캯��-------------------------
	public Human2(String Tname,String Tsex,int Tage){
		name=Tname;
		sex=Tsex;
		age=Tage;
		System.out.println("���캯��1��ʹ��");
	}              
	//java��Ҳ�ṩ�˹��캯��������,���Ը������󴴽�������캯��:eg:                  1.1���캯��������
	public Human2(String Tname){
		name=Tname;
		System.out.println("���캯��2��ʹ��");
	}
	public Human2(String Tname,int Tage){
		this(Tname);                       //���ù��캯��2-----        1.2���캯���е����������캯��
		age=Tage;                          //eg:���캯��1���Ե��ù��캯��3:this(Tname,Tage);sex=Tsex;����
		System.out.println("���캯��3��ʹ��,���ù��캯��2");
	}   //�ȵ�..........
	//----------------------------------------------------------------------------------------
}
public class GouZao {
	public static void main(String[] args) {
		//-----------------------------------------------  --------------- 2.ϵͳ�Դ��Ĺ��캯��--------------------------
		Human zhangsan=new Human();    //��HelloClass���ж���,���������
		/*�õ���ϵͳ�Դ��Ĺ��캯��
		 * ʵ��:Human(){
		 * name=null;        1)���������Ϊnull;
		 * sex=null;         2)boolean��Ϊfalse;
		 * age=o;            3)���ֱ�����Ϊ0;
		 * }              
		 * */
		System.out.println("Human()Ĭ��ֵΪ:");
		System.out.println(zhangsan.name+" "+zhangsan.sex+" "+zhangsan.age);  
		System.out.println();
		//------------------------------------------------------------------------------------------------------------
		
		//-----------------------------------------              3.�ҵĹ��캯����ʹ��
		Human2 lisi=new Human2("����","��",30);
		//����:  Human2 lisi=new Human2();  /�����Լ��Ĺ��캯��ʱϵͳ�������ṩĬ�ϵĹ��캯��.
		System.out.println("lisi:");
		System.out.println(lisi.name+" "+lisi.sex+" "+lisi.age);
		System.out.println();
		
		Human2 wangwu=new Human2("����");
		System.out.println("wangwu:");
		System.out.println(wangwu.name+" "+wangwu.sex+" "+wangwu.age);
		System.out.println();
		
		Human2 xiao=new Human2("��",20);
		System.out.println("xiao:");
		System.out.println(xiao.name+" "+xiao.sex+" "+xiao.age);
	}
}
