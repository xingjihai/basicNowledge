/**
 * 抽象类abstract,向下向上转型
 */
package 类和对象;
abstract class Human3{
	String name;
	int age;
	void tell1(){
		System.out.println("human-tell1");
	}
	abstract void tell2();              /**1.含抽象方法的类必需被定义为抽象类*/
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
		//human man=new human();错误:不能实例化类型 human  
		                                 /**2.抽象类不能被实例化,但可以创建抽象类的对象变量来指向他的非抽象子类对象*/
		System.out.println("测试1:抽象类"); //结果输出子类方法
		Human3 man=new pupil();
		man.tell1();
		
		System.out.println("测试2:");
		upTurn();
		
		System.out.println("测试3:");
		downTurn();
	}
	
	static void upTurn(){          
		pupil ren1=new pupil();
		Human3 ren2=ren1;        //向上转型 pupil->human
		ren2.tell1();//注意：调用的是子类pupil的tell1
		((pupil) ren2).tell3();
	}
	
	static void downTurn(){
		Human3 ren1=new pupil();
		pupil ren2=(pupil) ren1;  //向下转型:human->pupil
		ren2.tell1();
		//error:  ren.tell2();
		ren2.tell3();  
	}

}