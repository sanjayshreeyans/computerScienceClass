
// Author: Sanjay Javangula
// Date Feb 9th 2023
public class ProblemSolvingQuestion1 {

    public static void main(String[] args) {
        // Program calculates the area and perimeter of a rectangle
        // Length = 5.5, Width = 8.5
        // Area = Length * Width
        // Perimeter = 2 * (Length + Width)
        // Print the area and perimeter of the rectangle

        // double length = 10; // Length of rectangle
        // double width = 8; // Width of rectangle
        // double area = length * width; // Calculate area
        // double perimeter = 2 * (length + width); // Calculate perimeter
        // System.out.println("Area = " + area); // Print area
        // System.out.println("Perimeter = " + perimeter); // Print perimeter

        //  Formula for Area of a circle is 3.14 * radius * radius
        // Formula for Perimeter of a circle is 2 * 3.14 * radius

         // Declare variables
        double radius = 4.5;
        double area;
        double perimeter;

        // Compute area
        area = Math.PI * Math.pow(radius, 2);

        // Compute perimeter
        perimeter = 2 * Math.PI * radius;

        // Display results
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + perimeter);
        

    }

    // public static double areaOfCircle(double radius) {
    //     return Math.PI * Math.pow(radius, 2);
    // }

    // public static double perimeterOfCircle(double radius) {
    //     return (2 * Math.PI * radius);
    // }

}