/*二维数组*/
package 数组;

public class TwoArray {
	public static void main(String[] args) {
		
		int twoD1[][]={
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};//-----------------------------     一.赋值法1
		
		
		int twoD2[][]=new int[4][5];
		int k=1;
		for(int i=0;i<twoD2.length;i++)      //2.1给行赋值:  twoD.length!
		{
			for(int j=0;j<twoD2[i].length;j++)  //2.2给列赋值:  twoD[i].length!
			{
				twoD2[i][j]=k++;
			}
		}//-----------------------------     二.赋值法2
		
		System.out.println("输出数组twoD1:");
		for(int i=0;i<twoD1.length;i++){
			for(int j=0;j<twoD1[i].length;j++){
				System.out.print(twoD1[i][j]+" ");
			}
			System.out.println();
		}//----输出数组twoD1
		
		System.out.println("输出数组twoD2:");
		for(int i=0;i<twoD2.length;i++){
			for(int j=0;j<twoD2[i].length;j++){
				System.out.print(twoD2[i][j]+" ");
			}
			System.out.println();
		}//----输出数组twoD2
		
		
		
		//----------------------------------三.不规则数组
		System.out.println("不规则数组twoD3");
		int l=0;
		int twoD3[][]=new int[3][];
		twoD3[0]=new int[1];
		twoD3[1]=new int[2];
		twoD3[2]=new int[3];
		for(int i=0;i<twoD3.length;i++)
		{
			for(int j=0;j<twoD3[i].length;j++){
				twoD3[i][j]=l++;
			}
		}
		for(int x[]:twoD3){
			for(int y:x){
				System.out.print(y+" ");			
			}
			System.out.println();
		}
	}

}
