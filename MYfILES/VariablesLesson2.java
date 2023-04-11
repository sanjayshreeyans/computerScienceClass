
// Author: Sanjay Javangula
// Date Feb 7th 2023
public class VariablesLesson2
{
    public static void main(String[]args) {
        // Primitive Types of variables = (int, double, boolean, char)
        
        // Integers 
        int x; // Declaring a variable
        x=52; // Initializing variable
        
        System.out.println(x); // Print x
        
        x=27; // updating variable
        
        System.out.println(x); // Print x
        
        int y = 20;
        int a,b,c;
        
        a=10;
        b=20;
        c=30;
        System.out.println("Sum = " +(a+b+c));
        
        // Double Represents Decimal numbers 
        
        double number = 2.5;
        double number2 = 100;
        System.out.println(number2);
        
        // Boolean variables
        // boolean bool = false;
        // System.out.println(10<20);
        
        // Characters 
        
        char ch = 'H';
        char ch2 = '*';
        System.out.println(ch);
        System.out.println(ch2);
        
        // Non-Primitive Data type
        // Strings are not primitive
        
        String myName = "Marcus";
        System.out.println("My name is "+myName);
        System.out.println(myName + " is a good student");
        System.out.println("Sara is a friend of " + myName);
        
        // Casting, is changing the type of an object
        // Upcasting(widening) is done implicitly or automatically
        int h = 5;
        double k = h;
        
        // Downcasting or narrowing
        double q = 2.5;
        int w = (int) q;
        System.out.println(w);
        
        double z = (Math.round(q));
        System.out.println(z);
        
        
    }
}
