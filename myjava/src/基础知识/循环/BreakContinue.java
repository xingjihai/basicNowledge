/*break��continue*/
package ѭ��;

public class BreakContinue {

	public static void main(String[] args) {
		int k=0;
		//1.
		System.out.println("break:");
		for(int i=0;i<10;i++)
		{
			if(i==5)
				break;                         //1.�������forѭ��
			System.out.print(i+" ");
		}
		System.out.println(); 
		
		//2.
        System.out.println("break kuai:");
		kuai:{
			for(int i=0;i<10;i++){
				if(i==5)
					break kuai;                  //2.ʹ��break�������kuai����				
				System.out.print(i+" ");    
			}	
			System.out.println("û������kuai");   //2.1�����:û�б�ִ��,��������kuai{}
		}
        System.out.println(); 
        
        
        int array[][]=new int[3][10];
		//3.
		System.out.println("continue:");
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				k=k+1;
				if(j==5)
				continue ;               //3.��ϱ���ѭ��,�´�ѭ������
				array[i][j]=k;
			System.out.print(array[i][j]+" ");
			}
			System.out.println();//���黻��
		}
		System.out.println(); 
		
		//4.��������3.��array����
		System.out.println("continue kuai:");
		kuai:                              //4.continue ������{}:��������ѭ���ⲿʹ��continue
			for(int i=0;i<3;i++){
				for(int j=0;j<10;j++){
					if(j==5)
					continue kuai;               //��continue������ǰforѭ��,ִ����ѭ��
				System.out.print(array[i][j]+" ");
				}		
				System.out.println();//���黻��-----�����û�б�ִ�е�,����continue������
			}
		System.out.println(); 
		}
}
