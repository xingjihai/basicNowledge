/*ѡ������----�������ݵĽ���,�����������*/
package ����;

public class SelectionSort {
	public static void main(String[] args) {
		int key;     //��¼��Сֵ
        int index;  //λ��---------1.����Ҫ�Ĳ���!!!
     	int array[]={5,9,6,8,3,2,1,7,4};
		//ִ������ǰ.
		System.out.println("ִ������ǰ:");
		for(int k=0;k<array.length;k++){    
			System.out.print(array[k]+" ");
		}  
		//
        for(int i=0;i<1;i++){           //ִ��һ����ð�ݽ��бȽ�:û�д�������!!
        	index=i;
        	key=array[index];
        	for(int j=i;j<array.length;j++){       		
        		if(key>array[j]){   //С�ķ�ǰ��;
        			index=j;
        			key=array[j];
        		}       			
        		}
			array[index]=array[i]; 
			array[i]=key;
        	}
      //forѭ�����
      System.out.println("ִ�������:");
      for(int k=0;k<array.length;k++){    
      	System.out.print(array[k]+" ");
      }                                   
      		//
	}

}
