/*
 * Joshua Warren
 * CS 211
 * 5/6/2018
 * Assignment Four
 */
public class HW4Ex08 {
	
	// Write a recursive method called multiplyEvens that returns
	// the product of the first n even integers.
	
	// Ex. multiplyEvens(4) will produce 384 (2 * 4 * 6 * 8 = 384)
	
	// Throw error if a value less than or equal to 0 is passed.

	
	public static void main (String[] args) {
		
		//System.out.println("mulitplyEvens method test: " + multiplyEvens(4)); // should be 384
		
	}
	
	public static int multiplyEvens(int input) {
		
		// as per the problem, check for any input less than or equal to 0
		if(input <= 0) {
			throw new IllegalArgumentException();
		}
		
		// base case: input is now, or was, equal to one
		if(input == 1) {
			return 2;
			
			// recursive case: take the number and do the math
			// recursively call the method again minus 1 to input
		} else {
			return 2 * input * multiplyEvens(input - 1);
		}
	}
}
