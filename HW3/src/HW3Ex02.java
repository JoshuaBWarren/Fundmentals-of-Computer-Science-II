import java.util.ArrayList;
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
 * Problem 2: Write a method called alternate that accepts two Lists as its
 * parameters and returns a new List containing alternating elements from
 * the two lists, in the following order:
 * 
 * First element from the first list.
 * First element from the second list.
 * Second element from the first list.
 * Second element from the second list.
 * ...
 * 
 * For lists not containing the same amount of elements, the List with
 * the most elements will fill in at the end, consecutively.
 */
public class HW3Ex02 {
	
	/*
	 * Client facing class used for testing.
	 */
	public static void main (String[] args) {
		
		/*
		 * Create the Lists I need to test.
		 */
		List<Integer> test1 = new LinkedList<Integer>();
		List<Integer> test2 = new LinkedList<Integer>();
		List<Integer> test3 = new LinkedList<Integer>();
		
		/*
		 * Add integers into test1
		 */
		test1.add(1);
		test1.add(3);
		test1.add(5);
		
		/*
		 * Add integers into test2
		 */
		test2.add(2);
		test2.add(4);
		test2.add(6);
		
		/*
		 * Add integers into test3
		 */
		test3.add(7);
		test3.add(8);
		test3.add(9);
		test3.add(10);
		test3.add(11);
		
		//System.out.println("alternate test 1: " + alternate(test1, test2)); //  return [1, 2, 3, 4, 5, 6]
		//System.out.println("alternate test 2: " + alternate(test1, test3)); // return [1, 7, 3, 8, 5, 9, 10, 11]
		
	}
	
	/*
	 * This method accepts two lists and returns a single list.
	 * 
	 * The returned list is a merge with the two input lists: list1 and list2.
	 * 
	 * The method adds the first element of the first list into the returned list
	 * and then adds the first element of the second list. 
	 * 
	 * Cases of list not being equal in length: return the merged list with
	 * the last few elements of the longer list added consecutively.
	 * 
	 * Chose to use LinkedList due to the question not designating what kind of list
	 * we're to use nor does the question say to expect a certain kind of list as input.
	 * 
	 * In theory: the method should work with any kind of list.
	 */
	public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
		
		// Create the list to return
		List<Integer> answer = new LinkedList<Integer>();
		
		/*
		 * Create two iterator objects for traversal.
		 */
		Iterator<Integer> first = list1.iterator();
		Iterator<Integer> second = list2.iterator();
		
		/*
		 * While the first OR second list has items in it...
		 */
		while(first.hasNext() || second.hasNext()) {
			
			// if the first list has another element, add it to answer
			// if not, proceed to next if-statement.
			if(first.hasNext()) {
				answer.add(first.next());
			}
			
			// if the second list has another element, add it to answer
			// if not, proceed through while loop or exit.
			if(second.hasNext()) {
				answer.add(second.next());
			}
		}
		
		// return the newly merged list.
		return answer;
	}
	


}
