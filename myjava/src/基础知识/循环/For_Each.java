/*For-Each---------------ֻ���������,���ܶԼ��ϸ�ֵ!!
   ��ʽ:
 for(��������  ����:���� )
 {����}                  */
package ����֪ʶ.ѭ��;


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
		//----------����,��ʼ����ά����
		
		System.out.println("�������array1:");
		for(int x:array1)
			System.out.print(x+" "); //--------------1.��For-Each���һά����     ע���������Ϊx;
		System.out.println();//������for-eachѭ��
		
		System.out.println("�������array2:");
		for(int x[]:array2){
			for(int y:x)
			   System.out.print(y+" ");//-------------2.��For-Each�����ά����     ע���������Ϊy;
			System.out.println();  //������for-eachѭ��
		}
		
		breakDemo(array2);
	}
	
	/**
	 * break
	 */
	public static void breakDemo(int[][] array2){
	    first:for(int[] x : array2){
	        two:for(int y:x){
	            System.out.println("���y:"+y);
//	            break first;
	            break two;
	        }
        }
	}

}
