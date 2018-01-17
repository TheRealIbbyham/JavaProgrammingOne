package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the price of your meal to the console
 *
 * @author Ibrahim Matar
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Subtotal : ");
        double subtotal = input.nextDouble();//taking subtotal from keyboard
        //for spacing
        System.out.println("Gratuity Rate : ");
        double gratuityRate = input.nextDouble() / 100;//taking value from keyboard and making it a percentage
        double gratuity = gratuityRate * subtotal;//calculates gratuity
        //for spacing
        System.out.println("The gratuity is : ");
        System.out.println(gratuity);
        double total = subtotal + gratuity;//the total of the meal
        //for spacing
        System.out.println("The total is : ");
        System.out.println(total);
    }
}
