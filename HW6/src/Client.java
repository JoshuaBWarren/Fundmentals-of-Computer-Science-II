
public class Client {

	public static void main(String[] args) {
		
		ArrayIntList test = new ArrayIntList();
		test.add(1);
		test.add(18);
		test.add(2);
		test.add(7);
		test.add(18);
		test.add(39);
		test.add(18);
		test.add(40);
		
		ArrayIntList test1a = new ArrayIntList();
		test1a.add(11);
		test1a.add(-7);
		test1a.add(3);
		test1a.add(42);
		test1a.add(0);
		test1a.add(14);
		
		ArrayIntList test1b = new ArrayIntList();
		test1b.add(3);
		test1b.add(42);
		test1b.add(0);
		
		ArrayIntList test2 = new ArrayIntList();
		test2.add(2);
		test2.add(3);
		test2.add(5);
		test2.add(4);
		test2.add(7);
		test2.add(15);
		test2.add(20);
		test2.add(7);
		
		ArrayIntList test3 = new ArrayIntList();
		test3.add(2);
		test3.add(-3);
		test3.add(2);
		test3.add(0);
		test3.add(5);
		test3.add(2);
		test3.add(2);
		test3.add(6);
		
		ArrayIntList test4 = new ArrayIntList();
		test4.add(8);
		test4.add(17);
		test4.add(42);
		test4.add(3);
		test4.add(8);
		
		// lastIndexOf test
		System.out.println("lastIndexOf test - should return 6: " + test.lastIndexOf(18));
		System.out.println("lastIndexOf test - should return -1: " + test.lastIndexOf(3));
	
		// indexOfSubList test
		System.out.println("indexOfSubList test - should return 2: " + test1a.indexOfSubList(test1b));

		// runningTotal test
		
		// should return: [2, 5, 10, 14, 21, 36, 56, 63]
		System.out.println("runnintTotal test - should return new array: " + test2.runningTotal());
		System.out.println("Verify original array is unchanged: " + test2.toString());
	
		// count test
		System.out.println("count test - should return 4: " + test3.count(2));
	
		// removeLast test
		System.out.println("removeLast test - show original list: " + test4.toString());
		System.out.println("removeLast test - show removed last value in list: " + test4.removeLast());
		System.out.println("removeLast test - show new list: " + test4.toString());
		System.out.println("removeLast test - show removed last value in list: " + test4.removeLast());
		System.out.println("removeLast test - show new list: " + test4.toString());
	
	}
}

