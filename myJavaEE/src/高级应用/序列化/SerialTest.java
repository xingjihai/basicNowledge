package 高级应用.序列化;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化测试类
 * 来源：http://www.cnblogs.com/amunote/p/4171799.html
 * @author robin
 * @date 2014年12月18日
 */
public class SerialTest {

    public static void main(String[] args) {
//        Person robin = new Person("robin", 29);
//        String savePath = "object.txt";
//
//        SerialTest test = new SerialTest();
//
//        try {
//            test.serialize(robin, savePath);
//            Person person = (Person) test.deSerialize(savePath);
//            System.out.println("Name:" + person.getName() + "   Age:"
//                    + person.getAge());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        
        
        Person robin = new Person("robin", 29);
        School school = new School("XX学校");
        
        Teacher tRobin = new Teacher(robin);
        tRobin.setSchool(school);
        tRobin.setSalary(12.0);
        
        String savePath = "object.txt";

        SerialTest test = new SerialTest();

        try {
            test.serialize(savePath, tRobin);
            
            Teacher t = (Teacher) test.deSerialize(savePath);
            System.out.println("Name:" + t.getPerson().getName()
                             +" Salary:" + t.getSalary());
//            System.out.println("School:"+t.getSchool().getName());  //school需要序列化才能读写出来
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 实现序列化
     * 
     * @param obj
     *            要被序列化保存的对象
     * @param path
     *            保存地址
     * @throws IOException
     */
    public void serialize(String path,Object obj) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(obj);
        } finally {
            if (null != oos)
                oos.close();
        }
    }

    /**
     * 反序列化取出对象
     * 
     * @param path
     *            被序列化对象保存的位置
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deSerialize(String path) throws IOException,
            ClassNotFoundException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(path));
            return ois.readObject();
        } finally {
            if (null != ois)
                ois.close();
        }
    }

}

/**
 * 序列化测试用对象
 * 
 * @author robin
 * @date 2014年12月18日
 */
class Person implements Serializable {

    private static final long serialVersionUID = -6412852654889352693L;

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


/**
 * Teacher类
 * @author robin
 * @date 2014年12月18日
 */
class Teacher implements Serializable{
    
    private static final long serialVersionUID = -8751853088437904443L;
    
    private Person person;
    private transient School school;
    private transient double salary;
    
    public Teacher(Person person){
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}


/**
 * School类，不可序列化
 * 
 * @author robin
 * @date 2014年12月18日
 */
class School{
    private String name;
    
    public School(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}