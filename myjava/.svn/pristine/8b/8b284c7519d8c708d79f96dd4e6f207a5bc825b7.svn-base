/**
 * @ 内部类
 */
package 可见不可见性;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test2 {
	public static void main(String[] args) {
		class Test22{                  /**1.内部类:Test22在类Test2中对外不可见  -- 相当于private?*/
			int ii=10;
			int jj=11;
		}
		Test3.t3print4();
	}

}
class Test3{
	int age;
	private int name; 
	void t3print1(){                        //可被Test1调用
		System.out.println("test3--1"); 
		}
	
	public void t3print2(){                  //可被Test1调用
		System.out.println("test3--2");
	}
	private  void t3print3(){
		System.out.println("test3--3");
	}
	public static  void t3print4(){           //可被Test2调用
		System.err.println("test4--4");
	}
}

