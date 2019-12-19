/*选择排序----减少数据的交换,避免打乱数组*/
package 排序;

public class SelectionSort {
	public static void main(String[] args) {
		int key;     //记录最小值
        int index;  //位置---------1.最重要的参数!!!
     	int array[]={5,9,6,8,3,2,1,7,4};
		//执行排序前.
		System.out.println("执行排序前:");
		for(int k=0;k<array.length;k++){    
			System.out.print(array[k]+" ");
		}  
		//
        for(int i=0;i<1;i++){           //执行一趟与冒泡进行比较:没有打乱数组!!
        	index=i;
        	key=array[index];
        	for(int j=i;j<array.length;j++){       		
        		if(key>array[j]){   //小的放前面;
        			index=j;
        			key=array[j];
        		}       			
        		}
			array[index]=array[i]; 
			array[i]=key;
        	}
      //for循环输出
      System.out.println("执行排序后:");
      for(int k=0;k<array.length;k++){    
      	System.out.print(array[k]+" ");
      }                                   
      		//
	}

}
