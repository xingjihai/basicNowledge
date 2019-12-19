/*1.参数传递(传值,传地址):java中的参数传递都是传值引用*/
/*2.this的用途:2.1在构造函数中调用其他函数   2.2在方法中获得调用该方法的对象*/
package 参数传递;

/**这是基本类型的参数传递(传递的是非对象,数据类型可以是string,int等):传值引用,还有对象类型的参数传递(看笔记).*/

public class Parameter {
	public int money;
	
	public static void main(String[] args) {
		//我的错误:amethod am=new amethod(int money);  应先声明类,再调用类中的方法!!
		Parameter pa=new Parameter();
		pa.money=100;
		pa.amethod(pa.money);
		System.out.println("money的末值:"+pa.money);  //2.money的值没有改变,改变的是i,而i作为临时变量被抛弃.
		                                            //money没有随i变化,说明i得到只是money的一个拷贝.
	}

	void amethod(int i){
		System.out.println("i的初始值:"+i);
		i=i*5;
		System.out.println("i的末值:"+i);
		System.out.println("money的末值:"+this.money);//1.this.money:获得当前对象实例变量money的值  ,this表示调用该方法的对象
	}
}
