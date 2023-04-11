

// Author: Sanjay Javangula
// Date: March 2nd 2023
public class RandomNumberGenerator
{
    public static void main(String[]args) {
        
        // Generate random numbers between 1-49
        
        int randomNum1 = (int) (Math.random()*(49)+1);
        int randomNum2 = (int) (Math.random()*(49)+1);
        int randomNum3 = (int) (Math.random()*(49)+1);
        int randomNum4 = (int) (Math.random()*(49)+1);
        int randomNum5 = (int) (Math.random()*(49)+1);
        int randomNum6 = (int) (Math.random()*(49)+1);
           
        System.out.println("The winning nums: " + randomNum1 + " " + randomNum2 + " " + randomNum3 + " " + randomNum4 + " " + randomNum5 + " " + randomNum6) ;
    }
    
}
