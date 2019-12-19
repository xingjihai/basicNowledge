package 接口;

interface WeekDay{    //接口的作用之一:创建常量组
	int MONDAY=1;     //1.接口的默认访问权限:public static final int MONDAY=1;
	int TUESDAY=2;     //1.常量必须大写--->规范
	int WEDNESDAY=3;
	int THURSDAY=4;
	int FRIDAY=5;
	int SATURDAY=6;
	int SUNDAY=7;       
}
class Time implements WeekDay{
	void print(){
		System.out.println(MONDAY);
		System.out.println(TUESDAY);
		System.out.println(WEDNESDAY);
		System.out.println(THURSDAY);
		System.out.println(FRIDAY);
		System.out.println(SATURDAY);
		System.out.println(SUNDAY);
	}
}
public class TestInterface {
	public static void main(String[] args) {
		Time t=new Time();
		t.print();
	}

}
