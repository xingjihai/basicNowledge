package 高级应用.反射机制;

import java.util.Map;

public class ObjectUtil {
    
    /**
     * 变量对象的所有属性和值 
     * @throws Exception 
     */
    public static void ergodicObject(Object obj) throws Exception{
//        Class<?> clazz=obj.getClass();
//        Field[] fields= clazz.getDeclaredFields();
//        for (Field field : fields) {
//            field.setAccessible(true);
//            System.out.println( field.getName() + "="+field.get(obj));
//        }
//        Field[] parentfields= clazz.getFields(); //(继承的属性)
//        for (Field field : parentfields) {
//            field.setAccessible(true);
//            System.out.println( field.getName() + "="+field.get(obj));
//        }
        Map<String, String> map=org.apache.commons.beanutils.BeanUtils.describe(obj);
        for (String key  : map.keySet()) {
            System.out.println(key+"="+map.get(key));
        }
    }
    
    
    public static void main(String[] args) throws Exception {
        Student student=new Student();
        student.setAge(1);
        student.setGrade("77");
        
        ergodicObject(student);
    }
}
