// Author: Sanjay Javangula
// Date: 2023-03-21 13:18:28

// Write an program that prompts the user to enter grades of four students, and then calculates the average grade. The program will user a loops. 

// Import the Scanner class
import java.util.Scanner;

// Class
public class LoopsLogic {

    // Main method
    public static void main(String[] args) {
        
        // Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double totalGrade = 0;

        // Ask for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Iterate the number of students
        for (int i=1; i<=numberOfStudents; i++) {
            System.out.print("Enter the grade of student " + i + ":");

            double grade = input.nextDouble();
            totalGrade += grade;
        }

        // Display the average grade
        System.out.printf("The average grade is: %.2f\n", (totalGrade/numberOfStudents));

    }

}