
public class Client {
	
	public static void main(String[] args) {
		
		LinkedIntList test = new LinkedIntList();
		
		test.add(5);
		test.add(34);
		test.add(51);
		test.add(1);
		test.add(3);
		test.add(16);
		test.add(49);
		test.add(22);
		test.add(-1);
		
		//System.out.println("min test: should return -1 = " + test.min());
		
		System.out.println(test.toString());
		System.out.println(test.moveToEnd());
		
		
	}
	
	
}
