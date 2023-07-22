
 
// Author: Sanjay Shreeyans Javangula
// Date: 2023-05-31 10:11:18

import java.util.Scanner;

public class MoreArrays {

    public static void main(String[] args) {

        String[] finalResult = getStudents();
       print(finalResult);
    }
    
    public static String[] getStudents() {
        String[] students = new String[8];

        // Scanner instance
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = sc.nextLine();
        }

    
        // Randomly select a three students from the list, 0-7
        int random1 = (int) (Math.random() * 8);
        int random2 = (int) (Math.random() * 8);
        int random3 = (int) (Math.random() * 8);
        
        // Make sure they don't have repeated values.
        while (random1 == random2 || random1 == random3 || random2 == random3) {
            random1 = (int) (Math.random() * 8);
            random2 = (int) (Math.random() * 8);
            random3 = (int) (Math.random() * 8);
        }
        
        // New Array
        String[] selectedStudents = new String[3];

        // Assigning the randomly selected students to the new array
        selectedStudents[0] = students[random1];
        selectedStudents[1] = students[random2];
        selectedStudents[2] = students[random3];

        return selectedStudents;

    }

    public static void print(String[] array) {
        for (int i = 0; i < array.length; i++) { // for each element in the array
            
                System.out.print(array[i] + "  "); // print the element and a comma
            

        }
    }

}
