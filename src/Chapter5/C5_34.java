package Chapter5;

import java.util.Scanner;

/**
 * Program to play rock, paper, scissors
 *
 * @author Ibrahim Matar
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int comscore = 0;
        int userscore = 0;
        while (1 == 1) {
            if (comscore >= 3) {
                System.out.println("The computer has " + comscore + " wins. The computer has won");
                break;
            } else if (userscore >= 3) {
                System.out.println("You have " + userscore + " wins. You have won");
                break;
            }
            System.out.println("Rock 0, Paper 1,  or Scissors 2?");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("You have picked rock");
            } else if (choice == 1) {
                System.out.println("You have picked paper");
            } else if (choice == 2) {
                System.out.println("You have picked scissors");
            }
            if (choice > 2) {
                System.out.println("That is not a valid option");
            }

            if (choice <= 2 && choice >= 0) {
                int comchoice = (int) (Math.random() * 3);

                switch (comchoice) {
                    case 0:
                        System.out.println("The computer has randomly picked rock");
                        break;
                    case 1:
                        System.out.println("The computer has randomly picked paper");
                        break;
                    case 2:
                        System.out.println("The computer has randomly picked scissors");
                        break;
                    default:
                        break;
                }

                if (choice == 0 && comchoice == 2) {
                    System.out.println("You won, the computer lost. Good job.");
                    userscore++;
                } else if (choice == 1 && comchoice == 0) {
                    System.out.println("You won, the computer lost. Good job.");
                    userscore++;
                } else if (choice == 2 && comchoice == 1) {
                    System.out.println("You won, the computer lost. Good job.");
                    userscore++;
                }

                if (comchoice == 0 && choice == 2) {
                    System.out.println("You lost, the computer won. Good job.");
                    comscore++;
                } else if (comchoice == 1 && choice == 0) {
                    System.out.println("You lost, the computer won. Good job.");
                    comscore++;
                } else if (comchoice == 2 && choice == 1) {
                    System.out.println("You lost, the computer won. Good job.");
                    comscore++;
                }

                if (choice == comchoice) {
                    System.out.println("You both picked the same thing, try again.");
                }
                System.out.println("");
            }
        }
    }
}
