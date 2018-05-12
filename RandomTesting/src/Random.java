import java.util.ArrayList;
import java.util.Arrays;

public class Random {
	
	public static void main(String[] args) {
		
		//System.out.println(SimpleAdding(4));
		//System.out.println(LetterCapitalize("i am the batman"));
		
		String[] test = new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
		
		//System.out.println(test.toString());
		//System.out.println(longestConsec(test, 2));
		
		String temp = "Iambatman";
		//String[] test1 = temp.split("");
		
		String temp1 = "batman";
		//String[] test2 = temp1.split("");
		
		if(temp.contains(temp1)) {
			//System.out.println("Ok!");
		}
		//System.out.println(Arrays.toString(test1));
		
		String a = "abcd";
		String b = "cdabcdab";
		
		String x = "cdef";
		String y = "fcdefcdefcdefcdef";
		
		System.out.println(googleQuestion1(x, y));
		
		int[] A = {1, 1, 1, 2, 2};
		int[] E = {1, 2, 1, 3, 2, 4, 2, 5};
		
		
		
	}
	
	public static int googleQuestion1(String A, String B) {
		
		//String[] inputA = A.split("");
		//String[] inputB = B.split("");
		
		int answer = 1;
		
		if(!B.contains(A)) {
			return -1;
		}
		
		for(int i = 0; i < B.length(); i++) {
			if(!A.contains(B)) {
				A = A + A;
				answer++;
			} 
		}
	return answer;
}
	
	
	
	
	

	public static int squareDigits(int n) {
		
		
		
		String number = Integer.toString(n);
		//String[] storage = new String[];
		number.split("");
		
		for(int i = 0; i < number.length(); i++) {
			//int temp = Integer.parseInt(number[i]);
		}
		
		return n;
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
