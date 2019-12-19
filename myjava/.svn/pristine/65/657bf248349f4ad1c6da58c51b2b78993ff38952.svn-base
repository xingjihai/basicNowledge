package 基础知识.数组;

public class ArrayCope {
	public static void main(String[] args) {
		int array1[]={1,2,3,4,5,6};
		int []array2={40,50,60};
		int array3[]=new int[20];
		array3[1]=0;
		for(int i=0;i<20;i++){
			array3[i]=0;
		}
		System.out.println("输出数组array1");
		for(int i=0;i<array1.length;i++){
			System.out.println(array1[i]);
		}
		System.out.println("输出数组array2");
		for(int i=0;i<array2.length;i++){
			System.out.println(array2[i]);
		}
		array2=array1;                           //1.数组拷贝:将array1,array2指向同一个数组array1
		System.out.println("输出数组array1,array2");
		for(int i=0;i<array1.length;i++){
			System.out.println(array1[i]);
		}
		for(int i=0;i<array2.length;i++){
			System.out.println(array2[i]);
		}
		System.arraycopy(array1,0/*从array2的0元素开始*/,array3,3/*从array3的3元素(第四个)开始*/,4/*复制长度:4*/);
		//2.数组拷贝:System.arraycopy()方法
		//System.arraycopy(fromArray--复制的数组,fromIndex--从fromIndex位置开始,toArray--到目标数组,toIndex--到指定位置,length--复制length个元素)
		System.out.println("输出数组array3");
		for(int i=0;i<array3.length;i++){
			System.out.println(array3[i]);
		}
	}

}
