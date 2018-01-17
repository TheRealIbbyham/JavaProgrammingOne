package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate price of meal with all factors included to the console
 *
 * @author Ibrahim Matar
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The cost of the meal is : ");
        double meal = input.nextDouble();//taking meal cost from keyboard
        //for spacing
        System.out.println("The cost of the drink is : ");
        double drink = input.nextDouble();//taking drink cost from keyboard
        //for spacing
        System.out.println("The cost of the dessert is : ");
        double dessert = input.nextDouble();//taking dessert cost from keyboard
        double subtotal = meal + drink + dessert;//calculating subtotal
        double tax = subtotal * .1;//tax on meal
        double tip = (tax + subtotal) * .15;//how much to tip
        double grandTotal = subtotal + tax + tip;//how much it costs in total
        //for spacing
        System.out.println("The grand total is : ");
        System.out.println(grandTotal);
        //for spacing
        System.out.println("The tax is : ");
        System.out.println(tax);
        //for spacing
        System.out.println("The tip is : ");
        System.out.println(tip);

    }
}
