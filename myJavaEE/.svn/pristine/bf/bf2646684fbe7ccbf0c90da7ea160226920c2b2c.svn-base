package 高级应用.原型模式;

import java.util.ArrayList;
import java.util.List;

/** ============  浅拷贝
深拷贝与浅拷贝问题中，会发生深拷贝的有java中的8中基本类型以及他们的封装类型，另外还有String类型。其余的都是浅拷贝。
需要我们自己实现深拷贝
 * @author wyj
 */
class Prototype implements Cloneable {
    private String str;
    private List<String> list;
    private List<Student> list2;
    private Student student;
    public Prototype clone(){    //============  浅拷贝
        Prototype prototype = null;  
        try{  
            prototype = (Prototype)super.clone();  
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
  
class ConcretePrototype extends Prototype{  
    public void show(){  
        System.out.println(this.getStr());
        System.out.println(this.getStudent().getName());
    }  
}  
  
public class PrototypePattern {  
    public static void main(String[] args){  
        ConcretePrototype cp = new ConcretePrototype();  
        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        cp.setList(list);
        cp.setStr("原型");
        cp.setStudent(new Student("学生1","男",12));
        List<ConcretePrototype> cloneList=new ArrayList<>();
        for(int i=0; i< 10; i++){  
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();  
            clonecp.setStr("第"+i+"个");
            clonecp.getStudent().setName("学生"+i);    //修改的引用对象的属性,对其他ConcretePrototype对象中的student造成了影响  ---------浅拷贝
            cloneList.add(clonecp);
        }
        for (ConcretePrototype concretePrototype : cloneList) {
            concretePrototype.show();
        }
    }  
}  