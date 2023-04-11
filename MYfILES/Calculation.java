// Author: Sanjay Javangula
// Date Feb 9th 2023

// Arithmetic calculations in java, Compound assignments 
public class Calculation {
    public static void main(String[]args) {
        // Arithmetic Operators
        // +, -, *, /, %
        // + is used for addition and concatenation
        // % is used for modulus, remainder
        // - is used for subtraction
        // * is used for multiplication
        // / is used for division
        int x = 10;
        int y = 12;
        int z = x + y;
        // System.out.println("Z = " + z);

        int z2 = x - y;
        int z3 = x * y;
        int z4 = x / y;

        // System.out.println("Z = " + z + " Z2 = " + z2 + " Z3 = " + z3 + " Z4 = " + z4);

        // Working with integers

        System.out.println(10/4);
        System.out.println(10.0/4);

        // Modulus operator % returns the remainder of a division

        System.out.println(15%4); // 3, remainder of 15/4

        // compound assignment operators
        // +=, -=, *=, /=, %=

        int num = 7;
        System.out.println("Num = " + num); // 7

        num = num + 5; 
        System.out.println("Num = " + num); // 12

        int i = 10;
        i++; // i = i + 1

        System.out.println("I = " + i); // 11

        int j = 18;
        j--; // j = j - 1
        System.out.println("J = " + j); // 17

        int k =5;
        k+=6; // k = k + 6
        System.out.println("K = " + k); // 11

        int t = 8;
        t*=5; // t = t * 5
        System.out.println("T = " + t); // 40

        // t = t - 11 is equivalent to t -= 11
        // c=c/10 is equivalent to c/=10
        // c=c%5 is equivalent to c%=5

        System.out.println(10==10); // true, equality operator 
 
    }
}