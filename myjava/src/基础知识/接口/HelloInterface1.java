package 接口;

import 接口.HelloInterface.TV;  
import 接口.HelloInterface.chair;//导入接口

class TVa implements TV{                /**2.接口的实现*/
	public void on(){                 //2.1实现接口的方法必须被声明为public
		System.out.println("TV is on");
	}
	public void off(){
		System.out.println("TV is off");
	}
}
class chair1 implements chair{           //2.1必须定义接口所有接口中的方法
	public void old(){
		System.out.println("chair is old");
	}
	public void good(){
		System.out.println("chair is good");
	}
	public void shufu(){
		System.out.println("chair is comfortable");;
	}
}

public class HelloInterface1 {
	public static void main(String[] args) {
		TVa a=new TVa();
		a.on();
		a.off();
		
		chair1 yizi=new chair1();
		yizi.shufu();
	}

}
