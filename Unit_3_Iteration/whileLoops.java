
// This code will generate a random number from 1-100
// The user will guess the number, and the code will tell them if they are too high, too low, or correct
// The user will have 6 tries to guess the correct number

// Declare Scanner
// Declare random variable
// Declare user input variable
// Declare guess count variable
// While the user input is not equal to the random number, and the guess count is greater than 0
// Ask user for guess
// If they guess the correct number, tell them they got it
// If they guess too low, tell them they are too low
// If they guess too high, tell them they are too high
// Subtract one from the guess count
// If the guess count is zero, tell them they lose, and display the random number




// Author: Sanjay Javangula
// Date: 2023-03-29 9:58 AM

// import scanner
import java.util.Scanner;


public class whileLoops {

    public static void main(String[] args) 
    {

        // Scanner instance
        Scanner sc = new Scanner(System.in);

        // Declare the random variable
        int random = (int)(Math.random() * 100) + 1;

        
        // Declare the user input variable
        int userInput =-1;
        int guessCount = 6;
        while(userInput != random && guessCount > 0) {

            System.out.print("Guess my number, you have " + guessCount + " left: ");
            userInput = sc.nextInt();

            
            if (userInput == random) {
                System.out.println("You got it!");
                break;
            }
            else if(userInput < random) {
                System.out.println("Too low.");
            } else  {
                System.out.println("Too high.");
            }
            guessCount--;



        }

        if (guessCount == 0) {
            System.out.println("You lose!, the number was: " + random);
        }
       
    }
}
