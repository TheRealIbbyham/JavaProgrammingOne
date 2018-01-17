package Chapter4;

import java.util.Scanner;

/**
 * Program to calculate how much an employee makes after tax
 *
 * @author Ibrahim Matar
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String employee = input.next();//employees name
        System.out.print("Enter number of hours worked in a week: ");
        double hoursworked = input.nextDouble();//amount of hours that employee worked
        //for spacing
        System.out.print("Enter hourly pay rate: ");
        double payrate = input.nextDouble();//the amount of pay the employee gets per hour
        System.out.print("Enter federal tax witholding rate: ");
        double fedtax = input.nextDouble() * 100;//federal taxation
        System.out.print("Enter state tax witholding rate: ");
        double statetax = input.nextDouble() * 100;//state tax
//For spacing
        System.out.println();
        double grosspay = payrate * hoursworked;//how much the employee gets payed with no tax
        double fedwithold = grosspay * fedtax / 100;//how much the federal government keeps
//for spacing
        double statewithold = grosspay * statetax / 100;//how much the state keeps
        double totdeduc = fedwithold + statewithold;//how much he lost to the deral government and state combined
        double netpay = grosspay - totdeduc;//how much he made after the deduction
        //for spacing
        System.out.println("Employee Name: " + employee);
        System.out.println("Hours Worked: " + hoursworked);
        System.out.println("Pay Rate: $" + payrate);
        System.out.println("Gross Pay: $" + grosspay);
        System.out.print("Deductions:");
        //for spacing
        System.out.printf("\n Federal Witholding (" + fedtax + "%%): $%.2f", fedwithold);
        System.out.printf("\n State Witholding (" + statetax + "%%): $%.2f", statewithold);
        System.out.printf("\n Total Deduction: $%.2f", totdeduc);
        System.out.printf("\nNet Pay: $%.2f", netpay);
    }
}
