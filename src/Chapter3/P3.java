package Chapter3;

import java.util.Scanner;

/**
 * Program to tell you your grades
 *
 * @author Ibrahim Matar
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        //for spacing
        System.out.println("What is your first grade? ");
        double grade1 = input.nextDouble();
        //for spacing
        System.out.println("What is your second grade? ");
        double grade2 = input.nextDouble();
        //for spacing
        if (grade1 < grade2) {
            System.out.println("The first number is less than the second");
        } else if (grade1 > grade2) {
            System.out.println("The first number is greater than the second");
        } else if (grade1 == grade2) {
            System.out.println("The first number is equal to the second");
        } else if (grade1 <= grade2) {
            System.out.println("The first number is less than or equal to the second");
        } else if (grade1 != grade2) {
            System.out.println("The first number is not equal to the second");
        }
        //for spacing
        if (grade2 == 0) {
            System.out.println("Cannot divide by 0");
        } else if (grade1 / grade2 < 1) {
            System.out.println("Proper fraction");
        } else if (grade1 / grade2 >= 1) {
            System.out.println("Improper fraction");
        }
        //for spacing
        if (grade1 >= 90) {
            if (grade1 <= 100) {
                System.out.println("A");
            }
            //for spacing
        } else if (grade1 >= 80) {
            if (grade1 <= 89) {
                System.out.println("B");
            }
        } else if (grade1 >= 70) {
            if (grade1 <= 79) {
                System.out.println("C");
            }
        } else if (grade1 >= 60) {
            if (grade1 <= 69) {
                System.out.println("D");
            }
        } else if (grade1 >= 0) {
            if (grade1 <= 59) {
                System.out.println("F");
            }

        }
        //for spacing
        if (grade2 <= 100) {
            if (grade2 >= 1) {
                System.out.println("In range");
            } else {
                System.out.println("Out of range");
            }

        } else {
            System.out.println("Out of range");
        }
    }
}
