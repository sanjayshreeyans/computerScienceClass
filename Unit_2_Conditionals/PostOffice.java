// Author: Sanjay Javangula
// Date: Feburary 27th 2023

// Calculates the cost of mail based on the mass.

// Import Scanner
import java.util.Scanner;

public class PostOffice {
    public static void main(String[] args ) {

        // Create scanner object
        Scanner sc = new Scanner(System.in);
        int cost;

        // Prompt for mass in grams
        System.out.print("Please enter the mass of the letter in gr: ");

        // Store mass
        double mass = sc.nextDouble();

        // Caluclate cost based on mass
        if (mass >= 100) {
            // If mass is greater than 100 grams
            // cost is 95
            cost = 95;

        }

        else if (mass >= 50) {
            // mass is greater than 50 grams and less than 100 grams
            // cost is 70
            cost = 70;

        }

        else if (mass >= 30) {
            // mass is greater than 30 and less than 50 grams
            // cost is 55
            cost = 55;

        }

        
        else {
            // Mass is lower than 30 grams
            // Cost is 40
            cost = 40;
        }

        // Print the cost
        System.out.println("The cost of the letter is: " + cost + " sinas");
    }


}