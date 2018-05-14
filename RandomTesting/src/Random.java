import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Random {
	
	public static void main(String[] args) {
		
		System.out.println(SimpleAdding(4));
		System.out.println(LetterCapitalize("i am the batman"));
		
		String[] test = new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
		
		//System.out.println(test.toString());
		System.out.println(longestConsec(test, 2));
		System.out.println(squareDigits(9119));
		
	}

	public static int squareDigits(int n) {
		
	    // set a return empty string
			String answer = "";
	    
	    // turn our input into a string
			String initital = Integer.toString(n);
	    
	    // turn the string into a String array
			String[] array = initital.split("(?!^)");
	    
	    // create an Integer array
			int[] result = new int[array.length];
			
	    // loop through the string array
			for(int i = 0; i < array.length; i++) {
	      // replace result[i] with array[i]
				result[i] = Integer.parseInt(array[i]);
	      // create temp variable to square that value
				int temp = (int) Math.pow(result[i], 2);
	      // add that value into our empty string variable
				answer = answer + temp;
			}
	    // return the string answer as an int
			return Integer.parseInt(answer);
		  }
	
	public static String longestConsec(String[] strarr, int k) {
        
		String answer = "";

        for(int i = 0; i < k; i++) {
        	String tempString = "";
        	for(int j = 0; j < strarr.length; j++) {
        		int temp = 0;
        		if(strarr[j].length() > temp) {
        			tempString = strarr[j];
        		}
        	}
			answer = answer + " " + tempString;
    }
        return answer;
}

	
	
	public static int SimpleAdding(int num) { 

		int temp = num;

		for(int i = 1; i < temp; i++) {
			num = i + num;
		}
		return num;

	} 

	public static String LetterCapitalize(String str) { 

		char[] chars = str.toCharArray();

		chars[0] = Character.toUpperCase(chars[0]);

		for(int i = 1; i < chars.length; i++) {
			if(chars[i - 1] == ' ') {
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}

		str = new String(chars);
		return str;

	} 
}
