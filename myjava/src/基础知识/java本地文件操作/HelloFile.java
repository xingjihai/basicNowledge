/**
 * @ 
 * file��ķ���:
 * file(String pathname)//�ļ�·��:eg:file("bin/hello.txt"),
 *                                  file("../bin/hello.txt")-->..��ʾbin����һ���ļ�
 * file(URI uti)//���ݵľ�����Դ��λ����
 * file(File parent,String child)//�ļ���parentָ��Ϊ��ǰ�ļ���ĸ���,child-->��ǰ�ļ�������
 * file(String parent,String child)//�÷�ͬ��
 */
package java�����ļ�����;

import java.io.File;

/**
 * 读取文件方法大全:http://www.cnblogs.com/lovebread/archive/2009/11/23/1609122.html
 * @author Administrator
 *
 */
public class HelloFile {
	public static void main(String[] args) {
		File file=new File("hello.txt");
	}

}
