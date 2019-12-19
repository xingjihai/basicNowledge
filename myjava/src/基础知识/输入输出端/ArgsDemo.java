/*命令行参数,在运行-->运行配置-->自变量  中设置参数*/
package 输入输出端;

public class ArgsDemo {

	public static void main(String args[]/*main方法中接受用户输入的参数列表,即*/) {
		System.out.println("共接收到"+args.length+"个参数");
		for(int i=0;i<args.length;i++){            //在for中声明变量
			System.out.println("第"+i+"个参数"+args[i]);
		}

	}

}
