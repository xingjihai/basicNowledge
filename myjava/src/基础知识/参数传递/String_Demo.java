package ²ÎÊý´«µÝ;

class Ref2{
	int temp=111;
	int temp2=temp;
	int temp3;
}
public class String_Demo {
	public static void main(String[] args) {
		Ref2 r1=new Ref2();
		r1.temp=222;
		System.out.println(r1.temp);
		r1.temp3=r1.temp;
		tell(r1);
		System.out.println(r1.temp3);
		System.out.println(r1.temp);
		System.out.println(r1.temp2);
	}
	public static void tell(Ref2 r2){
		r2.temp=333;
	}
}
