/*继承,(对象的多态,动态调用子类方法) 多态和动态绑定,super,方法的覆(fu)/重写*/
/**
 * 继承的限制:
 * 1.在java中只允许单继承
 * 2.子类不能直接访问父类的私有成员(需set,get)
 * 
 * 重写(override)的限制:
 * 被子类重写的方法不能有比父类方法更严格的访问权限(eg:父类public方法,子类不能是默认或private)
 */
package 多态和继承;
class Animal{
	String type;
	int age;
	Animal(String Type,int Tage){
		type=Type;
		age=Tage;
	}
	void eat(){
		System.out.println("animal eat");
	}
	void breath(){
		System.out.println("animal breath");
	}
	void sleep(){
		System.out.println("animal sleep");
	}
}

class Fish extends Animal{
	Fish(String Tname,int Tage){
		super(Tname, Tage);
	}
	String Fishtype;
	void breath(){
		System.out.println("鱼用腮呼吸.");
	}
	void action(){
		System.out.println("鱼在游");
	}
}

class Tiger extends Animal{ 
	String tigertype;
	
	Tiger(String Type, int Tage) {
		super(Type, Tage);                  //3.1子类要调用父类的有参构造函数需使用super
	}	                                    /**3.1调用父类构造函数, super:超类,父类. 即调用Animal(Type, Tage);   */

	void breath(){                          //2.方法的覆(fu)/重写:子类重新定义父类的方法
		super.breath();                     /**3.2 调用父类方法---super*/
		System.out.println("老虎用肺呼吸.");
	}
	void action(){
		System.out.println("老虎在跑");
	}
}
/**
 * Tiger 拥有的属性,方法:
 * String name;
	String type;
	int age;
	void eat();
	void sleep();
	void breath();//以上是父类属性
	String tigertype;-------这是子类的属性
	void action();
 * @author       ------------------------ -----1.Tiger继承了Animal的属性和方法.
 *
 */




public class ExtendClass {
	public static void main(String[] args) {
		Animal a1[]=new Animal[3];         //4.对象是多态的,定义一个Animal对象,它可以存放Animal对象,也可以存放Animal的子类
		a1[0]=new Animal("cat",1);
		a1[1]=new Tiger("tiger",3);
		a1[2]=new Fish("fish",0);
		System.out.println("动态绑定子类breath方法:");
		a1[0].breath();                
		a1[1].breath();                 //5.动态绑定:执行时会自动地调用原来对象的方法,而不是Animal的breath方法,即调用的是子类自己的方法
		a1[2].breath();
		System.out.println("数组元素调用子类自己的方法需类型转换:");
		((Tiger)a1[1]).action();       //6.类型转换: 该数组调用父类没有的子类时需进行  类型转换
		((Fish)a1[2]).action();
		//                                7.instanceof的用法:
		ExtendClass text=new ExtendClass();
		System.out.println("运用instanceof:");
		text.move(a1[1]);
		text.move(a1[2]);
		text.move(a1[0]);
	}
	void move(Animal a){      //---------- 7.instanceof的用法:
	if(a instanceof Tiger)
		((Tiger)a).action();
	else if(a instanceof Fish)
		((Fish)a).action();
	else a.sleep();
}

}
