
// Author: Sanjay Javangula
// Date: 2023-03-08 14:51:57

// import scanner
import java.util.Scanner;

public class rangeFinder {

    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter 3 numbers
        System.out.println("Enter the numbers: ");

        int firstInt = sc.nextInt();
        int SecondInt = sc.nextInt();
        int ThirdInt = sc.nextInt();

        // sort the numbers from ascending order, using if statements
        // Example, 2,4,9
    

        if (firstInt < SecondInt && firstInt < ThirdInt && SecondInt > ThirdInt) {

            
                System.out.print(firstInt + ", " +  ThirdInt + ", " + SecondInt);


        }
        
        else if (SecondInt < firstInt && SecondInt < ThirdInt && firstInt > ThirdInt) {

            
                System.out.print(SecondInt + ", " +  ThirdInt + ", " + firstInt);


    }
        else if (ThirdInt < firstInt && ThirdInt < SecondInt && firstInt > SecondInt) {

            
                System.out.print(ThirdInt + ", " +  SecondInt + ", " + firstInt);

      
        
       
    }
        else  {

            
                System.out.print(firstInt + ", " +  SecondInt + ", " + ThirdInt);
}

}
}