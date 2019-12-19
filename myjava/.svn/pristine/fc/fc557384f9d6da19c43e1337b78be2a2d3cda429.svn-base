package 线程.sleep方法;

public class myThread extends Thread {
	private String name; //用于标识哪个线程
	
	//myThread构造函数
	public myThread(String name) {
		this.name=name;
	}
	
	//必须实现run（）方法
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				sleep(1000);          //停止1秒后执行
				System.out.println(name+":"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
}
