
// Author: Sanjay Javangula
// Date Feb 27th 2023

// If  and if else statements, to calculate speeding ticket

// Import Scanner class
import java.util.Scanner;

public class SpeedingTicketCalculator {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Ask user for speed
        System.out.print("Speed traveled: ");
        double speed = input.nextInt();

        // Ask user for speed limit
        System.out.print("Speed limit: ");
        double speedLimit = input.nextInt();

        

        // If statement to determine if the speed is greater than the speed limit
        if (speed > speedLimit) {
            // The speed is greater than the speed limit
            double overSpeed = speed - speedLimit;
            double ticket = overSpeed * 10;

            System.out.println("\nFine is $ " + ticket);
        } else {
            // Else, the speed is less than the speed limit
            System.out.println("\nFine is $ 0.00");
        }

    }
}