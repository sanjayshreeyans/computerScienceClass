// Author: Sanjay Javangula
// Date: 2023-03-06 14:10:58

// Import Scanner
import java.util.Scanner;
public class PracticeProblems {

    public static void main(String[] args) {

        // Scanner object
      Scanner sc = new Scanner(System.in);

      // Prompt the user for regular price
        System.out.print("Enter the regular price of the item: ");
        double regularPrice = sc.nextDouble();

    // Show the available options for dept
    System.out.println("Audio Department: 310");
    System.out.println("Video Department: 438");
    System.out.println("Computer Department: 284");
    System.out.println("Communications Department: 652");
    System.out.println("Everything else: 0");

    // Prompt the user for dept
    System.out.print("Enter the departement code: ");
    int departmentCode = sc.nextInt();
    double discountPercent;
    switch (departmentCode) {

        case 310:
            discountPercent = 0.10;
            break;

        case 438:
            discountPercent = 0.12;
            break;
        
        case 284:
            discountPercent = 0.08;
            break;

        case 652:
            discountPercent = 0.15;
            break;

        default:
            discountPercent = 0.05;
            break;
        

    }

    double salePrice =  (regularPrice * (1-discountPercent));
    // System.out.println((discountPercent + 1));
    System.out.printf("The item that was %.2f is now %.2f", regularPrice, salePrice);





    }

}


// Problem 1
        // Scanner object
        // Scanner sc = new Scanner(System.in);

        // // Prompt the user to enter 3 integers
        // System.out.println("Enter three integers: ");
        
        // // Store the integers
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();
        // int greatestNum;

        // if (num1 > num2) {
        //     greatestNum = num1;
        // }

        // else {
        //     greatestNum = num2;
        // }

        // if (greatestNum > num3) {
        //     System.out.println("The greatest number is: " + greatestNum);
        // }

        // else {
        //     System.out.println("The greatest number is: " + num3);
        // }

// Problem 2
// int randomNumber = (int) (Math.random()*7+1);
// if (randomNumber == 1) {
//     System.out.println("Day: Monday");
// }

// else if (randomNumber == 2) {
//     System.out.println("Day: Tuesday");
// }

// else if (randomNumber == 3) {
//     System.out.println("Day: Wednesday");
// }
// else if (randomNumber == 4) {
//     System.out.println("Day: Thursday");
// }

// else if (randomNumber == 5) {
//     System.out.println("Day:  Friday");
// }

// else if (randomNumber == 6) {
//     System.out.println("Day: Saturday");
// }

// else  {
//     System.out.println("Day: Sunday");
// }

