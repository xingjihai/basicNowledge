package 高级应用.原型模式;

import java.util.ArrayList;
import java.util.List;

/** ============  深拷贝
深拷贝与浅拷贝问题中，会发生深拷贝的有java中的8中基本类型以及他们的封装类型，另外还有String类型。其余的都是浅拷贝。
需要我们自己实现深拷贝
 * @author wyj
 */
class Prototype2 implements Cloneable {
    private String str;
    private List<String> list;
    private List<Student> list2;
    private Student student;
    public Prototype2 clone(){    //============  深拷贝
        Prototype2 prototype = null;  
        try{  
            prototype = (Prototype2)super.clone();
            prototype.student=(Student) this.student.clone();   //============  深拷贝
        }catch(CloneNotSupportedException e){  
            e.printStackTrace();  
        }  
        return prototype;   
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public List<Student> getList2() {
        return list2;
    }
    public void setList2(List<Student> list2) {
        this.list2 = list2;
    }
    
}  
  
class ConcretePrototype2 extends Prototype2{  
    public void show(){  
        System.out.println(this.getStr());
        System.out.println(this.getStudent().getName());
    }  
}  
  
public class PrototypePattern2 {  
    public static void main(String[] args){  
        ConcretePrototype2 cp = new ConcretePrototype2();  
        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        cp.setList(list);
        cp.setStr("原型");
        cp.setStudent(new Student("学生1","男",12));
        List<ConcretePrototype2> cloneList=new ArrayList<>();
        for(int i=0; i< 10; i++){  
            ConcretePrototype2 clonecp = (ConcretePrototype2)cp.clone();  
            clonecp.setStr("第"+i+"个");
            clonecp.getStudent().setName("学生"+i);    //============  深拷贝
            cloneList.add(clonecp);
        }
        for (ConcretePrototype2 concretePrototype : cloneList) {
            concretePrototype.show();
        }
    }  
}  