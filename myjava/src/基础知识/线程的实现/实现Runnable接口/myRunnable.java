package 基础知识.线程的实现.实现Runnable接口;

public class myRunnable implements Runnable{
    private String name;
    
    //myRunnable构造函数
    public myRunnable(String name) {
        // TODO Auto-generated constructor stub
        this.name=name;
    }
    
    @Override//必须实现/覆盖run（）方法
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            System.out.println(name+":"+i);
            //常用方法：1、 cunrrentThread()获得当前线程
              //     2、  getName()获得线程名称
            System.out.println(Thread.currentThread().getName());
        }
    }
}
