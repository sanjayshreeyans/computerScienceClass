// Author: Sanjay Javangula
// Date Feb 21st 2023

// Import Scanner class
import java.util.Scanner;
public class ifStatements2 {
    public static void main(String[]args) {
        // create Scanner object
        Scanner sc = new Scanner(System.in);
        double tax; // Tax amount
        // Print title
        System.out.println("Spend More - No Tax");

        // Prompt the user to enter the item name
        System.out.print("\nEnter the item name: ");
        String itemName = sc.nextLine();

        // Prompt the user to enter the item price
        System.out.print("Price: ");
        double itemPrice = sc.nextDouble();

        // If statement to determine if the item price is greater than or equal to 100
        if (itemPrice >= 100) {
            // set tax to 0
            tax = 0;
        } else { 
            // Else, 13% tax
            tax = itemPrice * 0.13;
            
        }

        // Print the tax amount
        System.out.printf("\nTaxes $\t$%.2f", tax);

        // Print the total price
        System.out.printf("\nTotal $\t$%.2f\n", itemPrice + tax);
    }
}