import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Joshua Warren
 * 4/25/2018
 * CS211
 * Assignment Three
 */

/*
 * Write a method isUnique that accepts a map whose keys and values are strings
 * as a parameter and returns true if no two keys map to the same value.
 * 
 * False otherwise.
 */
public class HW3Ex13 {
	
	/*
	 * Client facing class used for testing.
	 */
	public static void main(String[] args) {
		
		/*
		 * Create the Maps I need to test.
		 */
		Map<String, String> test1 = new TreeMap<String, String>();
		Map<String, String> test2 = new TreeMap<String, String>();
		
		/*
		 * Add key/value strings into test1
		 */
		test1.put("Batman", "Bruce Wayne");
		test1.put("Robin", "Dick Grayson");
		test1.put("Joker", "Clown Prince of Crime");
		test1.put("Harley Quinn","Harleen Quinzel");
		
		/*
		 * Add key/value strings into test2
		 */
		test2.put("Batman", "Bruce Wayne");
		test2.put("Batman Alias", "Bruce Wayne");
		test2.put("Robin", "Dick Grayson");
		
		
		System.out.println("isUnique test: " + isUnique(test1)); // should be false
		System.out.println("isUnique test: " + isUnique(test2)); // should be true
	}
	
	/*
	 * This method takes an input of a Map with key/value pairs of strings.
	 * 
	 * It checks to ensure that no key has the same value as another.
	 */
	public static boolean isUnique(Map<String, String> input) {
		
		// create a set to check for duplicates
		Set<String> temp = new HashSet<String>();
		
		// go through the input map
		for(String key : input.keySet()) {
			String value = input.get(key);
			
			// if the set contains the value
			if(temp.contains(value)) {
				
				// we have a duplicate value; return false
				return false;
			}
			
			// if not, add the value to the set
			temp.add(value);
		}
		
		// if the if-statement never procs, we know there are no duplicate values
		return true;
	}

}
