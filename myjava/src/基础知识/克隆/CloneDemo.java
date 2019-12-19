package ��¡;
/**��������������ƴ�ַ,clone�����൱�ڴ�ֵ*/
class Addr{
	String country; //����
	String city; //����
	int number; //int�� ��������
	Addr(String country,String city,int number){
		this.country=country;
		this.city=city;
		this.number=number;
	}
	public void print(){
		System.out.println(country+"\t"+city+"\t"+number);
	}
}
class Human implements Cloneable{    /**1.ʵ��Cloneable�ӿ�*/
	String name;
	String sex;
	int age;
	Addr addr;
	Human(String name,String sex,int age,Addr addr){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.addr=addr;
	}
	public void print(){
		System.out.println(name+"\t"+sex+"\t"+age);
		addr.print();
	}
	public Object clone(){
		Human h=null;                 /**2.����һ��Human����*/
		try {
			h=(Human)super.clone();/**3.����Object��clone����(��Ҫ���õ���Object����ת��ΪHuman����)*/
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return h;                    /**4.����Human����*/
	}
}
public class CloneDemo {
	public static void main(String[] args){
		Addr addr=new Addr("�й�", "Ȫ��", 888);
		Human zhangsan=new Human("����","��",21,addr);
		Human lisi=(Human)zhangsan.clone();
		zhangsan.print();
		lisi.print();
		
		
		System.out.println("\n����һ:");
		lisi.name="����";            /**5.��clone��������,�ı�name����û�б�*/
		lisi.addr.country="����";
		lisi.addr.city="ŦԼ";
		lisi.addr.number=999;    /**6.������ַ����:ԭ����clone����û�п�¡country,city,number*/
		zhangsan.print();
		lisi.print();
		//������Զ�д�ڲ���һǰ���޷����ֲ���һ��Ч��(Ϊʲô?Object��clone����ԭ�����һ���˽�)
		
		System.out.println("\n���Զ�:");
		Addr addr1=new Addr("Ӣ��","�׶�",666);
		lisi.addr=addr1;          
		lisi.name="����";
		zhangsan.print();     /**7.������ַû��:ԭ����clone�����п�¡��addr����(Human������Addr����)*/
		lisi.print();
	}
}
