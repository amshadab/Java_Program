import java.util.Scanner;
import java.util.Random;

import static java.lang.System.exit;

public class RockPaperScissor {
private int user;
private int randomNumbers;
public RockPaperScissor(int user,int randomNumbers){
    this.user=user;
    this.randomNumbers=randomNumbers;
}

public void execute(){

        switch (user) {
            case 1: {
                if (randomNumbers == 2) {
                    System.out.println("You: Rock\nComputer: Paper\nComputer Wins");
                } else if (randomNumbers == 1) {
                    System.out.println("You: Rock\nComputer: Rock\nTie");
                } else if (randomNumbers == 3) {
                    System.out.println("You: Rock\nComputer: Scissor\nYou Wins");
                }
                break;
            }
            case 2: {
                if (randomNumbers == 2) {
                    System.out.println("You: Paper\nComputer: Paper\nTie");
                } else if (randomNumbers == 1) {
                    System.out.println("You: Paper\nComputer: Rock\nYou Wins");
                } else if (randomNumbers == 3) {
                    System.out.println("You: Paper\nComputer: Scissor\nComputer Wins");
                }
                break;
            }
            case 3: {
                if (randomNumbers == 3) {
                    System.out.println("You: Scissor\nComputer: Scissor\nTie");
                } else if (randomNumbers == 1) {
                    System.out.println("You: Scissor\nComputer: Rock\nComputer Wins");
                } else if (randomNumbers == 2) {
                    System.out.println("You: Scissor\nComputer: Paper\nYou Wins");
                }
                break;
            }
            case 4: {
                exit(0);
            }
            default:
                System.out.println("Invalid choice");
        }

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int user;
        do {

            System.out.println("1.Rock\n2.Paper\n3.Scissor\n4.Exit");
            System.out.print("Enter your choice: ");
            user=sc.nextInt();

            int randomNumbers = rand.nextInt(1, 4);
            RockPaperScissor rockPaperScissor = new RockPaperScissor(user, randomNumbers);
            rockPaperScissor.execute();

        }while (user!=4);



    }
}
