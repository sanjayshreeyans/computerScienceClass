
import java.util.Arrays;
import java.util.Scanner;

public class ChallengingMethods {
    public static void main(String[] args) {
        // Call Each method
        int[] testArray = { 1, 2, 3, 4, 5,6,7,8};

        // Two Digits
        System.out.println("Two Digits: " + twoDigits(testArray));

        // Cut First Two
        int[] cutArray = cutFirstTwo(testArray);
        System.out.println("Cut First Two: " + Arrays.toString(cutArray));

        // How Many
        System.out.println("How Many: " + howMany(testArray, 5));

        // Splice Even Indices
        int[] spliceArray = spliceEvenIndices(testArray);
        System.out.println("Splice Even Indices: " + Arrays.toString(spliceArray));

        // Sumsome
        System.out.println("Sumsome: " + sumsome(testArray));

        // Halfswap
        int[] halfswapArray = halfswap(testArray);
        System.out.println("Halfswap: " + Arrays.toString(halfswapArray));

        // Sumsome with howMany
        System.out.println("Sumsome with howMany: " + sumsome(testArray, 3));

        // Mirror
        int[] mirrorArray = mirror(testArray);
        System.out.println("Mirror: " + Arrays.toString(mirrorArray));

        // Select Names
        String[] selectedNames = selectNames();
        System.out.println("Selected Names: " + Arrays.toString(selectedNames));

        // Name
        System.out.println("Name: " + name("John Doe"));

    }

/**
 * The function "twoDigits" counts the number of elements in an integer array that have two digits.
 * 
 * @param arr an integer array containing some elements.
 * @return The method `twoDigits` returns an integer value which represents the count of elements in
 * the input array `arr` that have two digits.
 */
    public static int twoDigits(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 10 && arr[i] <= 99) {
                count++;
            }

        }

        return count;

    }
/**
 * The function removes the first two elements of an integer array and returns a new array with the
 * remaining elements.
 * 
 * @param arr an integer array that contains the original values.
 * @return An integer array with the first two elements removed.
 */

    public static int[] cutFirstTwo(int[] arr) {

        int[] newArr = new int[arr.length - 2];

        for (int i = 2; i < arr.length; i++) {
            newArr[i - 2] = arr[i];
        }

        return newArr;

    }

/**
 * The function "howMany" takes an array and a value as input and returns the number of times the value
 * appears in the array.
 * 
 * @param arr an integer array that contains the values to be searched for the given value
 * @param value The value to count the number of occurrences of in the array.
 * @return The method is returning the number of times the given value appears in the given array.
 */
    public static int howMany(int[] arr, int value) {

        // Figure out how many times value appears in arr

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                count++;
            }

        }

        return count;

    }

/**
 * The function takes an array of integers, separates even and odd numbers into two arrays, and then
 * merges them back into a new array with even numbers first and odd numbers second.
 * 
 * @param arr an integer array that contains the elements to be processed. The method
 * `spliceEvenIndices` takes this array as input and returns a new array that contains all the even
 * numbers in the input array followed by all the odd numbers in the input array.
 * @return The method is returning an integer array that contains all the elements of the input array,
 * but with the even-indexed elements first, followed by the odd-indexed elements.
 */
    public static int[] spliceEvenIndices(int[] arr) {

        // Figure out the number of even numbers in the array
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] % 2) == 0) {
                // Even numbers
                countEven++;

            }

            else {

                countOdd++;

            }

        }

        // Create an array
        int[] evenNumbers = new int[countEven];
        int[] oddNumbers = new int[countOdd];

        // Fill the array with even numbers
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] % 2) == 0) {
                // Even numbers
                evenNumbers[evenIndex] = arr[i];
                evenIndex++;

            }

            else {

                oddNumbers[oddIndex] = arr[i];
                oddIndex++;

            }

        }

        // Merge both arrays
        int[] finalArr = new int[arr.length];

        for (int i = 0; i < evenNumbers.length; i++) {

            finalArr[i] = evenNumbers[i];

        }

        for (int i = 0; i < oddNumbers.length; i++) {

            finalArr[i + evenNumbers.length] = oddNumbers[i];

        }

        return finalArr;

    }

/**
 * The function "sumsome" takes an array of integers and returns the sum of all elements at odd
 * indices.
 * 
 * @param arr an integer array that contains the elements to be summed.
 * @return The method `sumsome` returns an integer value which is the sum of all elements in the input
 * array `arr` that have an odd index (i.e., the elements at positions 1, 3, 5, etc.).
 */
    public static int sumsome(int[] arr) {

        int sum = 0;

        for (int i = 1; i < arr.length; i += 2) {

            sum += arr[i];

        }

        return sum;

    }


/**
 * The "halfswap" function takes an array of integers, determines if it is even or odd, and swaps the
 * first and second halves of the array.
 * 
 * @param arr an integer array that we want to perform a half-swap operation on.
 * @return The method is returning an integer array that has been modified according to the halfswap
 * algorithm.
 */
    public static int[] halfswap(int[] arr) {
        // Figure out if the array is even or odd
        boolean isEven = false;
        if ((arr.length % 2) == 0) {
            isEven = true;
        }

        // Figure out the middle index
        int middleIndex = Math.round(arr.length / 2);
        System.out.println("Middle Index: " + middleIndex);
        // New array
        int[] newArr = new int[arr.length];

        // Define ranges
        int secondPairIndex = 0;
        int firstPairIndex = middleIndex + 1;

        // Fill the array
        if (!isEven) {
            // Odd
            for (int i = 0; i < arr.length; i++) {

                if (i < middleIndex) {
                    // First Pair
                    newArr[firstPairIndex] = arr[i];
                    firstPairIndex++;
                }

                else if (i > middleIndex) {
                    // Second Pair
                    newArr[secondPairIndex] = arr[i];
                    secondPairIndex++;
                }

                else {
                    // Middle Index
                    newArr[middleIndex] = arr[i];
                }

            }
        }

        else {
            // Even
            for (int i = 0; i < arr.length; i++) {

                if (i < arr.length/2) {
                    // First Pair
                    newArr[i] = arr[i+arr.length/2];
                    firstPairIndex++;
                }

                else  {
                    // Second Pair
                    newArr[i] = arr[Math.abs(arr.length/2 - i)];
                    secondPairIndex++;
                }

            }
        }

        return newArr;

    }

/**
 * The function "sumsome" takes an array and an integer as input, and returns the sum of the first
 * "howMany" elements of the array (or all elements if "howMany" is greater than the length of the
 * array).
 * 
 * @param arr an integer array containing the numbers to be summed up
 * @param howMany The number of elements from the beginning of the array to be summed up.
 * @return The method `sumsome` returns an integer value which is the sum of the first `howMany`
 * elements in the input integer array `arr`.
 */
    public static int sumsome(int[] arr, int howMany) {

        if (howMany > arr.length) {
            howMany = arr.length;
        }

        int sum = 0;
        for (int i = arr.length-1; i > (arr.length -1 )-howMany; i--) {

            sum += arr[i];

        }

        return sum;
    }

/**
 * The "mirror" function takes an array and returns a new array that is a mirrored version of the
 * original array appended at the end.
 * 
 * @param arr an integer array that will be mirrored
 * @return The method is returning an integer array that contains the original array followed by its
 * mirror image.
 */
    public static int[] mirror(int[] arr) {

        int[] mirrorArr = new int[arr.length * 2];
        int mirrorIndex = arr.length - 1;

        for (int i = 0; i < mirrorArr.length; i++) {

            if (i <= mirrorIndex) {

                mirrorArr[i] = arr[i];
            }

            else {

                mirrorArr[i] = arr[mirrorIndex];
                mirrorIndex--;

            }

        }

        return mirrorArr;

    }


   /**
    * This function prompts the user to enter 8 names, selects 3 random names from the list, and
    * returns them in a new array.
    * 
    * @return The method is returning an array of three randomly selected names from an array of eight
    * names entered by the user.
    */
    public static String[] selectNames() {

        // Scanner Instance
        Scanner scanner = new Scanner(System.in);

        // Create the array
        String[] list = new String[8];

        // Fill the array
        for (int i = 0; i < list.length; i++) {

            System.out.println("Enter a name: ");
            list[i] = scanner.nextLine();

        }

        // Random number generator
        int random1 = (int) (Math.random() * 8);
        int random2 = (int) (Math.random() * 8);
        int random3 = (int) (Math.random() * 8);

        // New Array with the random names

        String[] selectedList = new String[3];
        selectedList[0] = list[random1];
        selectedList[1] = list[random2];
        selectedList[2] = list[random3];

        scanner.close();

        return selectedList;

    }

        


    /**
     * The function takes a full name as input, splits it into first and last name, and returns the
     * first letter of the first name followed by a period and the last name.
     * 
     * @param fullName The full name of a person as a String.
     * @return The method is returning a string that contains the first letter of the first name,
     * followed by a period and a space, and then the last name. This format represents a shortened
     * version of the full name, with only the first initial of the first name and the full last name.
     */
    public static String name(String fullName) {

        // Split the string
        String[] splitName = fullName.split(" ");

        // Get the first letter of the first name
        String firstLetter = splitName[0].substring(0, 1);

        // Get the last name
        String lastName = splitName[1];

        // Return the name
        return firstLetter + ". " + lastName;

    }


}
