import java.util.*;

/*
 * Joshua Warren
 * 5/8/2018
 * CS211
 * Assignment 5
 */
public class HW5Ex03 {

	
	public static void main(String[] args) {
		
		Stack<Integer> test1 = new Stack<Integer>();
		test1.push(5);
		test1.push(6);
		test1.push(7);
		test1.push(8);
		
		//System.out.println(test1);
		//System.out.println("Input stack of [5, 6, 7, 8] equals return stack: " + copyStack(test1));
		
	}
	
	/*
	 * Write a method called copyStack that accepts a stack of integers as a
	 * parameter and returns a copy of the original stack.
	 */
	public static Stack<Integer> copyStack(Stack<Integer> input) {
		
		// Create a stack for the answer and a queue for temp storage.
		Queue<Integer> storage = new LinkedList<Integer>();
		Stack<Integer> answer = new Stack<Integer>();
		
		// for-loop to transfer everything from the input stack to storage queue
		for(int i = 0; i < input.size(); i++) {
			int temp = input.get(i);
			storage.add(temp);
			
		}
		//System.out.println(storage + " = first for loop!");
		
		// while-loop to transfer everything from storage queue into answer stack
		while(!storage.isEmpty()) {
			int temp = storage.remove();
			answer.push(temp);
		}
		
		//System.out.println(answer + " = second for loop!");
		// return stac
		return answer;
		
	}
}
