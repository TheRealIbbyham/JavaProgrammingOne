package Chapter6;

import java.util.Scanner;

/**
 * Program to make monetary exchange
 *
 * @author Ibrahim Matar
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many Euros are in a Dollar? ");
        double euros = input.nextDouble();

        System.out.println("How many Pound Sterling will a Dollar buy? ");
        double pounds = input.nextDouble();

        System.out.println("How many Yen will a Dollar buy? ");
        double yen = input.nextDouble();

        String answer;
        do {
            System.out.println("Enter number of dollars: ");
            double numbdollars = input.nextDouble();

            System.out.println("Enter 'E' for Euros. 'P' for Pounds. Or 'Y' to buy Yen.");
            String currencytype = input.next().toUpperCase();

            switch (currencytype) {
                case "E":
                    double euroBought = convert(numbdollars, euros);
                    System.out.printf("For %.2f dollars, you will get %.2f Euros.", numbdollars, euroBought);
                    break;
                case "P":
                    double poundBought = convert(numbdollars, pounds);
                    System.out.printf("For %.2f dollars, you will get %.2f Pound Sterlings.", numbdollars, poundBought);
                    break;
                case "Y":
                    double yenBought = convert(numbdollars, yen);
                    System.out.printf("For %.2f dollars, you will get %.2f Yen.", numbdollars, yenBought);
                    break;
            }

            System.out.println("\n Would you like to perform another conversion? ");
            answer = input.next().toLowerCase();
            while (!answer.equals("no") && !answer.equals("yes")) {
                System.out.println("Enter \"yes\" to keep going, or \"no\" to stop.");
                answer = input.next().toLowerCase();
            }
        } while (!answer.equalsIgnoreCase("no"));
    }

    public static double convert(double dollars, double number2) {
        if (dollars > 100) {
            double newDollars = (dollars * 0.95);
            double newBought = (newDollars * number2);
            return newBought;
        } else {
            double newDollars = (dollars * 0.90);
            double newBought = (newDollars * number2);
            return newBought;
        }
    }
}
