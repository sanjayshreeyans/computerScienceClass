
// Author: Sanjay Javangula
// Date Feb 27th 2023

// If  and if else statements

// Import Scanner class
import java.util.Scanner;

public class FractionToDecimalCoverter {

    public static void main(String[] args) {

        // Scanner object 
        Scanner input = new Scanner(System.in);

        // Ask user for numerator
        System.out.print("Enter numerator: ");
        double numerator = input.nextInt();

        // Ask user for denominator
        System.out.print("Enter denominator: ");
        double denominator = input.nextInt();
        System.out.println();

        // If statement to determine if the fraction is a whole number
        if ((numerator == 0) || (denominator == 0)) {
            System.out.println(numerator + " / " + denominator + " = " + "undefined");
        } else {
            // Else, the fraction is not a zero
            double decimal = numerator / denominator;
            System.out.print(numerator + " / " + denominator + " = ");
            System.out.printf("%.3f", decimal);
            
        }

}
}
