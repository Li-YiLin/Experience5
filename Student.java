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
         return "ѧ������:"+name+"�Ա�:"+sex+"ѧ��:"+studentNumber+"����:"+major+"\n";
    }

}
