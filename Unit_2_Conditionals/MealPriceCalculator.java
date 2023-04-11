
// Author: Sanjay Javangula
// Date Feb 27th 2023

// If  and if else statements, to calculate meal price

// The following sample runs are for a program that allows the user to enter the name of a meal and
// its price, then calculates the tax and total cost of the meal, then displays it as shown. For a price
// below $4.00, you are only charged 5% GST. For a price of $4.00 or more, you are charged 13%
// HST. Here are two different sample runs:


// Import Scanner class
import java.util.Scanner;

public class MealPriceCalculator {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);


        // Ask user for meal price
        System.out.print("Meal: ");
        String meal = input.nextLine();

        // Ask user for meal price
        System.out.print("Price: ");
        double price = input.nextDouble();

        // If statement to determine if the price is less than 4

        if (price < 4) {
            // The price is less than 4
            int taxPercent = 5;
            double tax = price * 0.05;
            double total = price + tax;
            System.out.print("\nTaxes (" + taxPercent + "%):\t$");
            System.out.printf("%.2f", tax);
            System.out.printf("\nTotal:\t$%.2f\n", total);

    
        } else {
            // Else, the price is greater than 4
            int taxPercent = 13;
            double tax = price * 0.13;
            double total = price + tax;
            System.out.print("\nTaxes (" + taxPercent + "%):\t$");
            System.out.printf("%.2f", tax);
            System.out.printf("\nTotal:\t$%.2f\n", total);
    
        }

       
    }
}