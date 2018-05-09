import java.util.*;

/*
 * Joshua Warren
 * 5/8/2018
 * CS211
 * Assignment 5
 */
public class HW5Ex08 {
	
	public static void main(String[] args) {
		
		Queue<Integer> test0 = new LinkedList<Integer>();
		
		Queue<Integer> test1 = new LinkedList<Integer>();
		test1.add(1);
		test1.add(3);
		test1.add(5);
		test1.add(3);
		test1.add(1);
		
		Queue<Integer> test2 = new LinkedList<Integer>();
		test2.add(1);
		test2.add(5);
		test2.add(10);
		test2.add(1);
		
		
		//System.out.println("Is true because it's empty: " + isPalindrome(test0));
		//System.out.println("Is true because the reverse is equal to original: " + isPalindrome(test1));
		//System.out.println("Is false because the reverse is not equal to original: " + isPalindrome(test2));
		
	}
	
	/*
	 * Write a method called isPalindrome that accepts a queue of integers as a parameter
	 * and returns true if the numbers in the queue are the same in reverse order.
	 */
	public static boolean isPalindrome(Queue<Integer> input) {
		
	    Stack<Integer> storage = new Stack<Integer>();
	    
	    // variable for the input size
	    int size = input.size();
	    
	    // variable to set for our boolean return
	    boolean answer = true;
	    
	    // for-loop to put everything into the input and into the stack
	    for(int i = 0; i < size; i++) {
	        int temp = input.remove();
	        input.add(temp);
	        storage.push(temp);
	    }
	    
	    // for-loop to get the front of the queue and the back (front of stack) of the stack for comparison
	    for(int i = 0; i < size; i++) {
	    	
	    	// variables for comparison
	        int temp1 = input.remove();
	        int temp2 = storage.pop();
	        
	        // the integer palidrome will be equal from the very front and very back
	        // if it's not equal, this isn't a palindrome so return false
	        if(temp1 != temp2) {
	            
	        	answer = false;
	            
	        	// exercise demands we leave the original queue intact
	        	input.add(temp1);
	        }
	    }
	    
	    return answer;
	}

}
