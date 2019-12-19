/**1.private:只有本类可见    ,子类不可继承该属性                                           ---只能放类内部
 * 2.protected:(本类,子类,)同一包的类可见,包外可继承
 * 3.默认(无修饰符):(本类,)同一包的类可见,包外不可继承
 * 4.public:对任何类可见
 * @
 */
package 可见不可见性;


public class Test {
	
	public static void main(String[] args) {
		Test2 te=new Test2();                  /**2. Test2为public类型:对任何类可见           /myjava/src/可见不可见性/Test2.java*/
		//error:Test22 te2=new test22;    1.2 Test22对外不可见.
		Test3 tw=new Test3();                   /**3. Test3 为默认类型:对本类.同一包可见         /myjava/src/可见不可见性/Test2.java*/ 
	tw.age=1;
	/**error: tw.name=2;   private类型不可视*/
	tw.t3print1();
	tw.t3print2();
	/**error: tw.t3print3();  private类型不可视*/
	}
}
