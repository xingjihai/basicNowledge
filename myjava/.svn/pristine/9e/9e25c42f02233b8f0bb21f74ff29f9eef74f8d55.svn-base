/**
 * 实现封装性
 */
package 多态和继承;
class person{
	private String name;
	private int age;
	
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
}
class student extends person{
	private int score;

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}


public class GetSet {
	public static void main(String[] args) {
		student s1=new student();
		s1.setName("xiaoming");
		s1.setAge(15);
		s1.setScore(90);
		System.out.println(s1.getName()+s1.getAge()+s1.getScore());
	}

}
