package Chapter5;

import java.util.Scanner;

/**
 * Program to vote on things
 *
 * @author Ibrahim Matar
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Yes = 0;
        int No = 0;
        while (1 == 1) {
            System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting : ");
            String vote = input.nextLine().toUpperCase();
            char s = vote.charAt(0);

            if (s != ('Y') || s != ('N')) {
                switch (s) {
                    case 'Y':
                        ++Yes;
                        break;
                    case 'N':
                        ++No;
                        break;
                    case 'Q':
                        System.out.println("Yes votes = " + Yes + " No votes = " + No);
                        System.exit(0);
                    default:
                        System.out.println("INVALID INPUT HOMIE TRY AGAIN SON.");
                        break;
                }
            }
        }
    }
}
