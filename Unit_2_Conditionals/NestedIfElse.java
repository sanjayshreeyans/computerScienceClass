
// Author: Sanjay Javangula 
// Date: March 1 2023

// Usage of Nested If else Statements

// Import Scanner
import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        // Problem Statement: In order for the donor to be able to donate blood, he/she should be at least 18 years old 
        // and weigh more than 100 pounds.

        // Write a program that prompts the user to enter the age of the donor and the weight of the donor

        // Create a Scanner instance
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Prompt the user to enter the weight
        System.out.print("Enter your weight in pounds: ");
        int weight = input.nextInt();

        // Use nested if else statements to determine if the donor is old enough to donate blood
        if (age >= 18) {
            if (weight >= 100) {
                System.out.println("The donor can donate blood");
            } else {
                System.out.println("Donor is old enough to donate blood, but the weight is less than 100 pounds");
            }
        } else {
            System.out.println("Donor is not old enough to donate blood");
        }


    }
}