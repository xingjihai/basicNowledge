/**作用：
 * 1.表示类中的属性和调用方法
 * 2.调用本类中的构造方法
 * 3.表示当前对象
 * @this
 */
package this关键字;
class Person{
	private String name;
	private int age;
	Person(String name,int age){
		this(name);                /**2.调用本类中的构造方法     注意:必须在第一行*/
		//this();
		this.name=name;           /**1.表示类中的属性和调用方法*/
		this.age=age;
	}
	Person(String name){          /**2.1this调用了本构造器*/
		this.name=name;
		System.out.println("构造器2");
	}
	public Person() {
		System.out.println("构造器3");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void tell(){
		System.out.println("姓名:"+name+"   年龄:"+age);
	}
}
public class HelloThis {
	public static void main(String[] args) {
		Person p=new Person("张三", 10);
		p.tell();
	}

}
