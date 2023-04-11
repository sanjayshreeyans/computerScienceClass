
// Author: Sanjay Javangula
// Date: 2023-03-08 14:06:53

// import scanner
import java.util.Scanner;
public class PasswordChecker {

    public static void main(String[] args) {
        
        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Declare usernames and passwords

        // Administrative access
        String admin_username = "smith";
        String admin_pass = "watermelon@123";

        // Guest access
        String guest_username = "guest";
        String guest_pass = "SanjayIsOk";

        // Get login info
        System.out.print("Login: ");
        String userLogin = sc.nextLine();

        // Get password info
        System.out.print("Password: ");
        String userPass = sc.nextLine();


        if (userLogin.equals(admin_username)) {
            
            if (userPass.equals(admin_pass)) {

                System.out.print("Administrative Access Granted!!!");

            }

            else {
                System.out.print("Administrative Access Denied!!!");
                
            }

        }
        
        else if (userLogin.equals(guest_username)) {
            if (userPass.equals(guest_pass)) {

                System.out.print("Guest Access Granted!!!");

            }

            else {
                System.out.print(" Guest Access Denied!!!");
                
            }

        }

        else {
            System.out.print("Try Again Later");

        }



    }
}
