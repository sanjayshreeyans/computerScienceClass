// Author: Sanjay Javangula
// Date Feb 10th 2023

public class OutputFormat {

    public static void main(String[] args) {
        // I need to print the following: x = 26.82
        // double x = 26.82432176;

        // Printf stays on the same line
        // System.out.printf("x = %.2f", x);
        // System.out.println();

        // double p = 10;
        // double q = 3;
        // double r = p/q;
        // System.out.println("R = " + r);
        // System.out.printf("R = %.3f", r);
        System.out.println();
        System.out.printf("%.2f", 78.23415);
        System.out.println();
        double num = 12.35689;
        System.out.printf("%.3f", num);
        

        // \n is a special character that prints a new line
        // System.out.print("My name is Sanjay \nSurname is Javangula\n\n\nI am in grade 9\n");
    
        
        // // \t is a special character that prints a tab
        // System.out.println("Name\tMark\tGrade");
        // System.out.println("----\t----\t-----");
        // System.out.println("Sanjay\t 90\t\t 9");
        // System.out.println("Mary\t 85\t\t 11");

        
    }
}