
public class Random {
	
	public static void main(String[] args) {
		
		System.out.println(SimpleAdding(4));
		System.out.println(LetterCapitalize("i am the batman"));
		
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
