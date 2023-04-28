
// Author: Sanjay Javangula
// Date: 2023-04-28
// Menu Driven Program for a calculator
// Import scanner
import java.util.Scanner;

public class MenuDrivenProgram {

    /**
    * Main method for testing. In this method we are going to ask the user what to do with the input
    * 
    * @param args - Arguments to the program
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer choice
        int choice = 1;

        // do while loop
        do {

            System.out.println("Choose one of the following options: ");

            // System.out.println("\f");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.println("0. Exit");

            // Get choice from user
            choice = sc.nextInt();

            // Switch statement
            // This method is used to select the next choice.\
            // Take input from user beftore the switch statement

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    addition(num1, num2);
                    break;
                case 2:
                    subtraction(num1, num2);
                    break;
                case 3:
                    multiplication(num1, num2);
                    break;
                case 4:
                    division(num1, num2);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }


        } while (choice != 0);

    }

    // Addition method
    /**
    * Method to add two numbers and print the result. For example : add ( 3 4 ) would print 7
    * 
    * @param num1 - first number to be added
    * @param num2 - second number to be added ( sum of 3
    */
    public static void addition(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));

    }

    // Subtraction method
    /**
    * Method to subtract two numbers and print the result. This method is used in conjunction with #add ( int int ) and #subtract ( int int )
    * 
    * @param num1 - The first number to subtract
    * @param num2 - The second number to subtract ( ignored if num1 == num
    */
    public static void subtraction(int num1, int num2) {
        System.out.println("Difference: " + (num1 - num2));
    }

    // Multiplication method

    /**
    * Multiplication of two numbers. Prints the product of the two numbers to the console. For example multiplying two numbers 1 and 2 would print " Product : 1 "
    * 
    * @param num1 - The first number to be multiplied. Must be greater than or equal to 0. 0.
    * @param num2 - The second number to be multiplied. Must be greater than or equal to 0. 0
    */
    public static void multiplication(int num1, int num2) {
        System.out.println("Product: " + (num1 * num2));
    }

    // Division method

    /**
    * Prints Quotient of two numbers. Use for testing. This is a simple division method to print the quotient of two numbers
    * 
    * @param num1 - The first number to divide
    * @param num2 - The second number to divide Note : This should be called from an
    */
    public static void division(int num1, int num2) {
        System.out.println("Quotient: " + (num1 / num2));
    }

}
