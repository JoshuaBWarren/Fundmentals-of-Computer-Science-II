import java.util.ArrayList;

public class Random {
	
	public static void main(String[] args) {
		
		System.out.println(SimpleAdding(4));
		System.out.println(LetterCapitalize("i am the batman"));
		
		String[] test = new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
		
		//System.out.println(test.toString());
		System.out.println(longestConsec(test, 2));
		
	}

	public static int squareDigits(int n) {
		
		
		
		String number = Integer.toString(n);
		//String[] storage = new String[];
		number.split("");
		
		for(int i = 0; i < number.length(); i++) {
			int temp = Integer.parseInt(number[i]);
		}
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
