package 高级应用.原型模式;

class Student implements Cloneable{
    private String name;
    private String sex;
    private Integer age;
    public Student(String name,String sex,Integer age) {
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    public Student clone(){    //============  深拷贝
        Student prototype = null;  
        try{  
            prototype = (Student)super.clone();
        }catch(CloneNotSupportedException e){  
            e.printStackTrace();  
        }  
        return prototype;   
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    
}
