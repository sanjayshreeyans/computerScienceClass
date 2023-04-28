// Name: TypeOfMethods.java
// Author: Sanjay Javangula
// Date:  2023-04-13 9:15:00 AM

public class TypesOfMethods {
        // Explain the difference between void and return type of methods
        // An void method does not return a result
        // A return type method does return a result

        // What is the use of static?
        // Static methods can be called without creating an object of the class


        public static void main(String[] args) {
           // Main method
            // This is the entry point of the program
            // This method is called by the JVM
            // This method is static
            // This method is void
            // This method does not return a result

            // Call the method
            System.out.println("Sum = " + add(5, 10));

            int value = add(5, 10);
            System.out.println("Sum = " + value);

            // Calling welcome method, print to console
            welcome("Sanjay");

            // Calling the greeting method
            System.out.println(greeting());

            // Store the value of greeting
            String message = greeting();
            System.out.println(message);

            // Calling the print method
            print();
            
            // Calling the hardworking method
            hardworking();

            // Calling the product method
            
            // Create an object of the class
            TypesOfMethods obj = new TypesOfMethods();
            System.out.println("Product = " + obj.product(5, 10));


        }




        //  Method with return type
        //  This method adds two numbers and returns the result
        public static int add( int a, int b) {
            // This method returns an int
            // This method takes two int parameters
            
            return a + b;
    
        }

        // non - return type method
        public static void welcome(String name) {
            // This method does not return a result
            // This method takes one String parameter
            System.out.println("Welcome to the computer science club " + name);
        }

        // methods without arguments with return type

        public static String greeting() {
            // This method returns a String
            // This method does not take any parameters
            return "Hello World";
        }

        // Non return type without parameters

        public static void print() {
            // This method does not return a result
            // This method does not take any parameters
            System.out.println("Hello World from print method");
        }

        public static void hardworking() {
            // This method does not return a result
            // This method does not take any parameters
            System.out.println("Success is the result of hard work");
        }

        // Instance methods
        // Instance methods are called by creating an object of the class
        // Instance methods are not static
        // Instance methods can be called by creating an object of the class

        public int product(int a, int b) {
            // This method returns an int
            // This method takes two int parameters
            return a*b;
        }  

}
