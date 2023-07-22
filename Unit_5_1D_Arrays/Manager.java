
// Author: Sanjay Shreeyans Javangula
// Date: 2023-05-23 09:46:52


public class Manager {
    
    public static void main(String[] args) {

        // Simple Calculator instance
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        System.out.println("The sum of 2 and 3 is: " + simpleCalculator.add(2, 3));
        System.out.println("The difference of 2 and 3 is: " + simpleCalculator.subtract(2, 3));

        // Meetings instance
        Meetings m = new Meetings();
        m.Monday();


        int[] array = new int[10];

        for (int i = 1; i <= 10; i++) {
            array[i - 1] = i;

        }
        // Print array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
