
// Author: Sanjay Javangula
// Date: May 11th 2023

/**
 * This is a Java class for basic operations on one-dimensional arrays.
 */


public class OneDArray_Basics {

    public static void main(String[] args) {
        //  Using variables to store data is not efficient, especially when we have a lot of data. Here we have 4 names, but what if we had 100 names?

        String name1 = "Sanjay";
        String name2 = "Stephanie";
        String name3 = "Samantha";
        String name4 = "Romy";
        
       
        // Another bad soution is using print statements, but this is not efficient either. What if we had 100 names?

        System.out.println("Sanjay" + " Stephanie" + " Samantha" + " Romy");

        
        // Arrays are a way to store multiple values of the same type in a single variable.

        // Here we are creating an array of Strings called names. The array can hold 4 Strings. It is a good solution because we can store 100 names in the same variable.

        String[] names = new String[4]; // This is an array of Strings called names. It can hold 4 Strings.

        // We can access the elements of the array using the index. The index starts at 0. So the first element is names[0], the second element is names[1], the third element is names[2], and the fourth element is names[3].
        
        // names is a list of strings
        names[0] = "Sanjay"; // the first string is called "Sanjay"
        names[1] = "Stephanie"; // the second string is called "Stephanie"
        names[2] = "Samantha"; // the third string is called "Samantha"
        names[3] = "Romy"; // the fourth string is called "Romy"

       // Array of integers
         int[] numbers = new int[4]; // This is an array of integers called numbers. It can hold 4 integers.

        // We can access the elements of the array using the index. The index starts at 0. So the first element is numbers[0], the second element is numbers[1], the third element is numbers[2], and the fourth element is numbers[3].

        numbers[0] = 1; // the first integer is 1
        numbers[1] = 2; // the second integer is 2
        numbers[2] = 3; // the third integer is 3
        numbers[3] = 4; // the fourth integer is 4


        // Array of doubles
        double[] decimals = new double[4]; // This is an array of doubles called decimals. It can hold 4 doubles.

        decimals[0] = 1.0; // the first double is 1.0
        decimals[1] = 2.0; // the second double is 2.0
        decimals[2] = 3.98; // the third double is 3.0
        decimals[3] = 4.0; // the fourth double is 4.0


        // Array of booleans
        boolean[] bools = new boolean[4]; // This is an array of booleans called bools. It can hold 4 booleans.
        
        bools[0] = true; // the first boolean is true
        bools[1] = false; // the second boolean is false
        bools[2] = true; // the third boolean is true
        bools[3] = false; // the fourth boolean is false


        // Array of characters
        char[] letters = new char[4]; // This is an array of characters called letters. It can hold 4 characters.

        letters[0] = 'a'; // the first character is 'a'
        letters[1] = 'b'; // the second character is 'b'
        letters[2] = 'c'; // the third character is 'c'
        letters[3] = 'd'; // the fourth character is 'd'


        // What is array initialization and declaration?
        // Array declaration is when we create an array. Array initialization is when we assign values to the array.

        // Printing first element of all the arrays
        System.out.println(names[0]);
        System.out.println(numbers[0]);
        System.out.println(decimals[0]);
        System.out.println(bools[0]);
        System.out.println(letters[0]);
        

        // Explain list out of bounds error, runtime error, and compile time error
        // List out of bounds error is when we try to access an element that does not exist in the array. For example, if we try to access names[4], we will get an error because names only has 4 elements, so the last element is names[3].
    
        
        String[] list2 = {"Sanjay", "Stephanie", "Samantha", "Romy"}; // This is an array of Strings called list2. It can hold 4 Strings. We are initializing the array with the values "Sanjay", "Stephanie", "Samantha", and "Romy".

        // Find the length of an array
        System.out.println(list2.length); // This will print 4 because there are 4 elements in the array list2.

        // Iterate through an array
        for (int i = 0; i < list2.length; i++) {

            // Print each element of the array
            System.out.print(list2[i] + " ");
        }

        // Printing some elements of an array
        for ( int i=1 ; i<list2.length ; i++ ) {
            System.out.print(list2[i] + " ");
        }
    

    // An Array that is partially filled up
    // We can create an array that is partially filled up. For example, we can create an array of size 10, but only fill up 5 elements. We can do this by using a variable to keep track of the number of elements in the array.


    // Creating an array of size 10
    int[] num2 = new int[10];
    
    // Creating a variable to keep track of the number of elements in the array
    int numElements = 0;

    // Adding elements to the array
    num2[0] = 1;
    numElements++;
    num2[1] = 2;    
    numElements++;
    
    // Printing the num2 array
    System.out.println("The num2 array is: " + num2);
    
    // Creating an array of strings 
    String[] list3 = new String[10];

    // Creating a variable to keep track of the number of elements in the array
    int numElements2 = 0;

    // Adding elements to the array
    list3[0] = "Sanjay";
    numElements2++;
    list3[1] = "Stephanie";
    numElements2++;

    // Printing the list3 array
    System.out.println("The list3 array is: " + list3);
}
}