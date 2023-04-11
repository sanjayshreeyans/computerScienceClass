
// Author: Sanjay Javangula
// Date: 2023-03-29 10:28:50

// Import Scanner
import java.util.Scanner;
public class SentinialWhileLoop {
    // Takes input of student's marks,  averages them

    public static void main(String[] args) {

        int mark =0;
        int sum = 0;
        int count = 0;
        double average = 0;

        Scanner sc = new Scanner(System.in);

        // Sentinel while loop 

        while (mark != -1 ) {
            System.out.print("Mark#" + (count+1) + ": " );
            mark = sc.nextInt();

            if (mark!=-1) {

                count++;
                sum = sum + mark;
            }


        }

        average = sum*1.0/count;
        System.out.printf("Average = %.2f", average);
        
    }
}
