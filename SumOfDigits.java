import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int digit=0;
        while(num!=0)
        {
            num=num/10;
            digit++;
        }
        System.out.println("Sum of Digit: "+digit);
        sc.close();
    }
}
