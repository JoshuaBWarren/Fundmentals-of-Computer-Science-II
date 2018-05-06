/*
 * Joshua Warren
 * CS 211
 * 5/6/2018
 * Assignment Four
 */
public class HW4Ex02 {
	
	// Write a method called writeNums that takes an integer as a parameter and prints
	// to the console the first n integers starting with 1 in sequential order, 
	// separated by commas.  
	
	// Ex. writeNums(5); will produce:
	// 1, 2, 3, 4, 5
	
	public static void main (String[] args) {
		
		// this should produce: "1, 2, 3, 4, 5"
		//writeNums(5);
		
	}
	
	/*
	 * Method for writing numbers in sequential order, starting with 1 and ending with
	 * the input passed to the method.
	 */
	public static void writeNums(int input) {
		
		// base case = 1
		if(input == 1) {
			System.out.print("1");
		} else {
			
			// recursive call if not 1
			writeNums(input - 1);
			System.out.print(", " + input);
		}
		
	}

}
