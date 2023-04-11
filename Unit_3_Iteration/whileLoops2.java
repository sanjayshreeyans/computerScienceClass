
// The code begins by prompting the user to enter the amount of money they have in their retirement account. The amount of money is stored in the variable amountOfRetirementMoney. Then, the code prompts the user to enter the amount of money they wish to withdraw every year. The amount of money is stored in the variable money. The code then determines if the user has entered -1, if they have, the code will stop, if not, the code will determine if the amount of money left in the retirement account is less than the amount of money the user wishes to withdraw. If it is, the code will stop, if not, the code will subtract the amount of money the user wishes to withdraw from the amount of money left in the retirement account and then display the amount of money left in the retirement account. The code will repeat this process until the user enters -1 or the amount of money left in the retirement account is less than the amount of money the user wishes to withdraw.


// The variable count is used to keep track of the year the user is withdrawing money from their retirement account.

// The variable amountOfRetirementMoney is used to store the amount of money the user has in their retirement account.

// The variable money is used to store the amount of money the user wishes to withdraw from their retirement account every year.




// Author: Sanjay Javangula
// Date: 3/29/2023, 6:37:26 PM 

// Import Scanner
import java.util.Scanner;

public class whileLoops2 {

  public static void main(String[] args) {
    
    // Scanner Instance
    Scanner sc = new Scanner(System.in);

    // Prompt for retirement money
    System.out.print("Retirement Account: ");
    double amountOfRetirementMoney = sc.nextInt();

    System.out.println("\nWithdrawals");

    int count = 1;
    while (amountOfRetirementMoney > 0) {

      System.out.print("Year " + count + ":");
      double money = sc.nextDouble();

      if (money == -1) {
         break;
      }
      
      else {
         amountOfRetirementMoney-=money;
         count++;
      }


    } 
    System.out.println("You have $" + amountOfRetirementMoney + " left.");




    
  }
    
}
