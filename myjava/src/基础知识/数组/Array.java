/*数组的  声明,分配空间,初始化,输出*/
package 基础知识.数组;

public class Array {

	public static void main(String[] args) {
		int i;
		int array1[];           //1.声明 (法1
		int []array2,array3;    //     (法2   :可声明多个
		array1=new int[5];     //2.分配空间
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=5;            //3.初始化
		
		int a1[]=new int[5];   //声明+分配空间(1
		int []a2=new int[5];   //         (2
		int a3[]={11,22,33,44,55};  //声明+分配空间+初始化
		System.out.println("array1的长度为:"+array1.length);  //4.length属性(数组的公共变量:数组长度) : _.length
		System.out.println("输出数组array1");
		for(i=0;i<array1.length;i++)   //5.数组的输出,注意array1.length,才可以在不知道数组长度下输出数组,length的应用
		{
		   	System.out.println(array1[i]);   
		}	
		//5.输出:另一中输出方式
		for(i=0;i<array1.length;i++)   
		{
		   	System.out.print(array1[i]+" "); 
		}
		//
	}

}
