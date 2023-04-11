
// Author: Sanjay Javangula
// Date Feb 27th 2023

// If  and if else statements, to calculate hourly wage

// Import Scanner class
import java.util.Scanner;

public class HourlyWageCalculator {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Ask user for hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextInt();

        // Ask user for hourly wage
        System.out.print("Enter hourly wage: ");
        double hourlyWage = input.nextInt();

        // If statement to determine if the hours worked is greater than 10
        if (hoursWorked > 10) {
            double overtime = hoursWorked - 10;
            double overtimeWage = hourlyWage + 1;
            double overtimePay = overtime * overtimeWage;
            double regularPay = 10 * hourlyWage;
            double totalPay = overtimePay + regularPay;

            System.out.println(hoursWorked + " hrs"  + " @ " + overtimeWage + "/hr = $" + totalPay);

            

        
        } else {
            // Else, the hours worked is less than 10
            System.out.println(hoursWorked + " hrs"  + " @ " + hourlyWage + "/hr = $" + (hoursWorked * hourlyWage));
            
        }

}
}