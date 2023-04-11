
// This code is used to calculate the sum of all the numbers from 16 to 11



// Author: Sanjay J
// Date: 2023-03-31 10:30:39 
public class doWhileLoop {
    public static void main(String[] args ) {

        // Do do while loop java
        
        int x = 16;
        int sum =0;

        // Do while loop

        do {
            x--;
            System.out.println(x);
            sum+=x;
        }
        while(x>10);
        System.out.println("Sum = " + sum);



    }
}
