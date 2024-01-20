
//3*3 Matrix Multiplication
import java.util.*;

public class Matrixmul {
    public static void main(String[] args) {
        int num1[][] = new int[3][3];
        int num2[][] = new int[3][3];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter values in First Matrix");
        System.out.print("Enter values in array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num1[i][j] = obj.nextInt();
            }

        }
        System.out.println("Enter values in Second Matrix");
        System.out.print("Enter values in array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num2[i][j] = obj.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((num1[i][j] * num2[i][j]) + " ");
            }
            System.out.println();
        }
        obj.close();
    }
}
