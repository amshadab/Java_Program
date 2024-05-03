import java.util.Scanner;

class Student
{
    int id=0;
    String name;
    public void SetData()
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student name: ");
        name = sc.nextLine();
    
      
        
    }
    public void display()
    {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
}
public class ArrayOfObject {
    public static void main(String[] args) {
        Student[] obj = new Student[5];
        for(int i=0;i<5;i++)
        {
            obj[i]=new Student();
            obj[i].SetData();
        }
        for(int i=0;i<5;i++)
        {
            obj[i].display();
        }
        
        
    }
}
