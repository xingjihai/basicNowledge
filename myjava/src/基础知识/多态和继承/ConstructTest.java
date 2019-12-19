package 基础知识.多态和继承;

public class ConstructTest {
    public static void main(String[] args) {
        //1、 创建C1会默认调用P的默认构造方法
//        P p=new C1();
//        C1 c=new C1();   
        //2、 创建C1会默认调用P的默认构造方法
        P p=new C1(10);
//        C1 c=new C1(10);   
    }
}

class P{
    P(){
        System.out.println("P的构造方法被调用");
    }
    P(int age){
        System.out.println("P的构造方法被调用,age="+age);
    }
}
class C1 extends P{
    C1(){
        System.out.println("C1的构造方法被调用");
    }
    C1(int age){
        System.out.println("C1的构造方法被调用,age="+age);
    }
}
