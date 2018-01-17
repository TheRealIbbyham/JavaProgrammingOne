package Chapter4;

import java.util.Scanner;

/**
 * Program to see who wins the auction
 *
 * @author Ibrahim Matar
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        //for spacing 
        System.out.println("What is the first bidders name?");
        String bidder1 = input.next();//first bidders name
        //for spacing
        System.out.println("How many hours does the first bidder require to work?");
        int hours1 = input.nextInt();//how many hours the first bidder has to work
        //for spacing
        System.out.println("How much does the first bidder charge per hour?");
        double charge1 = input.nextDouble();//how much the first bidder charges per hour
        //for spacing
        System.out.println("What is the second bidders name?");
        String bidder2 = input.next();//name of second bidder
        //for spacing
        System.out.println("How many hours does the second bidder require to work?");
        int hours2 = input.nextInt();//how many hours the second bidder has to work
        //for spacing
        System.out.println("How much does the second bidder charge per hour?");
        double charge2 = input.nextDouble();//how much the second bidder charges per hour
        //for spacing
        double pay1 = hours1 * charge1;//how much you will have to pay the first bidder
        //for spacing
        double pay2 = hours2 * charge2;//how much you will have to pay the second bidder
        //for spacing
        System.out.printf("\n The pay for %s is %.2f dollars.", bidder1, pay1);
        //for spacing
        System.out.printf("\n The pay for %s is %.2f dollars.", bidder2, pay2);
        //for spacing
        if (pay1 < pay2) {
            System.out.println("The winner is " + bidder1);
        }
        //for spacing
        if (pay1 > pay2) {
            System.out.println("The winner is " + bidder2);
        }
        //for spacing
        if (pay1 == pay2 && hours1 < hours2) {
            System.out.println("                ");
            System.out.println("\n The winner is " + bidder1);
            System.out.printf("\n The pay for %s is %.2f dollars.", bidder1, pay1);
            System.out.println("He works" + hours1 + "hours");
        }
        //for spacing
        if (pay1 == pay2 && hours1 > hours2) {
            System.out.println("                ");
            System.out.println("\n The winner is " + bidder2);
            System.out.printf("\n The pay for %s is %.2f dollars.", bidder2, pay2);
            System.out.println("He works" + hours2 + "hours");
        }
        //for spacing
        if (pay1 == pay2 && hours1 == hours2) {
            System.out.println(bidder1 + " and " + bidder2 + " have identical bids.");
            System.out.printf("\n %s works %d hours.\n Asks for %.2f per hour.\n And will cost you a total of %.2f dollars.\n ", bidder1, hours1, charge1, pay1);
            System.out.printf("\n %s works %d hours.\n Asks for %.2f per hour.\n And will cost you a total of %.2f dollars.   ", bidder2, hours2, charge2, pay2);
        }
    }
}
