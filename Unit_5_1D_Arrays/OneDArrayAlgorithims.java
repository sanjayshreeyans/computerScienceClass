
// Author: Sanjay Javangula
// Date: 2023-05-12 9:28:11

import java.util.Arrays;

public class OneDArrayAlgorithims {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 }; // This is an array of integers called numbers. It can hold 4 integers.

        // Method overloading is a feature that allows us to have multiple methods with
        // the same name, but different parameters. Java will differenciate between the
        // methods based on the parameters.

        // The print method is overloaded. It has 3 different versions. One for
        // integers, one for doubles, and one for Strings.

        print(numbers); // This will call the print method that takes an integer array as a parameter.

        double[] decimals = { 1.0, 2.0, 3.0, 4.0, 5.0 }; // This is an array of doubles called decimals. It can hold 4
                                                         // doubles.

        print(decimals); // This will call the print method that takes a double array as a parameter.

        String[] names = { "Sanjay", "Stephanie", "Samantha", "Romy" }; // This is an array of Strings called names. It
                                                                        // can hold 4 Strings.

        print(names); // This will call the print method that takes a String array as a parameter.

        // Maxiumum Method
        System.out.println("The maximum value in the array is: " + maximum(numbers));

        // Minimum Method
        System.out.println("The minimum value in the array is: " + minimum(numbers));

        // Sum of Elements Method
        System.out.println("The sum of all the elements in the array is: " + sumOfElements(numbers));

        // Average Method
        System.out.println("The average of all the elements in the array " +"is: " + average(numbers));

        // Append Method
        System.out.println("Names list before appending: " + Arrays.toString(names));
        names = appendItem(names, "Wendy");
        System.out.println("Names list after appending: " + Arrays.toString(names));

        // Swap Method
        // System.out.println("Numbers list before swapping: " + Arrays.toString(names));
        // names = swap(names, 0, 4);
        // System.out.println("Numbers list after swapping: " + Arrays.toString(names));

        String[] student_names = {"Luka", "Artimij", "Cian", "Andrew", "Stephanie"};
        System.out.println("Student names before swapping: " + Arrays.toString(student_names));
        student_names = swap(student_names, 2, 4);
        System.out.println("Student names after swapping: " + Arrays.toString(student_names));


        // Shuffle Method
        System.out.println("Numbers list before shuffling: " + Arrays.toString(numbers));
        numbers = shuffle(numbers);
        System.out.println("Numbers list after shuffling: " + Arrays.toString(numbers));

    }


    /**
     * The function prints out all the elements in an integer array separated by
     * commas, with a newline
     * character at the end.
     * 
     * @param array an integer array that contains the elements to be printed.
     */
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) { // for each element in the array
            if (i + 1 == array.length) // if the element is the last element
            {
                System.out.print(array[i] + "\n"); // print the element

            } else {
                System.out.print(array[i] + ", "); // print the element and a comma
            }

        }
    }

    /**
     * The function prints out all the elements in a double array separated by
     * commas, with a newline
     * character at the end.
     * 
     * @param array The parameter "array" is a one-dimensional array of type double.
     */
    public static void print(double[] array) {
        for (int i = 0; i < array.length; i++) { // for each element in the array
            if (i + 1 == array.length) // if the element is the last element
            {
                System.out.print(array[i] + "\n"); // print the element

            } else {
                System.out.print(array[i] + ", "); // print the element and a comma
            }

        }
    }

    /**
     * The function prints out all elements in a string array separated by commas,
     * with the last element
     * followed by a newline character.
     * 
     * @param array The parameter "array" is an array of Strings that will be
     *              printed out by the method.
     */
    public static void print(String[] array) {
        for (int i = 0; i < array.length; i++) { // for each element in the array
            if (i + 1 == array.length) // if the element is the last element
            {
                System.out.print(array[i] + "\n"); // print the element

            } else {
                System.out.print(array[i] + ", "); // print the element and a comma
            }

        }
    }

    /**
     * The function finds and returns the maximum value in an integer array.
     * 
     * @param array an integer array that contains the elements for which we want to
     *              find the maximum
     *              value.
     * @return The maximum value in the input integer array is being returned.
     */
    public static int maximum(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    /**
     * The function finds and returns the minimum value in an integer array.
     * 
     * @param array an integer array for which we want to find the minimum value.
     * @return The minimum value in the input array is being returned.
     */

    public static int minimum(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;

    }

    /**
     * The function calculates the sum of all elements in an integer array.
     * 
     * @param array an integer array containing the elements whose sum needs to be
     *              calculated.
     * @return The method `sumOfElements` returns an integer value which is the sum
     *         of all the elements in
     *         the input array.
     */
    public static int sumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];
        }
        return sum;
    }


/**
 * The function calculates the average of an array of integers.
 * 
 * @param array an integer array for which we want to calculate the average of its elements.
 * @return The method is returning the average value of the elements in the input integer array.
 */
    public static double average(int[] array) {
        int sum = sumOfElements(array);
        double average = (double) sum / array.length; // We need to cast the sum to a double so that the average is a double.
        return average;

    }

/**
 * The function appends a new item to a given array and returns the new array.
 * 
 * @param array The original array of type String[] to which the new item needs to be appended.
 * @param item The item parameter is a String that we want to add to the end of the array.
 * @return The method `appendItem` is returning a new String array with the original array's elements
 * and the new item appended at the end.
 */
    public static String[] appendItem(String[] array, String item) {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        newArray[newArray.length - 1] = item;
        return newArray;
    }

/**
 * The function swaps two elements in a string array and returns the modified array.
 * 
 * @param array an array of Strings that we want to modify by swapping two elements
 * @param index1 The index of the first element to be swapped in the array.
 * @param index2 The parameter "index2" is an integer representing the index of the second element in
 * the array that we want to swap with the element at "index1".
 * @return The method is returning the updated array after swapping the elements at the specified
 * indices.
 */
    public static String[] swap(String[] array, int index1, int index2) {

        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        return array;
    }



/**
 * The function swaps the elements at two given indices in an integer array and returns the modified
 * array.
 * 
 * @param array an integer array that contains the elements to be swapped
 * @param index1 The index of the first element to be swapped in the array.
 * @param index2 index2 is an integer parameter representing the index of the second element to be
 * swapped in the array.
 * @return The method is returning the updated array after swapping the elements at the specified
 * indices.
 */
    public static int[] swap(int[] array, int index1, int index2) {
        // Method overloading: we can have two methods with the same name as long as they have different parameters.
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        return array;
    }

/**
 * The function shuffles an array of integers randomly.
 * 
 * @param array an integer array that needs to be shuffled randomly.
 * @return The method `shuffle` returns an array of integers that has been shuffled randomly.
 */
    public static int[] shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = (int) (Math.random() * array.length);
            swap(array, i, randomIndex);
        }
        return array;
    }


    }


