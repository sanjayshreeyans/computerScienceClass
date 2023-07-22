import java.util.Scanner;

public class MyMethods {

    public static void main(String[] args)
    {

        // Test all the methods
        System.out.println("Number is 5 is even: " + isOdd(5));
        System.out.println("Number 14 is a multiple of 9: " + multiple(14,9));
        System.out.println("The minimum value of 0.4, 0.32, 0.1999 is: " + minimum3(0.4, 0.1999, 0.32 ));
        System.out.println("The average of 0.4, 0.3, 0.3, 0.9 is " + average(0.4, 0.3, 0.3, 0.9));
        System.out.println("Number is 99 is prime: " + prime(99));
    }

   public static boolean isOdd(int num1) {

    if ((num1%2) == 0) {

        return true;
    }
    else {
        return false;
    }

   }

   public static boolean multiple(int x, int y) { 


    if ((x%y) == 0) {

        return true;
    }
    else {
        return false;
    }

   }

   public static double minimum3(double x, double y, double z) {

    if ((x<y) && (x<z)) {
            
            return x;
        }

    else if ((y<z)) {
    
            return y;
        }
    else {
        return z;
    }
        
    }

    public static double average(double a, double b, double c, double d) {

        double sum = (a+b+c+d);
        double average = (sum/4);
        return average;
        
    }

    public static boolean prime(int x) {

        // Check if x is a prime number
        // A prime number is a number that is only divisible by 1 and itself

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;

    }
        
    
   }


