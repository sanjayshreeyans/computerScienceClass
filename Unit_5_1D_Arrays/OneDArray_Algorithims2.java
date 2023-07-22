
// Author: Sanjay Shreeyans Javangula.
// Date: 2023-05-16 10:10:43

import java.util.Arrays;

public class OneDArray_Algorithims2 {

    public static void main(String[] args) {

        // Insert Method

        int[] numbers = { 1, 2, 3, 4, 5 }; // This is an array of integers called numbers. It can hold 4 integers.
        System.out.println("Numbers list before inserting: " + Arrays.toString(numbers));
        numbers = insert(numbers, 3, 10);
        System.out.println("Numbers list after inserting: " + Arrays.toString(numbers));

        // Remove Method

        System.out.println("Numbers list before removing: " + Arrays.toString(numbers));
        numbers = remove(numbers, 3);
        System.out.println("Numbers list after removing: " + Arrays.toString(numbers));

        // Reverse method
        System.out.println("Numbers list before reversing: " + Arrays.toString(numbers));
        numbers = reverse(numbers);
        System.out.println("Numbers list after reversing: " + Arrays.toString(numbers));

        // Reverse Print method
        reversePrint(numbers);

        // Linear Search method
        System.out.println("The index of the value 3 is: " + linearSearch(numbers, 3));

        

    
    }

    /**
     * The function inserts a value into an array at a specified index and returns
     * the updated array.
     * 
     * @param a     an integer array that represents the original array before
     *              insertion
     * @param index The index parameter is an integer representing the position at
     *              which the value
     *              parameter should be inserted in the array.
     * @param value The value to be inserted into the array.
     * @return The method is returning an integer array with the inserted value at
     *         the specified index.
     */
    public static int[] insert(int[] a, int index, int value) {

        int[] tempArray = new int[a.length + 1];

        for (int i = 0; i < tempArray.length; i++) {

            if (i == index) {
                tempArray[i] = value;
            } else if (i < index) {
                tempArray[i] = a[i];
            } else {
                tempArray[i] = a[i - 1];
            }

        }
        return tempArray;

    }

    /**
     * The function removes an element from an integer array at a specified index
     * and returns a new array
     * with the element removed.
     * 
     * @param array an integer array from which an element needs to be removed
     * @param index The index parameter is an integer that represents the index of
     *              the element that needs
     *              to be removed from the array.
     * @return The method is returning an integer array that is a modified version
     *         of the input array with
     *         the element at the specified index removed.
     */
    public static int[] remove(int[] array, int index) {

        int[] tempArray = new int[array.length - 1];

        for (int i = 0; i < tempArray.length; i++) {

            if ((i == index) || (i > index)) {
                tempArray[i] = array[i + 1];
            } else {
                tempArray[i] = array[i];
            }

        }
        return tempArray;

    }

    /**
     * The function takes an array of integers and returns a new array with the
     * elements in reverse order.
     * 
     * @param array an integer array that needs to be reversed.
     * @return The method is returning an integer array that contains the elements
     *         of the input array in
     *         reverse order.
     */
    public static int[] reverse(int[] array) {

        int[] a = new int[array.length];
        int ArrayLength = (array.length) - 1;
        int index = 0;

        for (int i = ArrayLength; i >= 0; i--) {

            a[index] = array[i];
            index++;

        }

        return a;

    }

    /**
     * The function takes an array of integers, reverses it, and then prints the
     * reversed array.
     * 
     * @param array an integer array that contains the elements to be printed in
     *              reverse order. The method
     *              `reversePrint` takes this array as input and prints its elements
     *              in reverse order using the `print`
     *              method from the `OneDArrayAlgorithms` class. The `reverse`
     *              method is called to reverse the order
     */
    public static void reversePrint(int[] array) {

        int[] reversedArray = reverse(array);
        OneDArrayAlgorithims.print(reversedArray);

    }

    /**
     * The function performs a linear search on an integer array to find a specific
     * value and returns its
     * index or -1 if not found.
     * 
     * @param array an integer array in which the linear search algorithm will
     *              search for the given value.
     * @param value The value parameter is the integer value that we are searching
     *              for in the array. The
     *              method will return the index of the first occurrence of this
     *              value in the array, or -1 if the value
     *              is not found in the array.
     * @return The method `linearSearch` returns the index of the first occurrence
     *         of the `value` in the
     *         `array`. If the `value` is not found in the `array`, it returns `-1`.
     */
    public static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                return i;
            }

        }

        return -1;

    }

}
