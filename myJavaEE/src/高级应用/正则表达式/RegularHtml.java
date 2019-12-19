package 高级应用.正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 */
public class RegularHtml {
    public static void main(String[] args) {
        String str = "<p class='xxxx'> Content内容</p>";
        Matcher m = Pattern.compile("<p.*?>([\\s\\S]*)</p>").matcher(str);
        while (m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
        }
    }
    
    /**
     * 去除html标签（直接显示内容）
     */
    public static String getTxtWithoutHTMLElement(String element) {
        if (null == element || "".equals(element.trim())) {
            return element;
        }

        Pattern pattern = Pattern.compile("<[^<|^>]*>");
        Matcher matcher = pattern.matcher(element);
        StringBuffer txt = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group();
            if (group.matches("<[\\s]*>")) {
                matcher.appendReplacement(txt, group);
            } else {
                matcher.appendReplacement(txt, "");
            }
        }
        matcher.appendTail(txt);
        String temp = txt.toString().replaceAll("\n", "");
        temp = temp.replaceAll(" ", "");
        return temp;
    }
}
