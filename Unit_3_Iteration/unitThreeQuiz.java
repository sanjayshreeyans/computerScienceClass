
// Author: Sanjay Javangula
// Date: 2023-04-11 8:11:38

// Import Scanner
import java.util.Scanner;


public class unitThreeQuiz {
    public static void main(String[] args) {
        
       // Write a program that allows the user to enter integer values until they enter 0, then calculates and displays the product of the integers as shown.

       // Scanner instance
       Scanner scanner = new Scanner(System.in);


       int multiplicant = 1;
       int product = 1;
       int count = 1;
       
       do {

        // Prompt the user to enter the multiplicatn
        System.out.print("#" + count + ": ");
        multiplicant = scanner.nextInt();
        product *= multiplicant;
        count++;

       } while (product <= 100);
        

         System.out.println("The product is " + product);
    }
}
