/*For-Each---------------只能用来输出,不能对集合赋值!!
   格式:
 for(数据类型  变量:集合 )
 {语句块}                  */
package 基础知识.循环;


public class For_Each {
	public static void main(String[] args) {
		int array1[]={1,2,3,4,5,6};
		//
		int array2[][]=new int[3][3];
		int k=1;
		for(int i=0;i<array2.length;i++){
			for(int j=0;j<array2[i].length;j++)
				array2[i][j]=k++;
		}
		//----------声明,初始化二维数组
		
		System.out.println("输出数组array1:");
		for(int x:array1)
			System.out.print(x+" "); //--------------1.用For-Each输出一维数组     注意输出变量为x;
		System.out.println();//已跳出for-each循环
		
		System.out.println("输出数组array2:");
		for(int x[]:array2){
			for(int y:x)
			   System.out.print(y+" ");//-------------2.用For-Each输出二维数组     注意输出变量为y;
			System.out.println();  //已跳出for-each循环
		}
		
		breakDemo(array2);
	}
	
	/**
	 * break
	 */
	public static void breakDemo(int[][] array2){
	    first:for(int[] x : array2){
	        two:for(int y:x){
	            System.out.println("输出y:"+y);
//	            break first;
	            break two;
	        }
        }
	}

}
