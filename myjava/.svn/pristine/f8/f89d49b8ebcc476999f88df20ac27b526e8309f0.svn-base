/*break和continue*/
package 循环;

public class BreakContinue {

	public static void main(String[] args) {
		int k=0;
		//1.
		System.out.println("break:");
		for(int i=0;i<10;i++)
		{
			if(i==5)
				break;                         //1.打断整个for循环
			System.out.print(i+" ");
		}
		System.out.println(); 
		
		//2.
        System.out.println("break kuai:");
		kuai:{
			for(int i=0;i<10;i++){
				if(i==5)
					break kuai;                  //2.使用break语句跳出kuai语句块				
				System.out.print(i+" ");    
			}	
			System.out.println("没有跳出kuai");   //2.1结果中:没有被执行,即跳出了kuai{}
		}
        System.out.println(); 
        
        
        int array[][]=new int[3][10];
		//3.
		System.out.println("continue:");
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				k=k+1;
				if(j==5)
				continue ;               //3.打断本次循环,下次循环继续
				array[i][j]=k;
			System.out.print(array[i][j]+" ");
			}
			System.out.println();//数组换行
		}
		System.out.println(); 
		
		//4.引用上面3.的array数组
		System.out.println("continue kuai:");
		kuai:                              //4.continue 不能有{}:即不能在循环外部使用continue
			for(int i=0;i<3;i++){
				for(int j=0;j<10;j++){
					if(j==5)
					continue kuai;               //用continue跳出当前for循环,执行外循环
				System.out.print(array[i][j]+" ");
				}		
				System.out.println();//数组换行-----结果中没有被执行到,都被continue跳过了
			}
		System.out.println(); 
		}
}
