/*
 * Joshua Warren
 * CS 211
 * 6/10/2018
 * Homework 8
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
// Implements a priority queue of integers using a
// min-heap represented as an array.
public class HeapIntPriorityQueue {
	private int[] elementData;
	private int size;
	// Constructs an empty queue.
	public HeapIntPriorityQueue() {
		elementData = new int[10];
		size = 0;
	}
	// Adds the given element to this queue.
	public void add(int value) {
		// resize if necessary
		if (size + 1 >= elementData.length) {
			elementData = Arrays.copyOf(elementData, elementData.length * 
					2);
		}
		// insert as new rightmost leaf
		elementData[size + 1] = value;
		// "bubble up" toward root as necessary to fix ordering
		int index = size + 1;
		boolean found = false;   // have we found the proper place yet?
		while (!found && hasParent(index)) {
			int parent = parent(index);
			if (elementData[index] < elementData[parent]) {
				swap(elementData, index, parent(index));
				index = parent(index);
			} else {
				found = true;  // found proper location; stop the loop
			}
		}
		size++;
	}
	// Returns true if there are no elements in this queue.
	public boolean isEmpty() {
		return size == 0;
	}
	// Returns the minimum value in the queue without modifying the queue.
	// If the queue is empty, throws a NoSuchElementException.
	public int peek() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return elementData[1];
	}
	// Removes and returns the minimum value in the queue.
	// If the queue is empty, throws a NoSuchElementException.
	public int remove() {
		int result = peek();
		// move rightmost leaf to become new root
		elementData[1] = elementData[size];
		size--;
		// "bubble down" root as necessary to fix ordering
		int index = 1;
		boolean found = false;   // have we found the proper place yet?
		while (!found && hasLeftChild(index)) {
			int left = leftChild(index);
			int right = rightChild(index);
			int child = left;
			if (hasRightChild(index) &&
					elementData[right] < elementData[left]) {
				child = right;
			}
			if (elementData[index] > elementData[child]) {
				swap(elementData, index, child);
				index = child;
			} else {
				found = true;  // found proper location; stop the loop
			}
		}
		return result;
	}
	// Returns the number of elements in the queue.
	public int size() {
		return size;
	}
	// Returns a string representation of this queue, such as "[10, 20, 30]";
			// The elements are not guaranteed to be listed in sorted order.
			public String toString() {
				String result = "[";
				if (!isEmpty()) {
					result += elementData[1];
					for (int i = 2; i <= size; i++) {
						result += ", " + elementData[i];
					}
				}
				return result + "]";
			}
			// helpers for navigating indexes up/down the tree
			private int parent(int index) {
				return index / 2;
			}
			// returns index of left child of given index
			private int leftChild(int index) {
				return index * 2;
			}
			// returns index of right child of given index
			private int rightChild(int index) {
				return index * 2 + 1;
			}
			// returns true if the node at the given index has a parent (is not the root)
			private boolean hasParent(int index) {
				return index > 1;
			}
			// returns true if the node at the given index has a non-empty left child
			private boolean hasLeftChild(int index) {
				return leftChild(index) <= size;
			}
			// returns true if the node at the given index has a non-empty right child
			private boolean hasRightChild(int index) {
				return rightChild(index) <= size;
			}
			// switches the values at the two given indexes of the given array
			private void swap(int[] a, int index1, int index2) {
				int temp = a[index1];
				a[index1] = a[index2];
				a[index2] = temp;
			}
			
			/*
			 * Exercise 9:
			 * 
			 * Write a method called kthSmallest that accepts a PriorityQueue of
			 *  integers and an integer k as parameters and returns the kth-smallest 
			 *  integer from the priority queue.
			 */
			public int kthSmallest(PriorityQueue<Integer> input, int k) throws IllegalArgumentException {
				
				// check check to see if input k is a negative integer or is 0
			    if (k < 1 || k > input.size()) {
			    	
			    	// if so, throw the argument
			        throw new IllegalArgumentException("k can't be negative or 0!");
			    }
			    
			    // create a new priority queue
			    Queue<Integer> temp = new PriorityQueue<Integer>();
			    
			    // and add our input into it
			    temp.addAll(input);
			    
			    // assign variables
			    int kth = 0;
			    int size = temp.size();
			    
			    // now we go through the queue 
			    for (int i = 0; i < size; i++) {
			    	
			        if(i < k) {
			        	// take a look at the head, if k is greater than i
			            kth = temp.peek();
			        }
			        // then grab the head
			        temp.poll();
			    }
			    // return the answer
			    return kth;
			}
			
			/*
			 * Exercise 11:
			 * 
			 * Write a method called removeDuplicates that accepts a PriorityQueue 
			 * of integers as a parameter and modifies the queue's state so that 
			 * any element that is equal to another element in the queue is removed.
			 */
			public PriorityQueue<Integer> removeDuplicates(PriorityQueue<Integer> input) {
				
				// Since a Set can't contain any duplicates...
				
				// convert input into a HashSet
				HashSet<Integer> temp = new HashSet<>(input);
				
				// then take the values within the HashSet and convert it back
				// into a PriorityQueue
				PriorityQueue<Integer> answer = new PriorityQueue<>(temp);
				
				// since we we did some conversions, the method will return a
				// a priority queue
				return answer;
							
			}
			
}

