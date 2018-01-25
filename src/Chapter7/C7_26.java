package Chapter7;
import java.util.Scanner;
/**
 * Program to see if lists are identical
 *
 * @author Ibrahim Matar
 */
public class C7_26 {
 /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter list1: ");
        int length = input.nextInt();

        int[] list1 = new int[length];
        for (int c = 0; c < length; c++) {
            list1[c] = input.nextInt(); 
        }
        System.out.print("Enter list2: ");
        length = input.nextInt();

        int[] list2 = new int[length];
        for (int c = 0; c < length; c++) {
            list2[c] = input.nextInt(); 
        }
        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }
    }
   /**
    * equals Method
    * 
    * @param list1 is the first list
    * @param list2 is the second list
    * @return false, false, true
    */
public static boolean equals(int[] list1, int[] list2) {

        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}


