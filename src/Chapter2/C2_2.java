package Chapter2;

import java.util.Scanner;

/**
 * Program to find area and volume of a circle to the console
 *
 * @author Ibrahim Matar
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        double radius = input.nextDouble();//taking radius from keyboard
        //for spacing
        System.out.println("What is the length of your circle?");
        double length = input.nextDouble();//taking length from keyboard
        //for spacing
        System.out.println("The area of your circle is : ");
        double area = radius * radius * Math.PI;//doing te math to find area of circle
        double volume = area * length;//volume of circle
        //for spacing
        System.out.println(area);//printing out the area
        System.out.println("The volume of your circle is : ");
        System.out.println(volume);//printing out the volume

    }
}
