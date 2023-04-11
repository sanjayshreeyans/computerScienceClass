
// Author:  Sanjay Javangula
// Date: 2023-03-08 14:38:19

// Import scanner
import java.util.Scanner;

public class smallestNumberChecker {
    
    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the users to enter numbers
        System.out.println("Enter 4 numbers: ");

        // Store numbers
        int firstInt = sc.nextInt();
        int SecondInt = sc.nextInt();
        int ThirdInt = sc.nextInt();
        int ForthInt = sc.nextInt();

        // Check for the smallest numbers

        if (firstInt < SecondInt && firstInt < ThirdInt && firstInt < ForthInt) {

            System.out.println("The smallest number is " + firstInt);
        }

        else if ( SecondInt < ThirdInt && SecondInt < ForthInt) {

            System.out.println("The smallest number is " + SecondInt);
        }

        else if ( ThirdInt < ForthInt) {

            System.out.println("The smallest number is " + ThirdInt);
        }

        else {
            System.out.println("The smallest number is " + ForthInt);

        }

    }
    
}