package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a string
 *
 * @author Ibrahim Matar
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String user = input.nextLine();

        System.out.printf("%s reversed is %s.", user, (new StringBuffer(user).reverse().toString()));

    }
}
