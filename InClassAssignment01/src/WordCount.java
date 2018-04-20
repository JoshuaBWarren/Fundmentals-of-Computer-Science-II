/*
 * Joshua Warren
 * 4/19/2018
 * CS211
 * In class assignment 01
 * due 4/20/2018
 */

// Uses maps to implement a word count, so that the user
// can see which words occur the most in the book Moby Dick.

import java.io.*;
import java.util.*;

public class WordCount {
	
	// minimum number of occurrences needed to be printed
	public static final int OCCURRENCES = 2000;
	
	public static void main(String[] args)throws FileNotFoundException {
		System.out.println("This program displays the most");
		System.out.println("frequently occurring words from");
		System.out.println("the book Moby Dick.");
		System.out.println();
		
		// read the user's input word and then
		// assign a variable to store the count
		Scanner input = new Scanner(System.in);
		String wordToCheck = input.next().toLowerCase();
		int wordToCheckCount = 0;
	
		// read the book into a map
		Scanner in = new Scanner(new File("mobydick.txt"));
		Map<String, Integer> wordCountMap = getCountMap(in);
		for (String word : wordCountMap.keySet()) {
			int count = wordCountMap.get(word);
			// check for the word key already being counted by the program.
			if(wordCountMap.containsKey(wordToCheck)) {
				// if the key exists, make it's count equal to the variable
				wordToCheckCount = wordCountMap.get(wordToCheck);
			}
			if (count > OCCURRENCES) {
				System.out.println(word + " occurs " + count + " times.");
				}
			}
		System.out.println();
		// print out the total count of the user's input word.
		System.out.println("User input string: " + wordToCheck + ", " + "appears " + wordToCheckCount + " times.");
		}
	
	// Reads book text and returns a map from words to counts
	public static Map<String, Integer> getCountMap(Scanner in) {
		Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();
		
		// ignore all but alphabetic characters and apostrophes
		in.useDelimiter("[^a-zA-Z']+");
		while (in.hasNext()) {
			String word = in.next().toLowerCase();
			

			//String word = in.next().replaceAll("[^a-zA-Z0-9]"," ").toLowerCase().replaceAll("( )+", " ");
			if (!wordCountMap.containsKey(word)) {
				
				// never seen this word before
				wordCountMap.put(word, 1);} else {
					
					// seen this word before; increment count
					int count = wordCountMap.get(word);
					wordCountMap.put(word, count + 1);
					}
			}
		return wordCountMap;
		}
}