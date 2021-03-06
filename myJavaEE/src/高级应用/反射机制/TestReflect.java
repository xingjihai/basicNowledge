package 高级应用.反射机制;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


/**
 * 反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
 * @see 参考：http://www.cnblogs.com/lzq198754/p/5780331.html
 */
public class TestReflect {
    public static void main(String[] args) throws Exception {
        operatePropetry();
    }
    
    
    /**
     * 通过一个对象获得完整的包名和类名
     */
    private static void packageAndClassName(){
        TestReflect obj=new TestReflect();
        System.out.println(obj.getClass().getName());
    }
    
    /**
     * 获取类 ---java反射的三种实现方式
     */
    private static void Class()throws Exception {
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // 一般采用这种形式
        class1=Class.forName("高级应用.反射机制.TestReflect");
        class2=new TestReflect().getClass();
        class3=TestReflect.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());
    }
    
    /**
     * 获取实例
     */
    private static void instance()throws Exception {
        //方法一：  要有默认的构造函数
        User user=User.class.newInstance();
        System.out.println(user.toString());
        //方法二： 
        Constructor<?>[]  cons=User.class.getConstructors();
     // 查看每个构造方法需要的参数
        for (int i = 0; i < cons.length; i++) {
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1)
                    System.out.print(clazzs[j].getName());
                else
                    System.out.print(clazzs[j].getName() + ",");
            }
            System.out.println(")");
        }
        // 结果
        // cons[0] ()
        // cons[1] (int,java.lang.String)
        // cons[2] (java.lang.String)
        user = (User) cons[0].newInstance();
        System.out.println(user);
        user = (User) cons[1].newInstance(20, "Rollen");
        System.out.println(user);
        // 结果 User [age=20, name=Rollen]
        user = (User) cons[2].newInstance("Rollen");
        System.out.println(user);
        // 结果 User [age=0, name=Rollen]
    }
    
    /**
     * 获取某个类的全部属性
     */
    private static  void allProperties(){
        Class<?> clazz =Student.class;
        System.out.println("===============本类属性===============");
        // 取得本类的全部属性
        Field[] field = clazz.getDeclaredFields();   //获取所有声明的方法
//        Field[] fields2 = clazz.getFields();   //获取所有public的方法
        for (int i = 0; i < field.length; i++) {
            // 权限修饰符
            int mo = field[i].getModifiers();
            String priv = Modifier.toString(mo);
            // 属性类型
            Class<?> type = field[i].getType();
            System.out.println(priv + " " + type.getName() + " " + field[i].getName() + ";");
        }
         
        System.out.println("==========实现的接口或者父类的属性==========");
        // 取得实现的接口或者父类的属性
        Field[] filed1 = clazz.getFields();
        for (int j = 0; j < filed1.length; j++) {
            // 权限修饰符
            int mo = filed1[j].getModifiers();
            String priv = Modifier.toString(mo);
            // 属性类型
            Class<?> type = filed1[j].getType();
            System.out.println(priv + " " + type.getName() + " " + filed1[j].getName() + ";");
        }
    }
    
    /**
     * 通过反射机制调用某个类的方法
     */
    public static void method() throws Exception{
        Class<?> clazz = Student.class;
        // 调用TestReflect类中的reflect1方法
        Method method = clazz.getMethod("reflect1");
        method.invoke(clazz.newInstance());
        // Java 反射机制 - 调用某个类的方法1.
        // 调用TestReflect的reflect2方法
        method = clazz.getMethod("reflect2", int.class, String.class);
        method.invoke(clazz.newInstance(), 20, "张三");
        // Java 反射机制 - 调用某个类的方法2.
        // age -> 20. name -> 张三
    }
    
    /**
     * 通过反射机制操作某个类的属性
     */
    public static void operatePropetry() throws Exception{
        Class<?> clazz = User.class;
        User obj = (User) clazz.newInstance();
        // 可以直接对 private 的属性赋值
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);  //注意!!!!
        field.set(obj, "赋值");
        System.out.println(field.get(obj));
        System.out.println(   ((User)obj).getName() );
    }
    
    //获取属性注解：http://blog.csdn.net/baidu_18607183/article/details/40980551
}
