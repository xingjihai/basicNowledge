package �ӿ�;

interface WeekDay{    //�ӿڵ�����֮һ:����������
	int MONDAY=1;     //1.�ӿڵ�Ĭ�Ϸ���Ȩ��:public static final int MONDAY=1;
	int TUESDAY=2;     //1.���������д--->�淶
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
