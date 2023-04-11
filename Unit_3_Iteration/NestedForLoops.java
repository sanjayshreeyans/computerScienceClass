// Author: Sanjay Javangula
// Date: 2023-03-27 13:18:42

// Import Scanner
import java.util.Scanner;

public class NestedForLoops {

  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= 3; i++) {
      System.out.print("Name: ");
      String name = sc.nextLine();
      double sum = 0;
      for (int j = 1; j <= 4; j++) {
        System.out.print("Test#" + j + "  = ");
        double score = sc.nextDouble();
        sum += score;
      }

      System.out.println("Average: " + (sum / 4) + "\n");
      sc.nextLine();
    }
  }
}
// Printing a multiplication table to the table.

    // Output: 1 2 3 4 5 6 7 8 9
    // Output:  2 4 6 8 10 12 14 16 12
    // Output: 3 6 9 12 15 18 21 24 27
    // Output: 4 8 12 16 20 24 28 32 36

    // We can do this by using a for loop below

    //     for (int i = 1; i <=10; i++) {

    //         for(int j = 1; j <=10; j++) {
    //         System.out.print(i*j + "\t");

    //     }
    //     System.out.println();
    // }

    //Write a program that asks 3 students to enter their marks on 4 tests, then the program calculates each student's average and prints them to the console. Look at the output below:

    // Name: Maria
    // Test#1 = 60
    // Test#2 = 67
    // Test#3 = 70
    // Test#1 = 74
    // Average: 75

    // Scanner Instance