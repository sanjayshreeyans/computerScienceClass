
// Author: Sanjay Javangula
// Date: 2023-03-03 14:41:01

// Write a program called calculator that asks the user to enter two real numbers. Then, the program asks the user to enter his/her choice for the calculation as follows; 
// 1. For adding two numbers, the program displays the sum of the two numbers. 
// 2. For subtracting two numbers, the program displays the difference of the two numbers.
// 3. For multiplying two numbers, the program displays the product of the two numbers.
// 4. For dividing two numbers, the program displays the quotient of the two numbers

// Import Scanner
import java.util.Scanner;

public class Calculations2 {
    public static void main(String[] args) {
        
        // Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
    double firstNumber = input.nextDouble();

        // Pr
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        System.out.println("To choose addition enter:  + ");
        System.out.println("To choose multiplication enter:  *  ");
        System.out.println("To choose subtraction enter:  -  ");
        System.out.println("To choose division enter:  /  ");

        System.out.print("Enter your choice: ");
        char choice = input.next().charAt(0);
        
        switch (choice) {
            case '+':
                System.out.println("The result of the addition is: " + (firstNumber+secondNumber));
                break;
            
            case '*':
                System.out.println("The result of the multiplication is: " + (firstNumber*secondNumber));
                break;
        
            case '-':
                System.out.println("The result of the subtraction is: " + (firstNumber-secondNumber));
                break;
            
            case '/':
                System.out.print("The result of the division is: " );
                System.out.printf("%.3f\n", (firstNumber/secondNumber));
                break;
        
        
        
            default:
                System.out.println("Invalid Input, please try again.");
                break;
        }


        char addition = '+';
        char multiplication = '*';
        char subtraction = '-';
        char division = '/';

        if (choice == addition) {
            System.out.println("The result of the addition is: " + (firstNumber+secondNumber));
        }

        else if (choice == multiplication) {
            System.out.println("The result of the multiplication is: " + (firstNumber*secondNumber));

        }
        
        else if (choice == subtraction) {
            System.out.println("The result of the subtraction is: " + (firstNumber-secondNumber));
        }

        else if (choice == division) {
            System.out.print("The result of the division is: " );
                System.out.printf("%.3f", (firstNumber/secondNumber));
        }

        else {
            System.out.println("Invalid Input, please try again.");
        }

    }

}
        