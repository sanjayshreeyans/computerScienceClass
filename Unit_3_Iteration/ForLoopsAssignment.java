// Author: Sanjay Javangula
// Date: 2023-03-24 13:17:54


public class ForLoopsAssignment {

    public static void main(String[] args) {

        // Using a for loop write a program that finds the sum of the odd integers from 1 to 15. The output
        // should be as shown below.
        // Output Example
        // The sum of 1+3+5+7+9+11+13+15 is 64


        int sum=0;

        System.out.print("The sum of ");
        
        for (int i = 1; i<=15; i+=2) {
            
            if (i == 15) {
                System.out.print(i);
            }

            else {

            System.out.print(i + " + ");

            }
            sum+=i;
        }
        
        System.out.println(" is " + sum);

        
}
}