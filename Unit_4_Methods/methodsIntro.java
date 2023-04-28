
// This code is a simple class that contains three methods. The main method calls the other two methods, and prints the results. The add method takes two int parameters, and returns the sum of the two parameters. The subtract method takes two int parameters, and returns the difference between the two parameters. The product method takes two double parameters, and returns the product of the two parameters.

// Author: Sanjay Javangula
// Date: 4/11/2023, 9:50:27 AM 

public  class methodsIntro {
	
	public static void main(String[] args) {
		// Store the value from add method
		int value = add(5, 10);

		// Store the value from the subtract method 
		int subtract = subtract(100, 60);
		
		// Store the value from the product method
		double product = product(10,23.5);

		// Store the value from the divide method
		double divide = divide(100, 80);

		// Print the results
		System.out.println(value + " subtract: " + subtract + " product: " + product 
				+ " divide: " + divide);
	}

	// This method adds two numbers and returns the result
	public static int add( int a, int b) {
		// This method returns an int
		// This method takes two int parameters
		
		return a + b;

	}
	// This method subtracts two numbers and returns the result
	public static int subtract( int a, int b) {
		// This method returns an int
		// This method takes two int parameters
		
		return a - b;

	}

	// This method multiplies two decimal numbers, and returns the result
	public static double product(double x, double y) {

		// This method returns a double
		return x*y;
		
	}

	// This method divides two decimal numbers, and returns the result
	public static double divide(double x, double y) {

		// This method returns a double
		return x/y;
		
	}
}
