package 高级应用.文件;
public class StringToRtfUtil{
    public static String chineseStrTortf(String content){
        StringBuffer sb = new StringBuffer("");
        if (content == null) return null;
        for (char c : content.toCharArray()) {
             if(isChinese(c)){
                 System.out.println(c);
                 sb.append(strToRtf(String.valueOf(c)));
             }else{
                 sb.append(c);
             }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(chineseStrTortf("1）在合同有效期内，乙方为甲方提供简历库下载的用户名与初始密码"));
    }
    public static byte[] charToByte(char c) { 
        byte[] b = new byte[2]; 
        b[0] = (byte) ((c & 0xFF00) >> 8); 
        b[1] = (byte) (c & 0xFF); 
        
        return b; 
    }
    public static boolean isChinese(char c) {
//          return c >= 0x4E00 &&  c <= 0x9FA5;// 根据字节码判断
          
          Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
            if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                    || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
                    || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                    || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
                return true;
            }
            return false;
    }
    public static String strToRtf(String content) {

        StringBuffer sb = new StringBuffer("");
        try {
            char[] digital = "0123456789ABCDEF".toCharArray();
            byte[] bs = null;
            bs = content.getBytes("GB2312");
            int bit;
            for (int i = 0; i < bs.length; i++) {
                bit = (bs[i] & 0x0f0) >> 4;
                sb.append("\\'");
                sb.append(digital[bit]);
                bit = bs[i] & 0x0f;
                sb.append(digital[bit]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    public static String byteToRtf(byte[] bs) {

        StringBuffer sb = new StringBuffer("");
        try {
            char[] digital = "0123456789ABCDEF".toCharArray();
            int bit;
            for (int i = 0; i < bs.length; i++) {
                bit = (bs[i] & 0x0f0) >> 4;
                sb.append("\\'");
                sb.append(digital[bit]);
                bit = bs[i] & 0x0f;
                sb.append(digital[bit]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}