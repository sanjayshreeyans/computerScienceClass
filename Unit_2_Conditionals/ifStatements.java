// Author: Sanjay Javangula
// Date Feb 21st 2023

// If  and if else statements

// Import Scanner class
import java.util.Scanner;
public class ifStatements {

    public static void main(String[]args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Determine if a student is passing or failing
        double minPassingGrade = 50; // Minimum passing grade

        // Maximum points a student can get?
        System.out.print("Enter maximum points a student can get: ");

        // Store maximum points a student can get
        double maxPoints = input.nextDouble();

        System.out.print("Enter student's grade out of " +  maxPoints  + " points: ");
        double studentGrade = input.nextDouble(); // Student's grade out of 40 points
        
        

        
        double studentGradePercentage = studentGrade / maxPoints * 100; // Student's grade percentage
        
        System.out.printf("Student's grade percentage is %.2f", studentGradePercentage);
        System.out.println("%");
        // If statement to determine if student is passing or failing
        if (studentGradePercentage >= minPassingGrade) {
        
            System.out.println("Student is passing");
        } else {
            // Else, the student is failing
            System.out.println("Student is failing, try harder next time");
        }


    }

}