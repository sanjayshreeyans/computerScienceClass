
// Author: Sanjay Javangula
// Date: 2023-05-02 9:37:22

public class InvokingMethodsFromAnotherMethods {

/**
 * The main function prints the result of calling the function with arguments 5 and 6.
 */
    public static void main(String[] args) {
        System.out.println(function(5, 6));
    }
    
/**
 * The function "add" takes two integer parameters and returns their sum.
 * 
 * @param num1 The first integer number to be added.
 * @param num2 The parameter `num2` is an integer that represents the second number to be added in the
 * `add` method.
 * @return The sum of `num1` and `num2` is being returned.
 */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

/**
 * The function returns the sum of two integer parameters.
 * 
 * @param x An integer value that represents the first parameter passed to the function.
 * @param y The parameter "y" is an integer input parameter that is passed to the function "function".
 * @return the result of adding the values of x and y.
 */
    public static int function(int x, int y) {
        return add(x, y);
    }



}
