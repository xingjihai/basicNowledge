/**
 * @ 公共接口
 * 一个类可以同时继承抽象类和实现接口
 */
package 接口;
// public interface TV{                //error:公共类型接口只能在自己的类中定义:一个文件夹中只能有一个类被public,可把public去掉.
//	 String channel=null;//频道
//	 }
public class HelloInterface {	
	public interface TV{                           /**1. 接口的定义       组成:1变量,2方法*/
		String channel=null;//频道             1.1变量
		void on();                 
		void off();                //1.2抽象方法
	}
	public interface furniture{
		String type=null;
		void old();
		void good();
	}
	                                             /**2.接口的实现:在/接口/HelloInterface1.java中*/
	public interface chair extends furniture{     /**3.接口的继承*/
		void shufu();//舒服
	}
	                                              /**4.和抽象类一样,接口不能实例化,但是可以声明接口类型的变量,他的值必须是实现了该接口的类的对象
	                                               * eg:chair yizi=new chair1;(chair1为一个类)
	                                               *    可以调用接口chair所有的方法
	                                               * */
}
