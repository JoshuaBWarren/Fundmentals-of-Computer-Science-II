/*
 * Joshua Warren
 * CS 211
 * 5/6/2018
 * Assignment Four
 */
public class HW4Ex04 {

	// Write a recursive method called doubleDigits that accepts an integer
	// n as a parameter and returns the integer obtained by replacing every
	// digit of n with two of that digit.  
	
	// Ex. doubleDigits(348) will produce: 334488
	// Ex. doubleDigits(0) will produce: 0
	// Ex. doubleDigits(-348) will produce: -334488
	
	public static void main (String[] args) {
		
		
		//System.out.println("doubleDigits method should produce each digit in the number, twice: " + doubleDigits(123)); // 112233
		//System.out.println("if doubleDigits method is passed 0 then return 0: " + doubleDigits(0)); // 0
		
	}
	
	public static int doubleDigits(int input) {
		
		// base case
	    if (input == 0) {
	    	
	        return 0;
	        
	        // recursion case
	    } else {
	    	
	    	// get the last digit of the number
	        int lastDigit = input % 10;
	        
	        // then recursively call it again using lastDigit
	        return 100 * doubleDigits(input / 10) + 10 * lastDigit + lastDigit;
	    }
	}
}
