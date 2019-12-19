package 高级应用.正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 */
public class Regular {
    public static void main(String[] args) {
//        String shortName="_short";
//        String filePath="(2017)闽0203民初5000号";
//        String pattern = "[0-9]+号";
//        String thumbPath = "$1" + shortName + "$2$3";
//        Pattern p = Pattern.compile("[0-9]+号", 2 | Pattern.DOTALL);
////        System.out.println(p.compile(pattern).matcher(filePath).);
//        //System.out.println(p.flags());
//        Matcher m = p.matcher(filePath);
//        while (m.find()) {
////            String s = m.replaceAll(thumbPath);
//            String s = m.replaceAll("$1");
//            m.start(0);
////            System.out.println(s);
////            System.out.println("group1="+m.group(0));
////            System.out.println("group2="+m.group(1));
//        }
//        System.out.println( p.compile(filePath, 1) );
//        System.out.println(p.flags());
        
        
        String arr="(2017)粤02民157号";
        String year=arr.trim().substring(1, 5);
        Pattern p = Pattern.compile("[0-9]+号", 2 | Pattern.DOTALL);
        Matcher m = p.matcher(arr.trim());
        String case_words="";
        while (m.find()) {
            System.out.println("号："+m.group(0));
            case_words=arr.trim().substring(6, m.start(0));
        }
        System.out.println("year="+year);
        System.out.println("case_words="+case_words);
        
        
        
        
    }
}
