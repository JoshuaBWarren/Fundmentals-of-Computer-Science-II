import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Joshua Warren
 * 4/25/2018
 * CS211
 * Assignment Three
 */

/*
 * Problem 4: Write a method called partition that accepts a list of integers and an
 * integer value E as its parameter, and rearranges (partitions) the list so that all
 * elements with values less than E occur before all elements with values
 * greater than E.  Order is unimportant.
 * 
 * Assume that input list has zero duplicates and does not contain the
 * input element E.
 */
public class HW3Ex04 {
	
	/*
	 * Client facing class used for testing.
	 */
	public static void main(String[] args) {
		
		/*
		 * Create the Lists I need to test.
		 */
		List<Integer> test1 = new LinkedList<Integer>();
		List<Integer> test2 = new LinkedList<Integer>();
		
		/*
		 * Add integers into test1
		 */
		test1.add(1);
		test1.add(6);
		test1.add(-3);
		test1.add(21);
		test1.add(14);
		test1.add(34);
		
		/*
		 * Add integers into test2
		 */
		test2.add(1);
		test2.add(6);
		test2.add(12);
		test2.add(-3);
		test2.add(4);
		test2.add(8);
		test2.add(21);
		test2.add(2);
		test2.add(30);
		test2.add(-1);
		test2.add(9);
		
		System.out.println("partition test: " + partition(test1, 22)); // returns a partitioned list
		System.out.println("partition test: " + partition(test2, 5)); // returns a partitioned list
	}
	
	/*
	 * This method accepts a list and a single integer number e.
	 * 
	 * The returned list will be a partitioned where every number to the
	 * left of e is smaller than e and every number to the right of e is 
	 * greater than e.
	 * 
	 * We can assume the number e is not included in the given list.
	 */
	public static List<Integer> partition(List<Integer> list1, int e) {
		
		/*
		 * Create three LinkedLists:
		 * 
		 * small is the LinkedList that will store all values smaller than e
		 * large is the LinkedList that will store all values greater than e
		 * answer will hold the final LinkedList result
		 */
		List<Integer> small = new LinkedList<Integer>();
		List<Integer> large = new LinkedList<Integer>();
		List<Integer> answer = new LinkedList<Integer>();
		
		/*
		 * Go through the list comparing each element
		 */
		for(int i = 0; i <= list1.size() - 1; i++) {
			
			// if element is smaller than e
			if(list1.get(i) < e) {
				
				// add it to the LinkedList small
				small.add(list1.get(i));
				
				// if element is greater than e
			} else if(list1.get(i) > e) {
				
				// add it to the LinkedList large
				large.add(list1.get(i));
			}
		}
		
		// combine the LinkedLists together into answer
		answer.addAll(small);
		answer.addAll(large);
		
		// return the new list
		return answer;
		
	}

}
