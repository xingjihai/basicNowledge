package 基础知识.线程的实现.继承Thread类;

public class ThreadDemo1 {
    public static void main(String[] args) {
        myThread t1=new myThread("A");
        myThread t2=new myThread("B");
//      t1.run();
//      t2.run();      //run()方法并不能实现线程的并发，要使用start（）方法
        t1.start();
        t2.start();  //并发执行
    }
}
