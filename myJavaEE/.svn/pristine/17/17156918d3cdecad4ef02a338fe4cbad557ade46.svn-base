package 高级应用.文件;
import java.io.*;  
  
import javax.swing.text.BadLocationException;  
import javax.swing.text.DefaultStyledDocument;  
import javax.swing.text.rtf.*;  
  
/** 读取rtf文件（但是有中文乱码，而且有些读取不到。）
 */  
public class AccessRTF {  
    String text;  
    DefaultStyledDocument dsd;  
    RTFEditorKit rtf;  
    public static void main(String[] args) {  
       
        try {
            readRtf(  new FileInputStream( new File("D:\\test\\12.rtf") ) );
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
//        writeRtf(new File("e:\\out.rtf"));  
    }  
    public static void readRtf(InputStream in) {  
        RTFEditorKit rtf=new RTFEditorKit();  
        DefaultStyledDocument dsd=new DefaultStyledDocument();  
        try {  
            rtf.read(in, dsd, 0);  
//            String text = dsd.getText( 0, dsd.getLength() );  
//            text=StringToRtfUtil.chineseStrTortf(text);
//            String text = new String( dsd.getText( 0, dsd.getLength() ).getBytes("Unicode") );  
            String text = new String( dsd.getText( 0, dsd.getLength() ).getBytes("GB2312") );  
//            String text = new String( dsd.getText( 0, dsd.getLength() ).getBytes("GBK") );  
//            String text = new String( dsd.getText( 0, dsd.getLength() ).getBytes("UTF-8") );  
//            String text = new String( dsd.getText( 0, dsd.getLength() ).getBytes("ISO8859_1") );  
            System.out.println(text);  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (BadLocationException e) {  
            e.printStackTrace();  
        } catch (Exception e) {
            e.printStackTrace(); 
        }
  
    }  
    public static void writeRtf(RTFEditorKit rtf, OutputStream out,DefaultStyledDocument dsd) {  
        try {  
            rtf.write(out, dsd, 0, dsd.getLength());  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (BadLocationException e) {  
            e.printStackTrace();  
        }  
    }  
}