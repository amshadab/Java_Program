import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int flag=0;
        for(int i=2;i<=n;i++)
      {
        if(n%i==0)
        {
            flag++;
            if(flag>1)
            {
              break;
            }
        }
      }
      if(flag==1)
      {
        System.out.println(n + " is Prime a number");
      }
      else{
        System.out.println(n +" is not Prime a number");
      }
    }
}
