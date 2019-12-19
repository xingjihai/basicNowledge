/*冒泡排序--编程容易*/
package 排序;

public class BubbleSort {
	public static void main(String[] args) {
		int array[]={5,9,6,8,3,2,1,7,4};
		int temp;
		//执行排序前.
		System.out.println("执行排序前:");
		for(int k=0;k<array.length;k++){    
			System.out.print(array[k]+" ");
		}  
		//
		for(int i=0;i<1;i++){         //第i趟         执行一趟与选择进行比较
			for(int j=i;j<array.length;j++){     //第j个                         1.注意j=i开始
				if(array[i]>array[j]){           //比较
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;         //交换,temp为中间量.
				}
			}
		}
		//for循环输出
		System.out.println("执行排序后:");
		for(int k=0;k<array.length;k++){    
			System.out.print(array[k]+" ");
		}                                   
		//
	}

}
