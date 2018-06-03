/*
 * Joshua Warren
 * CS 211
 * 6/3/2018
 * Homework 7
 */

import java.util.NoSuchElementException;

// Class LinkedIntList can be used to store a list of integers.
public class LinkedIntList implements IntList {
	private ListNode front; // first value in the list
	// post: constructs an empty list

	public LinkedIntList() {
		front = null;
	}

	// post: returns the current number of elements in the list
	public int size() {
		int count = 0;
		ListNode current = front;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

	// pre : 0 <= index < size()
	// post: returns the integer at the given index in the list
	public int get(int index) {
		return nodeAt(index).data;
	}

	// post: creates a comma-separated, bracketed version of the list
	public String toString() {
		if (front == null) {
			return "[]";
		} else {
			String result = "[" + front.data;
			ListNode current = front.next;
			while (current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			result += "]";
			return result;
		}
	}

	// post : returns the position of the first occurrence of the given
	// value (-1 if not found)
	public int indexOf(int value) {
		int index = 0;
		ListNode current = front;
		while (current != null) {
			if (current.data == value) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}

	// post: appends the given value to the end of the list
	public void add(int value) {
		if (front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
	}

	// pre: 0 <= index <= size()
	// post: inserts the given value at the given index
	public void add(int index, int value) {
		if (index == 0) {
			front = new ListNode(value, front);
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = new ListNode(value, current.next);
		}
	}

	// pre : 0 <= index < size()
	// post: removes value at the given index
	public void remove(int index) {
		if (index == 0) {
			front = front.next;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
	}

	// pre : 0 <= i < size()
	// post: returns a reference to the node at the given index
	private ListNode nodeAt(int index) {
		ListNode current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}
	
	// Exercise 2
	
	/*
	 * Write a method called min that returns the minimum value in a 
	 * list of integers. If the list is empty, it 
	 * should throw a NoSuchElementException.
	 */
	
	public int min() {
		
		// throw exception if the list we're given is empty.
		if(this.size() == 0) {
			throw new NoSuchElementException();
		}
		
		// set minValue to the first item on the list
		int minValue = this.get(0);
		
		// go through the list
		for(int i = 0; i < this.size(); i++) {
			
			// if the current value is greater than
			// the next one 
			if(minValue > this.get(i)) {
				
				// then set minValue to new value
				minValue = this.get(i);
			}
		}
		
		// return minimum value
		return minValue;
	}
	
	// Exercise from class: May 18, 2018
	
	/*
	 * Write a method that moves the first element of a
	 * list to the back (end) of the list.  
	 */
	
	public LinkedIntList moveToEnd() {
		
		int value = this.get(0);
		this.remove(0);
		this.add(this.size(), value);
		
		return this;
	}
	
	/*
	 * Exercise 8:
	 * 
	 * Write a method called switchPairs that switches the order of values in the list in a 
	 * pairwise fashion.  Your method should switch the order of the first two values, then 
	 * switch the order of the next two, switch the order of the next two, and so on.
	 */
	public void switchPairs() {
		
		// if the front and the next is null, there's nothing
		// so just return
		if(front == null || front.next == null) {
			return;
		}
		
		// set the variables		
		ListNode firstOne = front;
	    ListNode secondOne = firstOne.next;
	    firstOne.next = secondOne.next;
	    secondOne.next = firstOne;
	    front = secondOne;
	    
	    ListNode temp = firstOne;
	    
	    // while temp has a next node to be messing with
	    while(temp.next != null) {
	    	
	    	// set more variables
	    	firstOne = temp.next;
	    	secondOne = firstOne.next;
	        
	    	// if the second one is nothing, return the first
	        if(secondOne == null) {
	            return;
	        }
	        
	        // if not, then switch them and proceed to the next two
	        firstOne.next = secondOne.next;
	        secondOne.next = firstOne;
	        temp.next = secondOne;
	        temp = firstOne;
	        }
	}
	
	/*
	 * Exercise 12:
	 * 
	 * Write a method called split that rearranges the elements of a list so that all of 
	 * the negative values appear before all of the non negatives.
	 */
	public void split() {
		
		// if the front and the next is null, there's nothing
		// so just return
	    if(front == null) {
	        return;
	    }
	    
	    // set the variables
	    ListNode current = front;
	    ListNode negative = null;
	    ListNode positive = null;
	    ListNode negativeLast = null;
	    
	 // while temp has a next node to be messing with
	    while(current != null) {
	    	
	    	// set a variable for comparison
	        ListNode next = current.next;
	        
	        // if the current number is negative
	        if(current.data < 0) {
	        	// set it to the negative variable
	            current.next = negative;
	            negative = current;
	            
	           // if the next one is nothing
	        if(negative.next == null)
	        	// then we have our last negative number
	            negativeLast = negative;
	        } else {
	        	// else, the next one is positive
	            current.next = positive;
	            positive = current;
	        }
	        
	        // keep going
	        current = next;
	    }
	    
	    // if the negative value is nothing
	    if(negative == null) {
	    	// then the first one is positive
	        front = positive;
	    } else {
	    	// if we have a negative number, then set it
	    	negativeLast.next = positive;
	        front = negative;
	    }
	}
	
	
}
