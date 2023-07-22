
// Author: Sanjay Shreeyans Javangula
// Date: 2023-05-29 09:20:16
// Introduction to String Methods

public class StringMethods {

    public static void main(String[] args) {
        // String Methods
            
        // String.length()
        String str = "Hello World!";
        String name = "Alice";
        String name2 = "Alice";
        System.out.println(name == name2); // true
        System.out.println(name.equals(name2)); // true
        String name3 = new String("Alice");
        System.out.println(name == name3); // false
        System.out.println(name.equals(name3)); // true

        // Length of a String
        System.out.println("Length of the String: " + name.length()); // 12

        // Substring of a String
        String s1 = "MrSteven Wilson";

        System.out.println("Substring of the String: " + s1.substring(2)); // rSteven Wilson


        String s2 = "Northern Secondary School";

        // Print  Secondary 
        
        System.out.println("Substring of the String: " + s2.substring(9, 18)); // Secondary
       
        String s3 = "Stephanie";

        // Print Steph 
        System.out.println("Substring of the String: " + s3.substring(0, 5)); // Steph

        // Method Equals with Ignore Case
        String s4 = "Hello";
        String s5 = "hello";
        System.out.println(s4.equals(s5)); // false
        System.out.println(s4.equalsIgnoreCase(s5)); // true

        // Converting string to a number
        String s6 = "123";
        String s7 = "345";

        System.out.println(s6 + s7); // 123345
        int num = Integer.parseInt(s6);
        int num2 = Integer.parseInt(s7);

        System.out.println(num + num2); // 468


        // Converting a double string to double
        String s8 = "123.45";
        String s9 = "345.67";

        System.out.println(s8 + s9); // 123.45345.67
        double num3 = Double.parseDouble(s8);
        double num4 = Double.parseDouble(s9);

        System.out.println(num3 + num4); // 469.12

        // // String.charAt(int index)
        // System.out.println(str.charAt(0)); // H
        // System.out.println(str.charAt(1)); // e
        // System.out.println(str.charAt(2)); // l

        // // String.substring(int startIndex, int endIndex)
        // System.out.println(str.substring(0, 5)); // Hello
        // System.out.println(str.substring(6, 12)); // World!
        // System.out.println(str.substring(0, 12)); // Hello World!

        // // String.substring(int startIndex)
        // System.out.println(str.substring(6)); // World!

        // // String.indexOf(String str)
        // System.out.println(str.indexOf("Hello")); // 0

        // // String.indexOf(String str, int fromIndex)
        // System.out.println(str.indexOf("World", 6)); // 6

        // // String.indexOf(char ch)
        // System.out.println(str.indexOf('H')); // 0

        // // String.indexOf(char ch, int fromIndex)
        // System.out.println(str.indexOf('o', 5)); // 7
        
    }
    
}