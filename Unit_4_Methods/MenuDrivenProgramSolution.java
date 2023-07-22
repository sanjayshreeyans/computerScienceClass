
import java.util.Scanner;

public class MenuDrivenProgramSolution {

    static int number;

    /**
     * This is a Java program that presents a menu of options to the user and
     * executes the selected
     * option until the user chooses to exit.
     */
    public static void main(String[] args) {

        Scanner scammer = new Scanner(System.in);
        int choice = 1;

        do {
            System.out.println("Choose one of the following options: ");
            System.out.println("1.  Get Int");
            System.out.println("2.  Sum Range");
            System.out.println("3.  Factorial ");
            System.out.println("4.  IsPrime");
            System.out.println("0.  Exit");

            // Get choice from user
            choice = scammer.nextInt();
            switch (choice) {

                case 1:
                    getInt();
                    break;
                case 2:
                    sumRange();
                    break;
                case 3:
                    factorial();
                    break;
                case 4:
                    prime();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;

            }

        } while (choice != 0);
    }

    /**
     * This function prompts the user to enter a number within a specified range and
     * keeps prompting
     * until a valid number is entered.
     */
    public static void getInt() {
        Scanner sc = new Scanner(System.in);

        // enter lower bound
        System.out.println("Enter lower bound: ");
        int lowerBound = sc.nextInt();

        // enter upper bound
        System.out.println("Enter upper bound: ");
        int upperBound = sc.nextInt();

        // enter number between bounds
        System.out.println("Enter number between " + lowerBound + " and " + upperBound + ": ");
        number = sc.nextInt();

        while (number < lowerBound || number > upperBound) {

            // Invalid number
            System.out.println("Invalid number. Enter number between " + lowerBound + " and " + upperBound + ": ");
            number = sc.nextInt();
        }
        sc.close();

    }

    /**
     * The function takes two integers as input and calculates the sum of all
     * integers between them,
     * inclusive.
     */
    public static void sumRange() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first: ");
        int first = sc.nextInt();
        System.out.println("Enter second: ");
        int second = sc.nextInt();

        // Sum of numbers between first and second
        int sum = 0;

        for (int i = first; i <= second; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers between " + first + " and " + second + " is " + sum);

        sc.close();
    }


/**
 * This Java function calculates the factorial of a given integer input.
 * Uses the getInt() function to get the integer input.
 */
    public static void factorial() {

        getInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);

    }
    public static void prime() {

        getInt();
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}
