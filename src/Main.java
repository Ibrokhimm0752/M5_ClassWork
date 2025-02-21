//import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      //  Scanner in = new Scanner(System.in);
        String menuChoice = "";
        boolean done = false;
        do {

            System.out.println("B-Back \t u-Up \t D-Down \t F-Forward \t Q-Quit \n Choose your move:");
            menuChoice = in.nextLine();
            menuChoice = menuChoice.toUpperCase();

            switch (menuChoice) {
                case "B":
                    System.out.println("You choose Back!");
                    break;
                case "U":
                    System.out.println("You choose Up!");
                    break;
                case "D":
                    System.out.println("You choose Down!");
                    break;
                case "F":
                    System.out.println("You choose Forward!");
                    break;
                case "Q":
                    System.out.println("You choose Quit!");
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice! " + menuChoice + " must be [B, U, D, F, Q]");
            }

        } while (!done);
   /*     if(menuChoice.equalsIgnoreCase( "B"))
        {
            System.out.println("you choose Back!");
        }
        else if (menuChoice.equalsIgnoreCase( "U"))
        {
            System.out.println("you choose Up!");
        }

        else if (menuChoice.equalsIgnoreCase( "D"))

        {
            System.out.println("you choose Down!");
        }
        else if(menuChoice.equalsIgnoreCase( "F"))

        {
            System.out.println("you choose Forward!");
        }
        else if (menuChoice.equalsIgnoreCase( "Q"))

        {
            System.out.println("you choose Quit!");
        }
        else
           System.out.println("Invalid choice! \" + menuChoice + \" must be [B, U, D, F, Q]");


    }
}