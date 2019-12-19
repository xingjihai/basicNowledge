package 线程的强行执行;

public class ThreadDemo2 {
	public static void main(String[] args) {
		myThread t1=new myThread("A");
		t1.start();
		for (int i = 0; i < 1000; i++) {
			if(i>10){
				try {
					t1.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("主线程"+":"+i);
		}
	}
}
