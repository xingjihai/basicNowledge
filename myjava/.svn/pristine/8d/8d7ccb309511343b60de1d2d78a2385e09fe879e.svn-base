/**重载是实现多态的方式之一;
 *方法重载:java中支持多个同名的方法:但他们的参数个数和类型必须有差别
 */
package 类和对象;
public class OverLoading {
	void method(){
		System.out.println("无参方法被调用");
	}
	void method(int a){
			System.out.println("int型参数被调用");
		}
	void method(String b){
		System.out.println("String型参数被调用");
	}
	void method(double c){
		System.out.println("double型参数被调用");
	}

	public static void main(String[] args) {
		OverLoading we=new OverLoading();    //！！！
		we.method();
		we.method(1);
		we.method(4.5D);
		we.method("dskf");             //同方法名,不同参数类型:即重载
	}

}
