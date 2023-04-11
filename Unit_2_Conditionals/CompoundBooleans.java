// Author: Sanjay Javangula
// Date: 2/23/2023

// Import Scanner
import java.util.Scanner;

class CompoundBooleans {
    public static void main(String[] args) {
        
        // Compound Booleans statements
        // Compound Booleans can be used to test if a boolean value is true or false.
        // Logical Operators (&&, ||,!) can be used to test if two boolean values are true or false.
        // && is the AND operator, it returns true if both boolean values are true.
        // || is the OR operator, it returns true if one of the boolean values is true.
        //  is  ! the NOT operator, it returns true if the boolean value is false.


        // What are DeMorgan's Law's about booleans?
        // DeMorgan's Law's are used to simplify boolean expressions.
        // DeMorgan's Law's are:
        // not (A or B) = (not A) and (not B)
        // not (A and B) = (not A) or (not B)
        


        // Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a boolean value
        System.out.print("Do you have an recommendation value: ");
        boolean hasRecommendation = input.nextBoolean();

        // Prompt the user to enter a the GPA  value
        System.out.print("Enter your GPA greater than 80?: ");
        boolean gpa = input.nextBoolean();

        // Check if the user is eligible to participate in the program
        // In order to apply the recommendation, the user must have a GPA of at least 80 and must have a recommendation
        if (gpa && hasRecommendation) {
            System.out.println("You are eligible to participate in the program!");
        } else {
            System.out.println("Try again later!");

        }

        // Close the scanner object
        input.close();

        // Why is it important to close the scanner object?
        // It is important to close the scanner object when you are done with it.
        // If you don't close the scanner object, it will continue to take up memory.
    }
}