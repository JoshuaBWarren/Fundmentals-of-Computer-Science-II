import java.util.ArrayList;

/*
 * Joshua Warren
 * CS211
 * 4/17/2018
 * Assignment 2
 */

/*
 * This class is the main client facing class and it
 * contains the methods for Homework Assignment Two
 * problems: 1, 3, 7, and 15.
 * 
 * It deals with manipulations of strings and integers
 * inside of an ArrayList.
 */
public class Client {
	
	public static void main(String[] args) {
		
		// create two Point objects
		Point p1 = new Point(7, 2);
		Point p2 = new Point(4, 3);
		
		// print each point and its distance from origin
		//System.out.println("p1 is " + p1);
		//System.out.println("distance from origin = "+ p1.distanceFromOrigin());
		//System.out.println("p2 is " + p2);
		//System.out.println("distance from origin = "+ p2.distanceFromOrigin());
		//System.out.println();
		
		//System.out.println("The below check should be -1");
		//System.out.println("compareT check on p1 into p2: " + p1.compareTo(p2));
		//System.out.println(p1.compareTo(p2));
		//System.out.println();
		
		
		ArrayList<String> test0 = new ArrayList<String>();
		ArrayList<String> test1 = new ArrayList<String>();
		test1.add("Batman");
		test1.add("Robin");
		test1.add("Joker");
		test1.add("Catwoman");
		test1.add("Harley");
		test1.add("Batman");
		
		
		ArrayList<Integer> test2 = new ArrayList<Integer>();
		test2.add(1);
		test2.add(2);
		test2.add(3);
		test2.add(4);
		test2.add(5);
		test2.add(6);
		test2.add(7);
		test2.add(8);
		test2.add(9);
		test2.add(10);
		test2.add(11);
		test2.add(12);
		test2.add(13);
		test2.add(14);
		test2.add(15);
		
		
		//System.out.println("Method averageVowel empty test = " + averageVowels(test0));
		//System.out.println("Method averageVowel test = " + averageVowels(test1));
		//System.out.println();
		
		//System.out.println("ArrayList<String> before removeEvenLength test = " + test1);
		//removeEvenLength(test1);
		//System.out.println("ArrayList<String> after removeEvenLength test = " + test1);
		//System.out.println();
		
		//removeDuplicates(test0); //Should return "Input ArrayList<String> is empty
		//System.out.println("ArrayList<String> before removeDuplicates test = " + test1);
		//removeDuplicates(test1);
		//System.out.println("ArrayList<String> after removeDuplicates test = " + test1);
		//System.out.println();
		
		//System.out.println("ArrayList<Integer> before filterRange test = " + test2);
		//filterRange(test2, 5, 8);
		//System.out.println("ArrayList<Integer> after filterRange test = " + test2);
	}
	
	/*
	 * Problem 1: Write a method called averageVowels that takes an ArrayList of
	 * strings as a parameter and returns the average number of vowel characters.
	 */
	public static double averageVowels(ArrayList<String> input) {
		
		// initiate counter so we can keep track of how many vowels
		double count = 0.0;
		
		// check if the ArrayList input is empty.
		if(input.size() == 0) {
			return 0.0;
		}
		
		// go through the array list and grab each String, then, go through each
		// character and check for vowels.
		// If a vowel is found, add it to the count.
		for(int i = 0; i < input.size(); i++) {
			for(char c : input.get(i).toCharArray()) {
				if(c == 'a' || c == 'A') {
					count++;
				} else if (c == 'e' || c == 'E') {
					count++;
				} else if (c == 'i' || c == 'I') {
					count++;
				} else if (c == 'o' || c == 'O') {
					count++;
				} else if (c == 'u' || c == 'U') {
					count++;
				}
			}
		}
		
		// return the total count divided by the total number
		// of strings within the array.
		return count / input.size();
	}
	
	/*
	 * Problem 3: Write a method called removeEvenLength that takes an ArrayList of
	 * of strings as a paramter and removes all the strings with an even length.
	 * 
	 * Batman = 6 characters (even)
	 * Robin = 5 characters (odd)
	 */
	public static void removeEvenLength(ArrayList<String> input) {
		
		// go through the array list and grab each string
		for(int i = input.size() - 1; i >= 0; i--) {
			String s = input.get(i);
			
			// check the length of the string to see if it's even
			if(s.length() % 2 == 0) {
				
				// if it's even, remove it from the list
				input.remove(i);
			}
		}
	}
	
	/*
	 * Problem 7: Write a method called removeDuplicates that takes as a parameter
	 * an ArrayList of strings and eliminates any duplicates.
	 */
	public static void removeDuplicates(ArrayList<String> input) {
		
		// check if the input ArrayList<String> is empty
		// if it is, print out an error message.
		if(input.size() == 0) {
			System.out.println("Input ArrayList<String> is empty!");
		}
		
		// go through the array list and grab each string
		for(int i = 0; i <= input.size(); i++) {
			
			// then, grab the next string and compare the two
			for(int j = 1 + i; j < input.size(); j++) {
				
				// if the two are the same
				if(input.get(i).equals(input.get(j))) {
					
					// remove it from the list
					input.remove(input.get(i));
				}
			}
		}
	}
	
	/*
	 * Problem 15: write a method called filterRange that accepts an ArrayList of integers
	 * and two integer values called "min" and "max" that removes all integers within the
	 * array that are in between the values of min and max, inclusively.
	 * 
	 * ArrayList<Integer> example = new ArrayList<Integer>(4, 5, 6, 7, 8, 9)
	 * filterRange(input, 5, 8);
	 * example = (4, 9)
	 */
	public static void filterRange(ArrayList<Integer> input, int min, int max) {
		
		// check if the input ArrayList<Integer> is empty
		// if it is, print out an error message.
		if(input.size() == 0) {
			System.out.println("Input ArrayList<Integer> is empty!");
		}
		
		// go through the array and grab each integer
		for(int i = 0; i <= input.size() - 1; i++) {
			
			// set current index of array to value
			int value = input.get(i);
			
			// check if the value is greater than or equal to min
			// or if the value is less than or equal to max
			if(value >= min && value <= max) {
				
				// if it is, remove it and subtract one from i
				input.remove(i);
				i--;
			}
		}
	}
}
