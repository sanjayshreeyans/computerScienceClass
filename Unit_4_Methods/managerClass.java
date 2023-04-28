

// Author: Sanjay Javangula
// Date: 4/18/2023, 9:31:42 AM

public class managerClass {

    /**
    * The main method of the class. This method is called when the program starts. The first argument is the name of the class that contains the methods to be called.
    * 
    * @param args - The command line arguments
    */
    public static void main(String[] args) {
        
        // Create an object of the calculator A1 class
        CalculatorA1 calc = new CalculatorA1();

        // Create an object of the meetings class
        Meetings meet = new Meetings();

        // Call the sum add method
        //System.out.println("Sum of 5 and 6 = " + calc.add(5, 6));

        // call the add method directly
        System.out.println("Sum of 5 and 6 = " + CalculatorA1.add(5, 6));
        // Call the monday method
        meet.monday("Sanjay");
        
        // Call the function method from calculator
        System.out.println(calc.function(4));
        
    
    }
    
}
