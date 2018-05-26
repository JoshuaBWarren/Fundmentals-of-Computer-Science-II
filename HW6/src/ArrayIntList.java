
// Class ArrayIntList can be used to store a list of integers.
import java.util.*;

public class ArrayIntList {
	private int[] elementData; // list of integers
	private int size; // current number of elements in the list
	public static final int DEFAULT_CAPACITY = 100;

	// post: constructs an empty list of default capacity
	public ArrayIntList() {
		this(DEFAULT_CAPACITY);
	}

	// pre : capacity >= 0 (throws IllegalArgumentException if not)
	// post: constructs an empty list with the given capacity
	public ArrayIntList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("capacity: " + capacity);
		}
		elementData = new int[capacity];
		size = 0;
	}

	// post: returns the current number of elements in the list
	public int size() {
		return size;
	}

	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: returns the integer at the given index in the list
	public int get(int index) {
		checkIndex(index);
		return elementData[index];
	}

	// post: creates a comma-separated, bracketed version of the list
	public String toString() {
		if (size == 0) {
			return "[]";
		} else {
			String result = "[" + elementData[0];
			for (int i = 1; i < size; i++) {
				result += ", " + elementData[i];
			}
			result += "]";
			return result;
		}
	}

	// post : returns the position of the first occurrence of the given
	// value (-1 if not found)
	public int indexOf(int value) {
		for (int i = 0; i < size; i++) {
			if (elementData[i] == value) {
				return i;
			}
		}
		return -1;
	}

	// post: returns true if list is empty, false otherwise
	public boolean isEmpty() {
		return size == 0;
	}

	// post: returns true if the given value is contained in the list,
	// false otherwise
	public boolean contains(int value) {
		return indexOf(value) >= 0;
	}

	// pre : size() < capacity (throws IllegalStateException if not)
	// post: appends the given value to the end of the list
	public void add(int value) {
		ensureCapacity(size + 1);
		elementData[size] = value;
		size++;
	}
	// pre : size() < capacity (throws IllegalStateException if not) &&
	// 0 <= index <= size() (throws IndexOutOfBoundsException if not)
	// post: inserts the given value at the given index, shifting subsequent

	// values right
	public void add(int index, int value) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
		ensureCapacity(size + 1);
		for (int i = size; i > index; i--) {
			elementData[i] = elementData[i - 1];
		}
		elementData[index] = value;
		size++;
	}
	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: removes value at the given index, shifting subsequent values left

	public void remove(int index) {
		checkIndex(index);
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;
	}

	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: replaces the integer at the given index with the given value
	public void set(int index, int value) {
		checkIndex(index);
		elementData[index] = value;
	}

	// post: list is empty
	public void clear() {
		size = 0;
	}
	// pre: size() + other.size() <= capacity (throws IllegalStateException

	// if not)
	// post: appends all values in the given list to the end of this list
	public void addAll(ArrayIntList other) {
		ensureCapacity(size + other.size);
		for (int i = 0; i < other.size; i++) {
			add(other.elementData[i]);
		}
	}

	public int sum() {
		int total = 0;
		for (int i = 0; i < size; i++) {
			total += elementData[i];
		}
		return total;
	}

	public double average() {
		if (isEmpty()) {
			return 0.0;
		} else {
			return (double) sum() / size;
		}
	}

	// post: returns an iterator for this list
	public ArrayIntListIterator iterator() {
		return new ArrayIntListIterator(this);
	}
	// post: ensures that the underlying array has the given capacity; if not,
	// the size is doubled (or more if given capacity is even larger)

	public void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			int newCapacity = elementData.length * 2 + 1;
			if (capacity > newCapacity) {
				newCapacity = capacity;
			}
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
	}

	// post: throws an IndexOutOfBoundsException if the given index is
	// not a legal index of the current list
	private void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
}

	// Exercise 1:

	/*
	 * Write a method called lastIndexOf that accepts an integer as a parameter and
	 * returns the index in the list of the last occurrence of that value, or -1 if
	 * the value is not found in the list.
	 * 
	 * Example: [1, 18, 2, 7, 18, 39, 18, 40] -> 18 = 6 and 3 = -1
	 */
	public int lastIndexOf(int input) {

		// set variables for counting:
		int lastIndex = 0;
		int index = 0;
		
		// create iterator
		ArrayIntListIterator iterator = this.iterator();
		
		// use class contains to verify input is present
		if(!this.contains(input)) {
			return -1;
		}
		
		// iterate through array
		while(iterator.hasNext()) {
			
			// create test variable
			int test = iterator.next();
			
			// if test is equal to index
			if(test == input) {
				
				// then lastIndex = current index value
				lastIndex = index;
			}
			
			// count current position
			index++;
		}
		
		// return the last value within lastIndex
		return lastIndex;
	}

	// Exercise 2:

	/*
	 * Write a method called indexOfSubList that accepts another list L as a
	 * parameter and returns the starting index of where L first appears in this
	 * list, or -1 if it is not found. All elements must appear in sequence and in
	 * the same order.
	 * 
	 * Example:
	 * 
	 * list1 = [11, -7, 3, 42, 0, 14], list2 = [3, 42, 0] -> 2
	 */

	public int indexOfSubList(ArrayIntList other) {
		
		// set variables for counting
		int count = 0;
		
		// decided to use two for-loops because trying to use
		// two iterators was taking too long for me to figure out.
		
		// first for loop shortens the bigger list
		for(int i = 0; i <= size - other.size; i++) {
			
			// second for-loop goes through the smaller list
			for(int j = 0; j < other.size; j++) {
				
				// compare data if they're equal
				if(elementData[i + j] == other.elementData[j]) {
					
					// add 1 to count
					count++;
				}
			}
			// check the size: if the count is equal to the other.size
			// then we know we have it in sequence
			if(count == other.size) {
				return i;
		    }
		}
		// if not, then it's either not in sequence or it doesn't 
		// exist so return -1
		return -1;
	}
	
	// Exercise 5:
	
	/*
	 * Write a method called runningTotal that returns a new ArrayIntList that contains a running
	 * total of the original list.  
	 * 
	 * Example: list1 = [2, 3, 5, 4, 7, 15, 20, 7] -> [2, 5, 10, 14, 21, 36, 56, 63]
	 */
	
	public ArrayIntList runningTotal() {
		
		// set variables
		int sum = 0;
		
		// this and new ArrayIntList for the answer
		ArrayIntList answer = new ArrayIntList();
		
		// loop through this ArrayIntList
		for(int i = 0; i <= size - 1; i++) {
			
			// sum and set value to sum the result after getting i
			sum += this.get(i);
			
			// take the current value in sum and add it into the array
			answer.add(sum);
		}
		
		// return the array
		return answer;
	}
	
	// Exercise 8:
	
	/*
	 * Write a method called count that accepts an element value as a parameter and returns the number
	 * of occurrences of that value in the list.  
	 * 
	 * Example: list1 = [2, -3, 2, 0, 5, 2, 2, 6] -> 4
	 */
	
	public int count(int value) {
		
		// set variable for counting
		int count = 0;
		
		// create iterator
		ArrayIntListIterator iterator = this.iterator();
		
		// while loop through the list
		while(iterator.hasNext()) {
			
			// create temp variable for current item iterating
			int temp = iterator.next();
			
			// if it's equal to input value
			if(temp == value) {
				
				// add 1 to count
				count++;
			}
		}
		
		// return total sum of the count variable
		return count;
	}
	
	// Exercise 11:
	
	/*
	 * Write a method called removeLast that removes and returns the last value from a list of integers.
	 * 
	 * Example: list1 = [8, 17, 42, 3, 8] -> 8 and [8, 17, 42, 3]
	 * 
	 * If empty throw "NoSuchElementException"
	 */
	
	public int removeLast() {
		
		// if the list is empty throw exception
		if(this.isEmpty()) {
			throw new NoSuchElementException();
		}
		
		// get the last value within the list and assign it to a variable
		int answer = this.get(size - 1);
		
		// use in-class remove method to remove last value from list
		this.remove(this.size - 1);
		
		// return last value removed
		return answer;
	}

}

