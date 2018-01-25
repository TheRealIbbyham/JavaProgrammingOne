package Chapter7;
import java.util.Scanner;
/**
 * Program to find smallest number
 *
 * @author Ibrahim Matar
 */
public class C7_9 {
 /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter" + " " + numbers.length + " numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        min(numbers);
    }
    /**
     * min Method
     * @param numbers are the numbers
     * @return min
     */
    private static double min(double[] numbers) {
        double min = numbers[0];
        for (int q = 1; q < numbers.length; q++) {
            if (numbers[q] < min) {
                min = numbers[q];
            }
        }
        System.out.println("Minimum is " + min);
        return min;
    }
}
