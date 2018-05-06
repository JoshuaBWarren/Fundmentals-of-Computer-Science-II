/*
 * Joshua Warren
 * CS 211
 * 5/6/2018
 * Assignment Four
 */
public class HW4Ex15 {
	
	// Write a recursive method called permut that accepts two integers n
	// and r as parameters and returns the number of unique permutations
	// of r items from a group of n items.
	
	// Compute values n and r as follows:
	
	/*
	 * P(n,r) = n!/(n - r)!
	 */
	
	// Ex. permut(7, 4) will produce 840

	public static void main (String[] args) {
		
		//System.out.println("permut test one: " + permut(7, 4)); // should produce 840
		//System.out.println("permut test two: " + permut(6, 3)); // should produce 120
	}
	
	public static int permut(int n, int r) {
		
		// r is our base case because it's the number that
		// subtracts n for our recursion
		if(r == 1) {
			return n;
			// recursion case: call the method again for factorial's
		} else {
			// subtract both r and n as this is a factorial problem 
			return n * permut(n - 1, r - 1);
		}
	}
}
