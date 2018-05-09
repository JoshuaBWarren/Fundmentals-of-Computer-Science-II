import java.util.*;

/*
 * Joshua Warren
 * 5/8/2018
 * CS211
 * Assignment 5
 */
public class HW5Ex06 {

	public static void main(String[] args) {
		
		Queue<Integer> test1 = new LinkedList<Integer>();
		test1.add(3);
		test1.add(5);
		test1.add(4);
		test1.add(17);
		test1.add(6);
		test1.add(83);
		test1.add(1);
		test1.add(84);
		test1.add(16);
		test1.add(37);
		
		//System.out.println("Original Queue: " + test1);  // should get original queue back
		//rearrange(test1);
		//System.out.println("New queue after rearrange method: " + test1); // should be a new rearranged queue
		
	}
	
	/*
	 * Write a method called rearrange that accepts a queue of integers as a parameter
	 * and rearranges the order of the values so that all of the even values appear
	 * before the odd values and that otherwise preserves the original order of the queue.
	 */
	public static void rearrange(Queue<Integer> input) {
		
		// Create storage stack
		Stack<Integer> storage = new Stack<Integer>();
		
		// create int value for the input size
		int size = input.size();
		
		// Two for-loops: one to loop through the two, and the other to peek at the queue
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < size; j++) {
				
				// remove all of the even numbers
				if(input.peek() % 2 == 0) {
					input.add(input.remove());
					
					// store all of the odd numbers
				} else {
					storage.push(input.remove());
				}
			}
			
			// while storage stack isn't empty, add it to input.
			while(!storage.isEmpty()) {
				input.add(storage.pop());
			}
		}
		
	}
}
