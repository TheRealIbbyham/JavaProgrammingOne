package Chapter3;

import java.util.Scanner;

/**
 * Program to see if a number is divisible by another number
 *
 * @author Ibrahim Matar
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = input.nextInt();//takes value from keyboard
//for spacing
        if (x % 5 == 0 && x % 6 == 0) {//checking if your balue is divisible by these
            System.out.println("Is " + x + " divisible by 5 and 6? true");
        } else {
            System.out.println("Is " + x + " divisible by 5 and 6? false");
        }
        //for spacing
        if (x % 5 == 0 || x % 6 == 0) {//checking if your balue is divisible by these
            System.out.println("Is " + x + " divisible by 5 or 6? true");
        } else {
            System.out.println("Is " + x + " divisible by 5 or 6? false");
        }
        //for spacing
        if (x % 5 == 0 ^ x % 6 == 0) {//checking if your balue is divisible by these
            System.out.println("Is " + x + " divisible by 5 or 6, but not both? true");
        } else {
            System.out.println("Is " + x + " divisible by 5 or 6, but not both? false");
        }
    }
}
