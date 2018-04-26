import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * Joshua Warren
 * 4/25/2018
 * CS211
 * Assignment Three
 */

/*
 * Problem 8: Write a method maxLength that accepts a set of strings as a parameter and returns the
 * length of the longest string in the set.  
 * 
 * Empty sets return the integer 0.
 */
public class HW3Ex08 {
	
	/*
	 * Client facing class used for testing.
	 */
	public static void main (String[] args) {
		
		/*
		 * Create the Sets I need to test.
		 */
		Set<String> test0 = new HashSet<String>();
		Set<String> test1 = new HashSet<String>();
		Set<String> test2 = new HashSet<String>();
		
		/*
		 * Add strings into test1
		 */
		test1.add("I am the Batman.");
		test1.add("No, I am the Batman.");
		test1.add("Where art though Batman?");
		test1.add("I don't know");
		test1.add("Looks like the Joker excaped again.");
		test1.add("Time for Batman to go get him.");
		test1.add("Batman is obviously the greatest of all super heros");
		
		/*
		 * Add strings into test2
		 */
		test2.add("Why is Batman so awesome?");
		test2.add("Just because.");
		
		System.out.println("maxLength empty test: " + maxLength(test0)); // should return 0
		System.out.println("maxLength test: " + maxLength(test1)); // should return 51;
		System.out.println("maxLength test: " + maxLength(test2)); // should return 25;
		
		
	}
	
	/*
	 * This method takes a Set of strings as input and returns the number of characters
	 * within the largest string within the set.
	 * 
	 * Empty sets return zero.
	 */
	public static int maxLength(Set<String> input) {
		
		// create variable for the final answer
		int answer = 0;
		
		// Check to see if the input is empty.
		if(input.isEmpty()) {
			return 0;
		}
		
		/*
		 * Convert the Set input into a List input so that we 
		 * can use .get() within the for loop.
		 */
		List<String> temp = new LinkedList<String>();
		temp.addAll(input);
		
		/*
		 * Loop through the list and compare the length of each string.
		 */
		for(int i = 0; i <= input.size() - 1; i++) {
			
			// if the length is bigger than the current answer
			if(temp.get(i).length() > answer) {
				
				// set answer equal to that length
				answer = temp.get(i).length();
			}
		}
		
		// return the largest string length
		return answer;
	}

}
