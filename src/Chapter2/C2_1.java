package Chapter2;

import java.util.Scanner;

/**
 * Program to convert temperatures to the console
 *
 * @author Ibrahim Matar
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//lets us do more complicated stuff
        System.out.println("The temperature outside in celsius is : ");
        double celsius = input.nextDouble(); //taking the value from keyboard
        //for spacing
        double fahrenheit = 9.0 / 5 * celsius + 32; //celsius to fahrenheit calculator
        System.out.println("The temperature outside in fahrenhiet is : ");
        System.out.println(fahrenheit); //display the temp in fahrenheit
    }
}
