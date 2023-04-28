
// Author: Sanjay Javangula
// Date: 4/18/2023, 9:57:42 AM
public class InstanceAndClassMethods {

        // Main method
        public static void main(String[] args) {
            
            // Calling static method
            int sum =  add(10, 20);

            // Calling instance method
            InstanceAndClassMethods obj = new InstanceAndClassMethods();
            int product = obj.product(10, 20);

            // Most of the programs in java have instance methods.

            // Print both sum and product variables
            System.out.println(sum + " " + product);

        }


        // Difference between instances and classes methods
        // Instance methods are called on objects
        // Class methods are called on the class itself
        // How to tell the difference?
        // Class methods have static in front of them
        // Instance methods do not have static in front of them


        // Create a class method add
        public static int add(int n1, int n2) {
            return n1 + n2;
        }

        // Create an instance method add
        public int product(int n1, int n2) {
            return n1 * n2;
        }

        // Private methods are not visible outside the class
        // Private methods are only visible inside the class
        // Private methods are not inherited
        // Private methods are not overriden
        
        // Public methods are visible outside the class
        // Public methods are visible inside the class
        // Public methods are inherited
        // Public methods are overriden

}
