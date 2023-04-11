
// Author: Sanjay Javangula
// Date: 2023-03-01 14:40:24

// Blood Donation, program but with compound boolean expressions

// Import Scanner
import java.util.Scanner;

public class CompoundBooleans3 { 

    public static void main(String[] args) {
        // Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter age
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Prompt the user to enter weight
        System.out.print("Enter weight: ");
        int weight = input.nextInt();


        // Check if age is greater than 18 and weight is greater than 50
        if (age >= 18 && weight >= 50) {

            System.out.println("You are eligible to donate blood");
        }

        // Else, say they can't donate blood.
        else {
            System.out.println("You can't donate at this time.");
        }

        

    }

}

