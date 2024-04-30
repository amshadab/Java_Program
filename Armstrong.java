import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int temp=num;
        int rem;
        int arm=0;
        while(num>0)
        {
            rem=num%10;
            arm=(rem*rem*rem)+arm;
            num=num/10;

        }
        if(arm==temp)
        {
            System.out.println(temp+ " is a Armstrong number");
        }
        else
        {
            System.out.println(temp+ " is not Armstrong number");
        }
        sc.close();
    }
}
