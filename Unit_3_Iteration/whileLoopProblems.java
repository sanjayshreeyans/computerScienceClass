
/**
 * This code takes a string input and reverses it.
 * This is done by iterating over the string from the back
 * and adding the character to the reverse string.
 * The reverse string is then printed out.
 * 
 * @param num String input from user
 * @param count The last index of the input string
 * @param reverseString The string that is the reverse of num
 * @param numChar The character at index count
 */




// Author: Sanjay Javangula
// Date: 4/3/2023, 9:19:01 AM 


// Import Scanner 
import java.util.Scanner;

public class whileLoopProblems {
   // Main method
   public static void main(String[] args) {

        // Scanner instance
        Scanner scanner = new Scanner(System.in);
      
        // Prompt user for input
         System.out.print("Enter an integer: ");
         String num = scanner.next();

         // Iterate over the string
         int count = num.length()-1;
         String reverseString = "";
         while(count >=0){
            String numChar = String.valueOf(num.charAt(count));
            reverseString+= numChar;
            count--;
         }

         System.out.println("Reverse is: " + reverseString);
   }
}
