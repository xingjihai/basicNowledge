package 高级应用.正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * 正则表达式
 */
public class Regular2 {
    public static final String REGEX="foo";
    public static final String INPUT="fooooofoooooooooo";
    public static final String INPUT2="ooooofoooooooooo";
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(REGEX);
        Matcher matcher1=pattern.matcher(INPUT);
        Matcher matcher2=pattern.matcher(INPUT2);
        
        StringBuffer sb=new StringBuffer();
//        while(matcher1.find()){
//            System.out.println(matcher1.group(0));
//            matcher1.appendReplacement(sb, "--");
//            System.out.println(sb.toString());
//            System.out.println(sb.hashCode());
//        }
//        matcher1.appendTail(sb);
        while(matcher2.find()){
            System.out.println(matcher2.group(0));
            System.out.println( matcher2.start() ); 
            System.out.println( matcher2.end() );
            matcher2.appendReplacement(sb, "--");
            System.out.println(sb.toString());
            System.out.println(sb.hashCode());
        }
//        matcher2.appendTail(sb);
        
    }
}
