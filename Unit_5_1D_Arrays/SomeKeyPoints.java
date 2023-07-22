
// Author: Sanjay Shreeyans Javangula
// Date: 2023-05-23 09:09:55


public class SomeKeyPoints {


    public static void main(String[] args) {

        // Add method, which is a static method
        System.out.println("The sum of 2 and 3 is: " + add(2, 3));

        // Multiply method, which is an instance method
        SomeKeyPoints someKeyPoints = new SomeKeyPoints();
        System.out.println("The product of 2 and 3 is: " + someKeyPoints.multiply(2, 3));


    }
    

    
    // Static keyword in a method declaration, allows the method to be called without creating an object of the class. It was a keyword in the class declaration that allows the method to be called without creating an object of the class. 'static'

    public static int add(int a, int b) {
        return a + b;
    }

    // Instance methods in a method declarations, are methods that are called on an object. You cannot call the method without a instance of the class. They can access instance variables and instance methods directly. Does not have a keyword.

    public int multiply(int a,  int b) {

        return a * b;

    }
        
    }

    