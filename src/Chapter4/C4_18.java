package Chapter4;

import java.util.Scanner;

/**
 * Program to See what classes you have
 *
 * @author Ibrahim Matar
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String clasGrade = input.next().toUpperCase();
        char clas = clasGrade.charAt(0);
        char grade = clasGrade.charAt(1);
        String output;
        switch (clas) {
            case 'M':
                output = "Mathematics ";
                break;
            case 'C':
                output = "Computer Science ";
                break;
            case 'I':
                output = "Information Technology ";
                break;
            default:
                output = "Invalid input ";
        }
        if (!(output.equals("Invalid input "))) {
            switch (grade) {
                case '1':
                    output += "Freshman ";
                    break;

                case '2':
                    output += "Sophomore ";
                    break;
                case '3':
                    output += "Junior ";
                    break;
                case '4':
                    output += "Senior ";
                    break;
                default:
                    output = "Invalid input ";
            }
        }
        System.out.println(output);
    }
}
