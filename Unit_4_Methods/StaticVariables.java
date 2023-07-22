public class StaticVariables {
    public static void main(String[] args) {
        
        StaticVariables app = new StaticVariables();

        // Instantiate a new object of the StaticVariables class
        // and store it in a variable named "app"
        // We can now call the add method on the app object, because it is not static.

        System.out.println(app.add(10));
        // The above code prints 20 to the console.

        // We can also call the subtract method on the class itself, because it is static.

        System.out.println(subtract(10));
        // The above code prints -5 to the console.

    }

/**
 * The function adds 10 to the input integer and returns the result.
 * 
 * @param b The above code defines a method named "add" that takes an integer parameter named "a". The
 * method adds 10 to the value of "a" and returns the result.
 * @return The method `add` takes an integer `a` as input and returns the value of `a` plus 10.
 */
    public int add(int b) {
        return b + 10;
    }


   /**
    * The function subtracts 15 from the input integer.
    * 
    * @param a The parameter "a" is an integer value that will be subtracted by 15 in the method.
    * @return The method `subtract` takes an integer `a` as input, subtracts 15 from it, and returns
    * the result. So, the method is returning the value of `a - 15`.
    */
    public static int subtract(int a) {
        return a  - 15;
    }
}
