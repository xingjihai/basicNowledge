package �ַ���;
/**�����ַ���
 * �ж��Ƿ��и��ַ���
 * Ҫ�ж�boy�ǲ��Ǻ����е�һ���֣�����ѭ����ֻҪ��String���indexOf���������ˡ�
 * */
public class FindChar {
	public static void main(String[] args) {
		String s="he is a boy";
		int result=s.indexOf("boy");  //indexOf����
		if(result>=0){
			System.out.println("boy��he is a boy��һ����");
		}else{
			System.out.println("boy����he is a boy��һ����");
		}
	}
}