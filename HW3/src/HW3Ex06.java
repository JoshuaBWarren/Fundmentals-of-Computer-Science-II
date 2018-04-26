import java.util.HashSet;
import java.util.Iterator;
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
 * Problem 6: Write a method countUnique that accepts a list of integers as a parameter and 
 * returns the number of unique integer values in the list.  
 * 
 * Example: [5, 5, 4, 3, 3, 3, 2] should return 4.
 * 
 * An empty list should return 0.
 */
public class HW3Ex06 {

	/*
	 * Client facing class used for testing.
	 */
	public static void main (String[] args) {
		
		/*
		 * Create the Lists I need to test.
		 */
		List<Integer> test0 = new LinkedList<Integer>();
		List<Integer> test1 = new LinkedList<Integer>();
		
		/*
		 * Add integers into test1
		 */
		test1.add(3);
		test1.add(7);
		test1.add(3);
		test1.add(-1);
		test1.add(2);
		test1.add(3);
		test1.add(7);
		test1.add(2);
		test1.add(15);
		test1.add(15);
		
		//System.out.println("countUnique empty test: " + countUnique(test0)); // should return 0;
		//System.out.println("countUnique test: " + countUnique(test1)); // should return 5
	}
	
	/*
	 * This method accepts a list and will print out an integer that represents the
	 * amount of unique integers present within the list. 
	 * 
	 * An empty list will return the integer zero.
	 */
	public static int countUnique(List<Integer> list1) {
		
		/*
		 * Create a set so that every integer we add from list1
		 * will be unique.
		 */
		Set<Integer> temp = new HashSet<Integer>();
		
		/*
		 * Create an iterator object to traverse the input list
		 */
		Iterator<Integer> i1 = list1.iterator();
		
		/*
		 * Check if the list is empty, if it is, return zero.
		 */
		if(list1.isEmpty()) {
			return 0;
		}
		
		/*
		 * Iterate through list1 and add each element to
		 * the temp Set.
		 */
		while(i1.hasNext()) {
			temp.add(i1.next());
		}
		
		/*
		 * Since a set contains no duplicates, return the size of temp.
		 */
		return temp.size();
	}
}
