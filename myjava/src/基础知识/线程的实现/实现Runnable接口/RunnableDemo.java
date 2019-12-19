package 基础知识.线程的实现.实现Runnable接口;


public class RunnableDemo {
    public static void main(String[] args) {
        myRunnable m1=new myRunnable("A");
        myRunnable m2=new myRunnable("B");
        //比继承Thread多了以下一行
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        
        //常用方法     3、isAlive()线程是否启动  false为启动，true为未启动
        System.out.println(t1.isAlive());
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        
        
        
        /***
         * 内部类实现runnable接口
         */
        Thread t=new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t.start();
        
    }
}
