package 线程.yield礼让;

class myRunnable1 implements Runnable{
	private String name;
	
	//myRunnable构造函数
	public myRunnable1(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	@Override//必须实现/覆盖run（）方法
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(name+":"+i);
			if(i==50){
				try {
					System.out.println("礼让");
					Thread.sleep(1000);  //并发，缓一下才能看出来
					Thread.yield();    //怎么会没有用？
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
class myRunnable2 implements Runnable{
	private String name;
	
	//myRunnable构造函数
	public myRunnable2(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	@Override//必须实现/覆盖run（）方法
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(name+":"+i);
			}
		}
	}

public class RunnableDemo {
	public static void main(String[] args) {
		myRunnable1 m1=new myRunnable1("A");
		myRunnable2 m2=new myRunnable2("B");
		//比继承Thread多了以下一行
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		
		t1.start();
		t2.start();
		
	}
}
