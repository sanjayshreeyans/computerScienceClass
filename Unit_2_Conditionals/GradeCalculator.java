// Author: Sanjay Javangula
// Date: Feb 23 2023

// Calculates the grade, based on the following formula:
// Grade = (marks/totalMarks) * 100

// The grading scale is based on the following formula: 
// if average is greater than 80, grade is A
// if average is greater than 70 and smaller than 80, grade is B
// if average is greater than 60 and smaller than 70, grade is C
// if average is greater than 50 and smaller than 60, grade is D
// else grade is F

// Import Scanner, for input
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the number of mark
        System.out.print("Enter the number of marks: ");
        // Store the number of marks
        double marks = sc.nextDouble();

        // Prompt the user to end the total marks
        System.out.print("Enter the total marks: ");
        // Store the total marks
        double totalMarks = sc.nextDouble();

        // Calculate the grade, by dividing the marks by the total marks
        double average = (marks/totalMarks) *100;

        // Prompt the user to end the total marks
        System.out.printf("The average grade is %.2f\n", average);
        
        // Series of if-else statements determine the grade
        if (average >= 80) {
        System.out.println("You got an A");
        }
        else if (average >= 70) {
        System.out.println("You got an B");
        }
        else if (average >= 60) {
        System.out.println("You got an C");
        }
        else if (average >= 50) {
        System.out.println("You got an D");
        }
        else  {
        System.out.println("You got an F");
        }

    
    
    }
}
