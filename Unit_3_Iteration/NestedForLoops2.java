
// Author: Sanjay Javangula
// Date: 2023-03-27 20:41:06


// Class Declaration

public class NestedForLoops2 {

    // Main Declaration

    public static void main(String[] args) {

    // Create the following patterns using nested for loops

    //     c)
    //       *
    //      * *
    //     * * *
    //    * * * *
    //   * * * * *
    //  * * * * * *

    
    String space = " ";

    for(int i = 6; i >=1; i--) {

        for(int t = 1; t <= i; t++) {
            System.out.print(" ");
        }
 
        for(int j = 1; j <= (6-(i))+1; j++) {
            System.out.print("* ");
        }
        
        System.out.println();
    }

    }
}