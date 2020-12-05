package Experience1;

public class Student {
    String name;
    String studentNumber;
    String sex;
    String major;
    Student(){}
    Student(String name,String studentNumber,String sex){
        this.name = name;
        this.studentNumber = studentNumber;
        this.sex = sex;
    }
    void setMajor(String major){
        this.major = major;
    }
    public String toString(){
         return "学生姓名:"+name+"性别:"+sex+"学号:"+studentNumber+"主修:"+major+"\n";
    }

}
