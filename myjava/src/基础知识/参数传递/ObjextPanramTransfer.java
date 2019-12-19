/**2.对象 类型的参数传递:看图片笔记才能明白(传递的是对象,即类的实例,数据类型可以是string,int等)
 * 1) 传递(拷贝)一个引用:指向同一个对象
 * 2)对对象的操作都改变了实际的对象会影响原对象,但是对参数的操作并不能影响原来的对象引用.
 * */
package 基础知识.参数传递;
class Time{
	public int hour;
}
public class ObjextPanramTransfer {
    Time time1;
	private Time time2;//ObjextPanramTransfer的属性(成员)
	public static void main(String[] args) {
		ObjextPanramTransfer text=new ObjextPanramTransfer();
		text.time1=new Time();
		text.time1.hour=12;
		//	可直接:	Time time3=new Time(); 不用声明类:ObjextPanramTransfer!!!!
		text.method(text.time1);
		System.out.println("改变t后,time的值:"+text.time1.hour);
		//     ------------------------------------------- 1.结果可见,t改变后time的值也改变了,因为他们指向同一个对象;
		
		text.time2=new Time();
		text.time2.hour=00;
		//error:System.out.println("交换前:   time1"+time1+"  time2:"+time2);不能对非静态字段 time2 进行静态引用
		System.out.println("交换前:   time1:"+text.time1.hour+"  time2:"+text.time2.hour); //应加上:text.time2
		text.swap(text.time1, text.time2);
		System.out.println("交换后:   time1:"+text.time1.hour+"  time2:"+text.time2.hour);
		//--------------------------------------3.由结果可知t1,t2交换,但time1,time2没有交换.
		//                                       原因:t1,t2的引用做了交换,但没有影响到time1,time2.
	}
	void method(Time t){
		System.out.println("t的值为:"+t.hour);
		System.out.println("t和time指向同一个对象?"+(t.equals(this.time1)));
		t.hour=14;
		System.out.println("改变t后t的值为:"+t.hour);
	}
	void swap(Time t1,Time t2){ //-----------------------2.交换:对象类型中交换的是引用
		System.out.println("交换前:   t1:"+t1.hour+"  t2:"+t2.hour);
		Time s;
		s=t1;
		t1=t2;
		t2=s;
		System.out.println("交换后:   t1:"+t1.hour+"  t2:"+t2.hour);
	}
}
