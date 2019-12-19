package 克隆;
/**对象参数传递类似传址,clone方法相当于传值*/
class Addr{
	String country; //国家
	String city; //城市
	int number; //int型 测试数据
	Addr(String country,String city,int number){
		this.country=country;
		this.city=city;
		this.number=number;
	}
	public void print(){
		System.out.println(country+"\t"+city+"\t"+number);
	}
}
class Human implements Cloneable{    /**1.实现Cloneable接口*/
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
		Human h=null;                 /**2.声明一个Human对象*/
		try {
			h=(Human)super.clone();/**3.调用Object的clone方法(需要将得到的Object对象转换为Human对象)*/
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return h;                    /**4.返回Human对象*/
	}
}
public class CloneDemo {
	public static void main(String[] args){
		Addr addr=new Addr("中国", "泉州", 888);
		Human zhangsan=new Human("张三","男",21,addr);
		Human lisi=(Human)zhangsan.clone();
		zhangsan.print();
		lisi.print();
		
		
		System.out.println("\n测试一:");
		lisi.name="李四";            /**5.用clone方法拷贝,改变name张三没有变*/
		lisi.addr.country="美国";
		lisi.addr.city="纽约";
		lisi.addr.number=999;    /**6.张三地址变了:原因是clone方法没有克隆country,city,number*/
		zhangsan.print();
		lisi.print();
		//如果测试二写在测试一前则无法出现测试一的效果(为什么?Object中clone方法原理待进一步了解)
		
		System.out.println("\n测试二:");
		Addr addr1=new Addr("英国","伦敦",666);
		lisi.addr=addr1;          
		lisi.name="李四";
		zhangsan.print();     /**7.张三地址没变:原因是clone方法中克隆了addr对象(Human类中有Addr对象)*/
		lisi.print();
	}
}
