package 字符串;
/**查找字符串
 * 判断是否有该字符串
 * 要判断boy是不是后者中的一部分，不用循环，只要用String类的indexOf函数就行了。
 * */
public class FindChar {
	public static void main(String[] args) {
		String s="he is a boy";
		int result=s.indexOf("boy");  //indexOf函数
		if(result>=0){
			System.out.println("boy是he is a boy的一部分");
		}else{
			System.out.println("boy不是he is a boy的一部分");
		}
	}
}