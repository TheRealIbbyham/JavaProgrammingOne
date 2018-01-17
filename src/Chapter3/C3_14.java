package Chapter3;

import java.util.Scanner;

/**
 * Program to guess and see if you got it right
 *
 * @author Ibrahim Matar
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = (int) (Math.random() * 2);//will guess a random number between 1 and 2
        System.out.println("Try to guess correctly heads or tails, 1 is tails, and 0 is heads");
        int y = input.nextInt();
        //for spacing
        if (x == y) { //if else statement determining if you were right
            System.out.println("You were correct!");
        } else {
            System.out.println("You got it wrong. Try Again!");
        }
    }
}
