package Chapter4;

import java.util.Scanner;

/**
 * Program to see if s2 is a substring of s1
 *
 * @author Ibrahim Matar
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//asking for s1
        System.out.println("Enter string s1: ");
        String s1 = input.next();
//asking for s2
        System.out.println("Enter string s2: ");
        String s2 = input.next();
//checking if s2 is a substring of s1 or not
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }
}
