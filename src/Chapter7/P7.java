package Chapter7;
import java.util.Scanner;
/**
 * Program to find amount of numbers to read in
 *
 * @author Ibrahim Matar
 */
public class P7 {
 /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to read in? ");
        int[] numbers = new int[input.nextInt()];
        System.out.print(" Enter " + numbers.length + " numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            int sum = numbers[i];

            double average = sum / numbers.length;

            System.out.println("The average is: " + average);

        }

    }
}
