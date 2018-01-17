package Chapter6;

import java.util.Scanner;

/**
 * Program to see if a string follows a set of rules
 *
 * @author Ibrahim Matar
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static int passlength = 8;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("YO Mah Boi your password needs at least eight characters.\n "
                + "D A W G   your password can only contain letters and numbers.\n"
                + "Dont forget HOMESLICE, your password needs at least two numbers.\n"
                + "Enter YO Password: ");
        String pass = input.nextLine();

        if (validpass(pass)) {
            System.out.println(pass + " is a valid password HaMbOnE.");
        } else {
            System.out.println(pass + " is an invalid password HaMbOnE.");
        }
    }

    public static boolean validpass(String password) {
        if (password.length() < passlength) {
            return false;
        }

        int charAmount = 0;
        int numAmount = 0;
        for (int p = 0; p < password.length(); p++) {
            char character = password.charAt(p);

            if (correctnumberamount(character)) {
                numAmount++;
            } else if (correctletteramount(character)) {
                charAmount++;
            } else {
                return false;
            }
        }

        return (charAmount >= 2 && numAmount >= 2);

    }

    public static boolean correctletteramount(char character) {
        character = Character.toUpperCase(character);
        return (character >= 'A' && character <= 'Z');
    }

    public static boolean correctnumberamount(char character) {
        return (character >= '0' && character <= '9');
    }

}
