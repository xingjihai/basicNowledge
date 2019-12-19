/**数据类型分为：
 * 1.基本数据类型：
 *    整型：byte short int long 浮点型：float double 字符型：char 布尔型：true flase
 * 2.复合类型：
 *  应用类型String
 * @数据类型
 */
// "a"为string型            'a'为char型；
package 数据类型;

public class DataType {
	public static void main(String[] args) {
		int i=1;
		long m=i;
		double n=i; //          1. 自动类型转换：数据类型位数要低于要转换的数据类型
		
		float j=2.0f;       //1.1float型要加f!!!
        double l=j;            
        
		char k='a';
		int k1=k;           //1.2char
		System.out.println("char‘a’自动类型转换为int后为:"+k1);
		
		char letter1='a';
		char letter2=(char) (letter1+1);//2.强制类型转换
		System.out.println("'a'+1强制类型转换为int后为:"+letter2);
			     
	}
}
