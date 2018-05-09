import java.util.*;

public class HoYoungLim {
	private static int progress;
	private static boolean bPrintProgress;
	private static Stack<Integer> from = new Stack<>();
	private static Stack<Integer> to = new Stack<>();
	private static Stack<Integer> temp = new Stack<>();

	public static void main(String[] args) {
		testSequence();
		//testMixedInOrder(); 
		//this one is working too in my algorithm
	}

	private static void testSequence() {
		System.out.println("*************************************************");
				System.out.println("Test Sequence Hanoi");
				System.out.println("*************************************************");
						clear();
						stackSequence(from); //add sequence elements to stack
						testHanoi();
	}

	private static void testMixedInOrder() {
		System.out.println("*************************************************");
				System.out.println("Test mix-ordered Hanoi");
				System.out.println("*************************************************");
						clear();
						stackMixed(from); //add mix-ordered elements to stack
						testHanoi();
	}

	private static void clear() {
		from.clear();
		to.clear();
		temp.clear();
	}

	private static void testHanoi() {
		progress = 0;
		bPrintProgress = true; // print progress
		System.out.println("move everyting from 'from' to 'to'");
		printStacks();
		moveHanoi(from, to, temp); // move hanoi
		printStacks();
		bPrintProgress = false; // print result only
		System.out.println("move everyting from 'to' to 'temp'");
		printStacks();
		moveHanoi(to, temp, from); // move hanoi
		printStacks();
		System.out.println("move everyting from 'temp' to 'from'");
		printStacks();
		moveHanoi(temp, from, to); // move hanoi
		printStacks();
	}

	private static void printStacks() {
		System.out.println("from: " + from);
		System.out.println("to: " + to);
		System.out.println("temp: " + temp);
		System.out.println();
	}

	private static void stackSequence(Stack<Integer> stack) {
		for (int i = 9; i > 0; i--) {
			stack.push(i);
		}
	}

	private static void stackMixed(Stack<Integer> stack) {
		stack.push(7);
		stack.push(4);
		stack.push(9);
		stack.push(6);
		stack.push(5);
		stack.push(8);
		stack.push(3);
		stack.push(1);
		stack.push(2);
	}

	public static void moveHanoi(Stack<Integer> from, Stack<Integer> to, 
			Stack<Integer> temp) {
		// move everything from "from" to "to"
		// if there are already some elements in to and temp, lock them (leave them, don't move)
				// ex) from has 1,2,3,4, to has 5,6, and temp has nothing.
				// after calling this method, from will have nothing, to will have 1,2,3,4,5,6, and temp will have nothing.
				//lock to and temp just in case user put some thing in them.
				//hanoi can be moved over something filled stack for the future use.
				moveHanoi2(from, 0, to, to.size(), temp, temp.size());  
	}

	private static void moveHanoi(Stack<Integer> from, int lockFrom, 
			Stack<Integer> to, int lockTo, Stack<Integer> temp, int lockTemp) {
		int sizeFrom = from.size() - lockFrom; //number of elements to move
		int sizeTo = lockTo; //number of elements already in 'to'
		while(to.size() - sizeTo < sizeFrom) { //continue until everything is moved
			//bounce back and forth between 'from' and 'temp' stacks except the bottom one
			//move the bottom one to 'to' stack
			if (temp.size() == lockTemp) { //if 'temp' is empty
				moveHanoi(from, lockFrom + 1, temp, 
						lockTemp, to, lockTo);
				to.push(from.pop());
			}
			else { //if 'from' is empty
				moveHanoi(temp, lockTemp + 1, from, 
						lockFrom, to, lockTo);
				to.push(temp.pop());
			}
			lockTo++; //increase lockTo to lock proper ordered new element which is added to 'to' stack
			if (bPrintProgress) { //print progress
				System.out.println("curent moving #: " 
						+ ++progress);
				System.out.println("curent from: " + from);
				System.out.println("current to: " + to);
				System.out.println("current temp: " + temp);
				System.out.println();
			}
		}
	}

	/*
	 * goal: move everything from a to b 1 2 ... n-2 n-1 n a-----b-----c 1. move
	 * everything from a to c except the last one 2. move the last one from a to b
	 * 3. move everything back from c to b 1 2 ... n-2 n n-1 a-----b-----c 1 2 ...
	 * n-2 n n-1 a-----b-----c 1 2 ... n-2 n-1 n a-----b-----c 4. do it recursively
	 * until base case: one element to move 1 a-----b-----c 1 a-----b-----c
	 */
	private static void moveHanoi2(Stack<Integer> from, int lockFrom, 
			Stack<Integer> to, int lockTo, Stack<Integer> temp, int lockTemp) {
		if (from.size() - lockFrom == 1) { //base case: if there is one element to move
			to.push(from.pop());
			if (bPrintProgress) { //print progress
				System.out.println("curent moving #: " 
						+ ++progress);
				System.out.println("curent from: " + from);
				System.out.println("current to: " + to);
				System.out.println("current temp: " + temp);
				System.out.println();
			}
		}
		else {
			//move everything to 'temp' except bottom one
			moveHanoi2(from, lockFrom + 1, temp, 
					lockTemp, to, lockTo);
			//move bottom one to 'to'
			moveHanoi2(from, lockFrom, to, lockTo, temp, 
					lockTemp);
			//move everything back to 'to'
			moveHanoi2(temp, lockTemp, to, lockTo + 1, 
					from, lockFrom);
		}
	}
}
