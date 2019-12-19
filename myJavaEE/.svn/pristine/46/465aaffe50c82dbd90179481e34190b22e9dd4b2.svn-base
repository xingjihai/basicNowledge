package 高级应用.文件;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hwpf.extractor.WordExtractor;
import org.junit.Test;

public class OfficeFileParserUtils{
    /** 
     * 使用poi读取doc文件 
     * @param docUrl 
     * doc文件路径 
     * @return 
     * 代表doc文件内容的字符串 
     * @throws IOException 
     */  
    public static void reaDoc(String docPath) throws IOException{  
        FileInputStream in;  
        in = new FileInputStream(docPath);  
        WordExtractor extractor = new WordExtractor(in);  
        //HWPFDocument hwpfDocument = new HWPFDocument(in);  
        //一个元素就是一段内容  
        String[] paraTexts = extractor.getParagraphText();  
          for (int i=0; i<paraTexts.length; i++) {  
            //一段一段的存入  
              System.out.println(/*"Paragraph " + (i+1) + " : " +*/ paraTexts[i]);    
           }   
          extractor.close();
    } 
    public static void reaDoc2(InputStream in) throws IOException{  
        WordExtractor extractor = new WordExtractor(in);  
        //HWPFDocument hwpfDocument = new HWPFDocument(in);  
        //一个元素就是一段内容  
        String[] paraTexts = extractor.getParagraphText();  
          for (int i=0; i<paraTexts.length; i++) {  
            //一段一段的存入  
              System.out.println(/*"Paragraph " + (i+1) + " : " +*/ paraTexts[i]);    
           }   
          extractor.close();
    } 
    public static void reaDoc3(String docPath) throws IOException{  
        String content="";
        String content2="";
        BufferedReader reder=new BufferedReader(new FileReader(docPath));
        while(( content=reder.readLine() )!=null){
            content2+=content;
        }
        System.out.println(content2.getBytes());
        System.out.println(new String(content2.getBytes(), "UTF-8"));
        reder.close();
    } 
    @Test
    public void doc(){
        try {
            reaDoc("C:\\Users\\Administrator\\Desktop\\11\\888.docx");
//            reaDoc("D:\\test\\1.doc");
//            reaDoc3("C:\\Users\\Administrator\\Desktop\\11\\666.docx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}