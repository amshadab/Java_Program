import java.util.Scanner;

class NegativeSalary extends Exception
{
  NegativeSalary(String msg)
  {
    super(msg);
  }
}
public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee name: ");
        String name=sc.next();
        System.out.print("Enter Employee salary: ");
        int sal = sc.nextInt();
        try{
            System.out.println("Employee: "+name);
            if(sal<0)
            {
                throw new NegativeSalary("Invalid Salary");
            }
            else
            {
                System.out.println("Salary: "+sal);
            }
        }catch(NegativeSalary n)
        {
            System.out.println(n);
        }catch(Exception e)
        {
            System.out.println(e);
        }
      finally
      {
        sc.close();
      }
    }
}
