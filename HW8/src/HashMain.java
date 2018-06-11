
// This client program tests our hash set of integers
// by adding and removing several elements from it.
import java.util.Arrays;
public class HashMain {
	public static void main(String[] args) {
		HashIntSet set = new HashIntSet();
		set.add(7);
		set.add(5);
		set.add(1);
		set.add(9);
		// test adding duplicates
		set.add(7);
		set.add(7);
		set.add(5);
		// test collisions and linked lists
		set.add(45);
		set.add(91);
		set.add(71);
		// test rehashing
		set.add(810);   // re-hash should occur here (8/10, load = 0.8)
		set.add(62);
		set.add(1238);
		set.add(-99);
		set.add(-30);
		set.add(42);
		set.add(49857);
		set.add(1520);  // re-hash should occur here (15/20, load = 0.75)
		set.add(2);
		set.add(31);
		set.add(11);
		set.add(21);
		// test removal
		set.remove(7);
		set.remove(9);
		set.remove(1);
		set.remove(1);
		set.remove(21);
		set.remove(71);
		/*
		for (int n : new int[] {1520, 99, 2, 55, 42, 11, 45, 0, 5, -10, 
				810}) {
			System.out.println("contains " + n + "? " + 
					set.contains(n));
		}
		System.out.println(set + ", size " + set.size());
		*/
		
		HashIntSet test = new HashIntSet();
		HashIntSet test1 = new HashIntSet();
		
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		
		HashIntSet addAllTest = new HashIntSet();
		addAllTest.addAll(test);
		
		System.out.println("Should have 5, 6, 7, 8: " + addAllTest);
		
		boolean one = addAllTest.containsAll(test1);
		boolean two = addAllTest.containsAll(test);
		
		System.out.println("Should be false: " + one);
		System.out.println("Should be true: " + two);
		
		HashIntSet everything = new  HashIntSet();
		everything.addAll(test);
		everything.addAll(test1);
		
		System.out.println("Should be 1, 2, 3, 4, 5, 6, 7, 9: " + everything);
		
		everything.removeAll(test);
		
		System.out.println("Should be 1, 2, 3, 4: " + everything);
	}
}
