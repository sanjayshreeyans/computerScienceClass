
// Author: Sanjay Javangula
// Date: 2023-04-28
// Menu Driven Program for a calculator
// Import scanner
import java.util.Scanner;

public class MenuDrivenProgram {

    /**
    * Main method for testing. In this method we are going to ask the user what to do with the input
    * 
    * @param args - Arguments to the program
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer choice
        int choice = 1;

        // do while loop
        do {

            System.out.println("Choose one of the following options: ");

            // System.out.println("\f");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.println("0. Exit");

            // Get choice from user
            choice = sc.nextInt();

            // Switch statement
            // This method is used to select the next choice.\
            // Take input from user beftore the switch statement

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    addition(num1, num2);
                    break;
                case 2:
                    subtraction(num1, num2);
                    break;
                case 3:
                    multiplication(num1, num2);
                    break;
                case 4:
                    division(num1, num2);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }


        } while (choice != 0);

    }

    // Addition method
    /**
    * Method to add two numbers and print the result. For example : add ( 3 4 ) would print 7
    * 
    * @param num1 - first number to be added
    * @param num2 - second number to be added ( sum of 3
    */
    public static void addition(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));

    }

    // Subtraction method
    /**
    * Method to subtract two numbers and print the result. This method is used in conjunction with #add ( int int ) and #subtract ( int int )
    * 
    * @param num1 - The first number to subtract
    * @param num2 - The second number to subtract ( ignored if num1 == num
    */
    public static void subtraction(int num1, int num2) {
        System.out.println("Difference: " + (num1 - num2));
    }

    // Multiplication method

    /**
    * Multiplication of two numbers. Prints the product of the two numbers to the console. For example multiplying two numbers 1 and 2 would print " Product : 1 "
    * 
    * @param num1 - The first number to be multiplied. Must be greater than or equal to 0. 0.
    * @param num2 - The second number to be multiplied. Must be greater than or equal to 0. 0
    */
    public static void multiplication(int num1, int num2) {
        System.out.println("Product: " + (num1 * num2));
    }

    // Division method

    /**
    * Prints Quotient of two numbers. Use for testing. This is a simple division method to print the quotient of two numbers
    * 
    * @param num1 - The first number to divide
    * @param num2 - The second number to divide Note : This should be called from an
    */
    public static void division(int num1, int num2) {
        // Change to double
        double num = (double) num1;
        double num3 = (double) num2;
        System.out.println("Quotient: " + (num / num3));
    }

    // // Explain me advanced things in java:
    // 1. Inheritance: Inheritance is a mechanism in which a new class is derived from an existing class. The new class inherits all the properties of the base class like methods and fields.

    // 2. Polymorphism: Polymorphism is the ability to take various forms. In Java, polymorphism is achieved through method overloading and method overriding.
    
    // 3. Encapsulation: Encapsulation is the mechanism of wrapping code and data together into a single unit. It is used to hide the implementation details from users.
    
    // 4. Abstraction: Abstraction is a process of hiding the complexity of a system to make it easier to use. It is achieved in Java through abstract classes and interfaces.
    
    // 5. Interfaces: Interfaces are a collection of abstract methods. A class can implement multiple interfaces, and it is used to achieve multiple inheritances in Java.
    
    // 6. Abstract classes: Abstract classes are classes that cannot be instantiated but can be used as a base class for other classes. They may also contain abstract methods.
    
    // 7. Static methods: Static methods belong to the class and not to the instance of the class. They can be accessed without creating an object of the class.
    
    // 8. Static variables: Static variables belong to the class and not to the instance of the class. They are shared by all the instances of the class.
    
    // 9. Final variables: Final variables are variables whose values cannot be changed once they are assigned.
    
    // 10. Final methods: Final methods are methods that cannot be overridden by the subclasses.
    
    // 11. Final classes: Final classes are classes that cannot be inherited by the subclasses.
    
    // 12. Constructors: Constructors are special methods that are used to initialize objects. They have the same name as their class and do not have a return type.
    
    // 13. Overloading: Overloading is the ability to define multiple methods with the same name in a class. They differ in their method signature, such as their arguments or return types.
    
    // 14. Overriding: Overriding is the ability to define a method in a subclass that has the same name and signature as a method in its superclass.
    
    // 15. Access modifiers: Access modifiers are used to control the access of classes, methods, and variables in Java. There are four types of access modifiers: private, protected, public, and default.
    
    // 16. Packages: Packages are used to group related classes together. They provide encapsulation and help to avoid naming conflicts.
    
    // 17. Exception handling: Exception handling is the mechanism of dealing with errors and exceptions that occur during program execution. It is achieved through try-catch and throw statements.
    
    // 18. Generics: Generics provide a way to create classes and methods that can work with any kind of data type. They help to achieve type safety and to write reusable code.
    
    // 19. Collections: Collections are a group of interfaces and classes that are used to store and manipulate large amounts of homogeneous or heterogeneous data.
    
    // 20. Multithreading: Multithreading is the ability of a program to execute multiple threads simultaneously. It helps to improve the performance of the program by executing parallel tasks.
    
    // 21. Synchronization: Synchronization is a technique used to prevent multiple threads from accessing the same resource simultaneously, which can cause inconsistencies or corruption.
    
    // 22. Volatile keyword: The volatile keyword is used to indicate that a variable's value may be modified by different threads. It ensures that the value of the variable is always up-to-date.
    
    // 23. Transient keyword: The transient keyword is used to indicate that a variable should not be serialized. It is used to exclude variables from the serialization process.
    
    // 24. Serialization: Serialization is the process of converting an object into a stream of bytes for storage or transmission. It is used to save the object state and to transfer objects between different environments.
    
    // 25. Deserialization: Deserialization is the process of converting a stream of bytes back into an object. It is used to recreate the object from its serialized form.
    
    // 26. Lambda expressions: Lambda expressions are a shorthand way to write anonymous methods. They are used to implement functional interfaces in a more concise way.
    
    // 27. Functional interfaces: Functional interfaces are interfaces that have only one abstract method. They are used to implement lambda expressions and method references.
    
    // 28. Method references: Method references are a shorthand way to refer to an existing method or constructor. They are used to pass a method as a parameter to a higher-order function.
    
    // 29. Stream API: The Stream API is a powerful tool for processing collections in Java. It provides a way to write code that is more concise, readable, and maintainable.
    
    // 30. Default methods: Default methods are methods that have a default implementation in an interface. They are used to add new functionality to interfaces without breaking the existing code that implements them.
}
