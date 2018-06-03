/*
 * Joshua Warren
 * CS 211
 * 6/3/2018
 * Homework 7
 */
public class Client {
	
	public static void main (String[] args) {
		
		LinkedIntList test1 = new LinkedIntList();
		test1.add(5);
		test1.add(7);
		test1.add(9);
		test1.add(11);
		LinkedIntList test2 = new LinkedIntList();
		test2.add(0);
		test2.add(1);
		test2.add(2);
		test2.add(3);
		test2.add(4);
		test2.add(5);
		test2.add(6);
		test2.add(7);
		LinkedIntList test3 = new LinkedIntList();
		test3.add(5);
		test3.add(-5);
		test3.add(8);
		test3.add(-8);
		test3.add(10);
		test3.add(-10);
		
		// Exercise 8				
		String thingsa = test1.toString();
		System.out.println(thingsa);
		
		test1.switchPairs();
		String thingsb = test1.toString();
		System.out.println(thingsb);
		
		// Exercise 12
		String thingsc = test3.toString();
		System.out.println(thingsc);
		
		test3.split();
		String thingsd = test3.toString();
		System.out.println(thingsd);
		
		System.out.println("stop");
		
		IntTree testa = new IntTree(5);
		IntTree testb = new IntTree(10);
		
		// Exercise 1
		int count = testa.countLeftNodes();
		int count1 = testb.countLeftNodes();
		System.out.println("countLeftNodes test - should be 2:   " + count);
		System.out.println("countLeftNodes test - should be 5:   " + count1);
		
		// Exercise 5
		//test.printLevel(2);
		testa.printLevel(3);
		testa.printLevel(4);  // should return nothing because it isn't that deep		
		
		// Exercise 8
		String thing = testa.toString();
		System.out.println(thing);
		
		String thing1 = testb.toString();
		System.out.println(thing1);
		

		
		
	}

}
