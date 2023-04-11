
// Author: Sanjay Javangula
// Date: 2023-03-03 14:20:54

// import scanner
import java.util.Scanner;

// Class declaration

public class switchCaseStatements {

    // Main method
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // During a parent teacher meeting, the parent doesn't know where the classroom is located. The program asks the parent to enter the type of classroom they want to attend. For example, if the parent wants to attend the computer classroom, the program gives the floor and the room number of the classroom.

        // Give details of the classrooms
        System.out.println("For math teachers, please enter 1: ");
        System.out.println("For science teachers, please enter 2: ");
        System.out.println("For tech teachers, please enter 3: ");
        System.out.println("For computer science teachers, please enter 4: ");

        
        // Prompt the parent to enter the type of classroom they want to attend. 
        System.out.print("Please enter the type of classroom you want to attend: ");
        // Store the teacher type
        int type = input.nextInt();
        
        // Use switch case statements to determine the appropriate classroom
        switch (type) {
            case 1:
                System.out.println("The math classroom is located at the floor 1 and room number 132.");
                break;
            case 2:
                System.out.println("The science classroom is located at the floor 1 and room number 133.");
                break;
            case 3:
                System.out.println("The tech classroom is located at the floor 1 and room number 134.");
                break;
            case 4:
                System.out.println("The computer science classroom is located at the floor 2 and room number 231.");
                break;
            default:
                System.out.println("Invalid classroom");
                break;
        }
        
    }

}