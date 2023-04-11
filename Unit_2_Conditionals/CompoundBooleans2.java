// Author: Sanjay Javangula
// Date: February 23, 2023

// import scanner
import java.util.Scanner;
public class CompoundBooleans2 {
    public static void main(String[] args) {
        
        // Determines if a person is allowed to watch a movie.
        // The person can watch a movie if he is 18 or he has parent note.

        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a person's age.
        System.out.print("Are you older than 18: ");

        // Get age of the person
        boolean age = input.nextBoolean();
        
        // Prompt the user if he has a parent note.
        System.out.print("Do you have parent note: ");
        
        boolean hasParentNote = input.nextBoolean();
        

        // Check if the person is allowed to watch a movie.
        if (age || hasParentNote) {
            System.out.println("You can watch the movie!");
        }
        else {
            System.out.println("You can't watch the movie!");
        }

        // Close scanner instance
        input.close();
    }


}