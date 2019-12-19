/**java中允许把许多类的声明放在一个java中,但是这些类只能有一个类被声明为public,而且这个类名必须和java文件名相同
/**1.private:只有本类可见    ,子类不可继承该属性                                           ---只能放类内部
 * 2.protected:(本类,子类,)同一包的类可见,包外可继承
 * 3.默认(无修饰符):(本类,)同一包的类可见,包外不可继承
 * 4.public:对任何类可见
*类是对象的抽象化,类的实例化:对象,类是建立对象的模板
 */
package 类和对象;

      class Human{                      //------注意:这个类不能放在HelloClass中否则或错误:在HelloClass外找不到实例
		String name;
		String sex;
		int age;      //               一.类的组成:1.属性
		void work(){
			System.out.println("正在工作");
		};//                                   2.方法
		void eat(){
			System.out.println("正在吃饭");
		}//方法
      }

public class HelloClass {
	public static void main(String[] args) {
		Human yijia;//                   二.类的实例化:即对象           1.声明
		yijia=new Human();//                              2.实例化,分配内存空间
		//可以合并:   Human yijia=new Human();
		yijia.name="yijia";
		yijia.sex="男";
		yijia.age=21;//                                   3.初始化
		yijia.work();                // 三.方法的调用
		System.out.println(yijia.name+yijia.sex+yijia.age);  //四.属性的调用
		
		// -------------------------------------------     五.赋值
		Human men=new Human();
		men=yijia;                                      //将yijia的指针给了men,指向了同一个对象;
		men.name="超人";
		System.out.println(yijia.name);                 //改变men就是改变了men所指的对象,对象yijia也就改变了!!!
	}
	}
