package 基础知识.线程的实现.继承Thread类;

public class myThread extends Thread {
    private String name; //用于标识哪个线程
    
    //myThread构造函数
    public myThread(String name) {
        this.name=name;
    }
    
    //必须实现run（）方法
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(name+":"+i);
        }
    };
}
