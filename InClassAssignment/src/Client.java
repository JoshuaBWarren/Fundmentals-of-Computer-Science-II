/*
 * Joshua Warren
 * CS 211
 * 4/11/2018
 * In class assignment
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Client {
	
	public static void main (String[] args) throws FileNotFoundException  {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(new File("test"));
		while (input.hasNextInt()) {
			int n = input.nextInt();
			numbers.add(n);
			}
		input.close();
		
		// Tests!
		System.out.println(numbers);
		filterEvens(numbers);
		
		System.out.println(numbers);
		System.out.println(findLargest(numbers));
		System.out.println(findSmallest(numbers));
		System.out.println(average(numbers));
	}
		// Removes all elements with even values from the given list.
		public static void filterEvens(ArrayList<Integer> list) {
			for (int i = list.size() - 1; i >= 0; i--) {
				int n = list.get(i);
				if (n % 2 == 0) {
					list.remove(i);
					}
				}
			}
		
		// finds the largest integer within the array list.
		public static int findLargest(ArrayList<Integer> list) {

			// grab the first value within the array list
			int answer = list.get(0);
			
			// loop through the array list and compare it to the first value
			// within.  If the current is greater than the answer, then set the
			// answer value as the current value.
			for(int i = 0; i <= list.size() - 1; i++) {
				int current = list.get(i);
				if(answer < current) {
					answer = current;
				}
			}
			// return the largest integer
			return answer;
			
		}
		
		// finds the smallest integer within the array list.
		public static int findSmallest(ArrayList<Integer> list) {
			
			// grab the first value within the array list
			int answer = list.get(0);
			
			// loop through the array list and compare it to the first value
			// within.  If the current is less than the answer, then set the
			// answer value as the current value.
			for(int i = 0; i <= list.size() - 1; i++) {
				int current = list.get(i);
				if(answer > current) {
					answer = current;
				}
			}
			
			// return the smallest integer
			return answer;
		}
		
		// finds the average of the integers within the array list.
		public static int average(ArrayList<Integer> list) {
			
			// set the values we'll need to do the average of integers 
			// within the array list.
			int average = 0;
			int sum = 0;
			int size = list.size();
			
			// loop through the array list and add all the integers together.
			for(int i = 0; i <= list.size() - 1; i++) {
				int n = list.get(i);
				sum += n;
			}
			
			// perform the average calculation.
			average = sum / size;
			
			// return the result of the average calculation.
			return average;
		}
}
