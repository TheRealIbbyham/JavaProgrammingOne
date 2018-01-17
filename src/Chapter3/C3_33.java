package Chapter3;

import java.util.Scanner;

/**
 * Program to find out which package has aa better deal
 *
 * @author Ibrahim Matar
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight package 1: ");
        double pack1weight = input.nextDouble();
        //for spacing
        System.out.println("Enter price package 1: ");
        double pack1price = input.nextDouble();
        //for spacing
        System.out.println("Enter weight package 2: ");
        double pack2weight = input.nextDouble();
        //for spacing
        System.out.println("Enter price package 2: ");
        double pack2price = input.nextDouble();
        double pack1priceperpound = pack1price / pack1weight;
        double pack2priceperpound = pack2price / pack2weight;
        //for spacing
        if (pack1priceperpound < pack2priceperpound) {
            System.out.println("Package 1 has a better price.");
        } else {
            System.out.println("Package 2 has a better price.");
        }
    }
}
