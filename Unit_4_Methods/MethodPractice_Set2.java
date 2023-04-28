
// Author: Sanjay Javangula
// Date: 4/17/2023, 9:20:42 AM 

// Import Scanner

import java.math.BigInteger;
public class MethodPractice_Set2 {
    
    public static void main(String[] args) {
        
        // Print sumOfNaturals
        System.out.println("SumOfNaturals(100) = " + SumOfNaturals(100));

        // Print SumInBetween
        System.out.println("SumInBetween(4, 70) = " + SumInBetween(4, 70));

        // Print isPrime
        System.out.println("isPrime(45) = "  + isPrime(45));

        // Print the factorial
        System.out.println("Factorial(400) = " + factorial(400));

        // Print the factors
        System.out.println("Factors(100) = " + factors(100));

    }

    // Sum of naturals
    public static int SumOfNaturals(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // Sum in between, accept two numbers and return the sum of all numbers in between

    public static int SumInBetween(int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // Is prime, accepts an integer and returns true if it is prime
    public static boolean isPrime(int n1) {

        boolean t = false;
        
        // 2<=8
        // 3<=8
        // 4<=8
        // 5<=8
        // 6<=8
        // 7<=8
        // 8<=8
    
        for (int i = 2; i <= n1 / 2; ++i) {
            // condition for nonprime number
            if (n1 % i == 0) {
                t = true;
                break;
            }
        }
        
        return !t;

    }

    // Factorial function 

    public static BigInteger factorial(int n) {

    BigInteger product = new BigInteger("1");
    
    int count = n;

        while (count > 0) {

            product = product.multiply(BigInteger.valueOf(count));
           
            count--;
        }

        return product;
    }

    //  Factors method, takes in a number and returns all the factors

    public static  String factors(int num) {

        String factors = "";

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors = factors + i + ", ";
            }
        }

        return factors;
    }

}
