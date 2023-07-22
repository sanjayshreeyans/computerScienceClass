
// Author : Sanjay Javangula
// Date:    2023-05-01 9:15:14

// Import scanner
import java.util.Scanner;

public class MenuDrivenProgram2 {
    public static void main(String[] args) {
        // What is menu driven program?
        // A menu driven program is a program that gives the user a list of options to
        // choose from.
        // The user can select an option from the list and the program will execute the
        // option.
        // The user can keep selecting options until they choose to exit the program.

        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Print out the menu
        System.out.println("Choose one of the following options: ");
        System.out.println("1.  Get Int");
        System.out.println("2.  Sum Range");
        System.out.println("3.  Factorial ");
        System.out.println("4.  IsPrime");
        System.out.println("0.  Exit");

        // Get choice from user
        int choice = sc.nextInt();

        // Switch statement

        switch (choice) {

            case 1:
                getInt(sc);
                break;
            case 2:
                sumRange(sc);
                break;
            case 3:
                factorial(sc);
                break;
            case 4:
                isPrime(sc);
                break;
            case 0:
                System.out.println("Exiting...");
                break;

        }

    }
    static int globalNum = 0;
    
    







    public static void getInt(Scanner sc) {

        // Get integer from user
        System.out.print("Enter an integer (LOW VALUE): ");
        int num = sc.nextInt();
        System.out.print("Enter second integer (HIGH VALUE): ");
        int num2 = sc.nextInt();
        // forces the user to enter a value between low and high and prints this value.
        // Use this method to do range-checking for some of the other methods as
        // described below.

        while (num != num2) {
            System.out.println("Enter an integer between " + num + " and " + num2 + ": ");
            globalNum = sc.nextInt();
            if (globalNum >= num && globalNum <= num2) {
                System.out.println("You entered: " + globalNum);
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }

        }
        
    }

    public static void sumRange(Scanner sc) {
        // Create a method called sumRange that asks the user to enter two integer
        // values and prints the sum of all integers inside the range of those values,
        // regardless of the order. The method should not contain any input or output.

        // Get lower range from user
        System.out.print("Enter an integer (LOW VALUE): ");
        int num = sc.nextInt();
        System.out.println("Enter second integer (HIGH VALUE): ");
        int num2 = sc.nextInt();

        int sum = 0;

        while (num <= num2) {

            sum++;
            num++;
        }
        System.out.println("The sum of all integers between " + num + " and " + num2 + " is " + sum);

    }

    // Create a method called factorial that asks the user to enter an integer
    // value, then the method calculates and prints the factorial of that
    // number.(ex. 5! = 5x4x3x2x1=120). Use getInt method to make sure the user
    // enters a positive number less than 10. The method should not contain any
    // input or

    public static void factorial(Scanner sc) {

        // Get integer from user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int factorial = 1;
        if (num <= 10 && num > 0) {

            while (num > 0) {
                factorial = factorial * num;
                num--;
            }
            System.out.println("The factorial of " + num + " is " + factorial);
        }

        else {
            System.out.println("Invalid must be a positive number less than 10");
        }

    }

    // Create a method called isPrime that asks the user to enter an integer value,
    // then the method determines and prints whether the number is prime or not. Use
    // getInt method to make sure the user enters a positive number less than 100.
    // The method should not contain any input or output.

    public static void isPrime(Scanner sc) {

        // Get integer from user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int i = 2;
        boolean prime = true;
        if (num > 1) {

            while (i <= num / 2) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }

        else {
            System.out.println("Invalid must be a positive number GREATER than 1");
        }

    }

}
