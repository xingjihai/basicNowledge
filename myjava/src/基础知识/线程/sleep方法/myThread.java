package �߳�.sleep����;

public class myThread extends Thread {
	private String name; //���ڱ�ʶ�ĸ��߳�
	
	//myThread���캯��
	public myThread(String name) {
		this.name=name;
	}
	
	//����ʵ��run��������
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				sleep(1000);          //ֹͣ1���ִ��
				System.out.println(name+":"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
}
