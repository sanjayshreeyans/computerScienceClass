// Author: Sanjay Javangula
// Date Feb 10th 2023
// Pizza Assignment

import java.util.*;
public class Pizza {
    public static void main(String[] args) {
        
        // Initiate Scanner instance
        Scanner sc = new Scanner(System.in);

    
         // Prompt user for input, num of pizzas
        System.out.print("#Pizza:\t\t");
        int numOfPizzas = sc.nextInt();

        // Print the cost of the pizza
        System.out.print("Price:\t\t$");
        double price = sc.nextDouble();

        // calculate the subtotal
        double subtotal = numOfPizzas * price;
        System.out.printf("Subtotal:\t$%.2f", subtotal);

        // Calculate tax, 13 percent
        double tax = subtotal * 0.13;

        System.out.printf("\nTax:\t\t$%.2f", tax);

        // Final Price
        double finalPrice = subtotal+tax;

        System.out.printf("\nTotal Price:\t$%.2f\n", finalPrice);

        sc.close();


        // division of two integers, result is an double. Print the result with 2 decimal places
        
       
        
    }
}