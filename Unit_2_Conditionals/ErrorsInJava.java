// Author: Sanjay Javangula
// Date: 2/22/2023

public class ErrorsInJava {
    public static void main(String[] args) {
        // There are three types of errors in Java
        // 1. Syntax Error
        // 2. Runtime Error
        // 3. Logical Error

        // Syntax Error
        // system.out.println("Hello World"); Doesn't compile due to s in the System is not capitalized.

        // Runtime Error, the program compiles but fails when it runs. 
        // int x = 10
        // int y = 0
        // int z = x/y // Zero Division Error

        // Logical Error, the program compiles and runs but doesn't produce the correct output.
        // double a = 80;
        // double b = 75;
        // double c = 85;
        // double avg = a + b + c/3 ;
        // System.out.println("The avg is "+  avg); // This is due to missing parenthesis

        // Review of unit test 1
        double x = 12.235619;

        // Print x to the console with 3 decimal places
        System.out.printf("%.3f", x);
        System.out.println();

        // You want the output: Number is 12.24
        System.out.println("Number is " + String.format("%.2f", x));
        
        

    }

}