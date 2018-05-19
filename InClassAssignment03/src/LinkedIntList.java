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
}
