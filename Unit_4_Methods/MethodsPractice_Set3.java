
// Author: Sanjay Javangula
// Date: 2023-04-21


// Author: Sanjay Javangula
// Date: 2023-04-21

public class MethodsPractice_Set3 {

    public static void main(String[] args) {

        // Use the result method to print the table
        result(2, 10);
    
    }


    
    

    public static void result(int base, int exponent) {
        
      // Print title
        System.out.println("Base\tExponent\tResult");
        for (int i = 1; i <= exponent; i++) {
            System.out.println(base + "\t" + i + "\t\t" + Math.pow(base, i));
        } 

    }
}