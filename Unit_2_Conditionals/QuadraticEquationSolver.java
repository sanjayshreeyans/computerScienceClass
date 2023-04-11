
// Author: Sanjay Javangula
// Date: 2023-03-02 02:54:11
// Description: Write a program that finds the roots of a quadratic equation . 
// Use your program to solve the following equations.			


// Import the java.util.Scanner class
import java.util.Scanner;
public class QuadraticEquationSolver {

    public static void main(String[] args) {
        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // The quadratic formula: (-b +- sqrt(b^2 - 4ac)) / 2a
        // Prompt the user to enter the coefficients of the quadratic equation
        System.out.println("Enter the values of a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Calculate the discriminant
        double discriminant = (b * b) - (4 * a * c);

        // If the discriminant is negative, the quadratic equation has no real roots
        if (discriminant < 0) {
            System.out.println("No Real Solutions");
        }

        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("x1 = x2 = " + root);
        
        }
        // If the discriminant is positive, the quadratic equation has real roots
        else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 =" + root1 + ", x2 = " + root2);
        }

    }

}

