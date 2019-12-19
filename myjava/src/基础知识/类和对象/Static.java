/*静态变量,静态常量,静态方法:static:只与类有关,与对象无关*/
package 类和对象;
class student{
	public static final int x=123;   //1.静态常量:在程序中不可改变,不能通过赋值改变其值,(需static{x=100;}?有待验证)
	static int sum=0;                //1.1静态常量,静态变量的初始化是在调用构造函数之前完成的
	int sno;
	String sname;
	
	public student(int Tsno,String Tsname){
		sno=Tsno;
		sname=Tsname;
		sum++;                                 // 2.静态变量.作用:利用构造函数和static来实现学生人数的计数,标准访问方式:student.sum
	}//构造函数
	
	static void print(){   //------------------3.静态方法:注意:3.1静态方法直接!不能访问非静态变量,3.2非静态方法可以!直接访问静态变量
		System.out.println();           
	}
}
public class Static {
	public static void main(String[] args) {
		student s1=new student(01,"s1");
		student s2=new student(02,"s2");
		student s3=new student(03,"s3");
		System.out.println("学生数:"+student.sum); //2.1对学生计数
		
		System.out.println("改变变量,与静态变量static比较:");
		s1.sno=100;
		System.out.println("s1的sno: "+s1.sno);
		System.out.println("s2的sno: "+s2.sno+"   未被影响");
		System.out.println("s3的sno: "+s3.sno+"   未被影响");
		s1.sum=100;                      // 2.通过一个对象改变静态变量,则整个类对应的对象的静态变量都会改变.
		System.out.println("s1的sno: "+s1.sum);
		System.out.println("s2的sno: "+s2.sum+"   被影响");
		System.out.println("s3的sno: "+s3.sum+"   被影响");//标准访问方式:student.sum(以上语句s1.sum等,是为了验证静态变量)
	}

}
