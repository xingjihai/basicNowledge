package ����֪ʶ.��̬�ͼ̳�;

public class ConstructTest {
    public static void main(String[] args) {
        //1�� ����C1��Ĭ�ϵ���P��Ĭ�Ϲ��췽��
//        P p=new C1();
//        C1 c=new C1();   
        //2�� ����C1��Ĭ�ϵ���P��Ĭ�Ϲ��췽��
        P p=new C1(10);
//        C1 c=new C1(10);   
    }
}

class P{
    P(){
        System.out.println("P�Ĺ��췽��������");
    }
    P(int age){
        System.out.println("P�Ĺ��췽��������,age="+age);
    }
}
class C1 extends P{
    C1(){
        System.out.println("C1�Ĺ��췽��������");
    }
    C1(int age){
        System.out.println("C1�Ĺ��췽��������,age="+age);
    }
}
