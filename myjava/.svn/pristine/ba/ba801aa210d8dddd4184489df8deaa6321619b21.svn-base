/*构造函数*/
package 类和对象;
class Human2{           //在这里创建另一个Human来说明构造函数
	String name;
	String sex;
	int age;
	//------------------------------------------------------------------------1.构造函数-------------------------
	public Human2(String Tname,String Tsex,int Tage){
		name=Tname;
		sex=Tsex;
		age=Tage;
		System.out.println("构造函数1被使用");
	}              
	//java中也提供了构造函数的重载,可以根据需求创建多个构造函数:eg:                  1.1构造函数的重载
	public Human2(String Tname){
		name=Tname;
		System.out.println("构造函数2被使用");
	}
	public Human2(String Tname,int Tage){
		this(Tname);                       //掉用构造函数2-----        1.2构造函数中调用其他构造函数
		age=Tage;                          //eg:构造函数1可以调用构造函数3:this(Tname,Tage);sex=Tsex;即可
		System.out.println("构造函数3被使用,掉用构造函数2");
	}   //等等..........
	//----------------------------------------------------------------------------------------
}
public class GouZao {
	public static void main(String[] args) {
		//-----------------------------------------------  --------------- 2.系统自带的构造函数--------------------------
		Human zhangsan=new Human();    //在HelloClass中有定义,这里可引用
		/*用到了系统自带的构造函数
		 * 实际:Human(){
		 * name=null;        1)对象变量设为null;
		 * sex=null;         2)boolean设为false;
		 * age=o;            3)数字变量设为0;
		 * }              
		 * */
		System.out.println("Human()默认值为:");
		System.out.println(zhangsan.name+" "+zhangsan.sex+" "+zhangsan.age);  
		System.out.println();
		//------------------------------------------------------------------------------------------------------------
		
		//-----------------------------------------              3.我的构造函数的使用
		Human2 lisi=new Human2("李四","男",30);
		//错误:  Human2 lisi=new Human2();  /当有自己的构造函数时系统将不再提供默认的构造函数.
		System.out.println("lisi:");
		System.out.println(lisi.name+" "+lisi.sex+" "+lisi.age);
		System.out.println();
		
		Human2 wangwu=new Human2("王五");
		System.out.println("wangwu:");
		System.out.println(wangwu.name+" "+wangwu.sex+" "+wangwu.age);
		System.out.println();
		
		Human2 xiao=new Human2("晓",20);
		System.out.println("xiao:");
		System.out.println(xiao.name+" "+xiao.sex+" "+xiao.age);
	}
}
