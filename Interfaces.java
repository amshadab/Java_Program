
interface Exam
{
    int sportMarks=20;
}
class Student
{
    int Roll_no;
    String s_name;
    int m1,m2,m3;
    Student(int Roll_no,String s_name,int m1,int m2,int m3)
    {
        this.Roll_no=Roll_no;
        this.s_name=s_name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
}
class Result extends Student implements Exam
{
    Result(int Roll_no,String s_name,int m1,int m2,int m3)
    {
        super(Roll_no, s_name, m1, m2, m3);
    }
    public void display()
    {
       System.out.println("Total marks: "+(m1+m2+m3+sportMarks));
    }
}
public class Interfaces {

    public static void main(String[] args) {
    Result r = new Result(20, "Sachin", 55, 40 ,78);
    r.display();

        
    }
}