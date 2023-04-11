
// Import the Scanner class
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        
            // Scanner object
            Scanner input = new Scanner(System.in);

            // The following sample runs are for a program that determines the highest number in a group of three random integer values from 1 to 10. Write the program to solve this problem


            // // Ask the user to enter integer values
            // System.out.println("The numbers are: ");
            // int num1 = input.nextInt();
            // int num2 = input.nextInt();
            // int num3 = input.nextInt();

            // // Determine the highest number
            // if (num1 > num2 && num1 > num3) {
            //     System.out.println("The highest number is: " + num1);
            // }
            // else if (num2 > num1 && num2 > num3) {
            //     System.out.println("The highest number is: " + num2);
            // }
            // else if (num3 > num1 && num3 > num2) {
            //     System.out.println("The highest number is: " + num3);
            // }
            // else {
            //     System.out.println("The numbers are equal");
            // }
               
            int first = 20; int second = 21;
            double third = 0;
        
            System.out.println ("The numbers are: " + first + second);
        
            if (first > 20 && second > 20)
            {
                first = second;
                System.out.print (first + second);
            }
            else
            {
                System.out.print (second + first);
            }
        
            if (first != second)
        {
                third = second + first / 3;
        }
        
            System.out.println("The answer is: ");
            System.out.printf("The answer is: %.3f", third);
        
        
    }
}