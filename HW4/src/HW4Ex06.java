/*
 * Joshua Warren
 * CS 211
 * 5/6/2018
 * Assignment Four
 */
public class HW4Ex06 {
	
	// Write a recursive method called writeSquares that accepts an integer parameter
	// n and prints the first n squares separated by commas, with the odd squares in 
	// descending order followed by the even squares in ascending order.
	
	// Throw error if a value less than one is passed.  writeSquares(0) produces 0.

	public static void main (String[] args) {
		
		//writeSquares(8);  // should produce 49, 25, 9, 1, 4, 16, 36, 64
		
	}
	
	public static void writeSquares(int input) {
		
		// as per the problem, check for values less than one and throw error
		if(input < 1) {
			throw new IllegalArgumentException();
		}
		
		// base case 1: if the value is one there is no square
		if(input == 1) {
			System.out.print(1);
			return;
		}
		
		// recursive case: if input is even
		if(input % 2 == 0) {
			
			// call the method again minus 1
			writeSquares(input - 1);
			
			// print the odd squares, descending
			System.out.print(", " + input * input);
		} else {
			
			// print the even squares, ascending
			System.out.print(input * input + ", ");
			
			// call method again minus 1
			writeSquares(input - 1);
		}
		
	}
}
