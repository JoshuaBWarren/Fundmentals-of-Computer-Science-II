/*
 * Joshua Warren
 * 4/25/18
 * CS211
 * In class Assignment
 * 
 * This class creates the object Domino, with each side
 * posessing an int number.
 */
public class Domino {
	
	private int first;
	private int second;

	/*
	 * Constructor for class Domino
	 */
	public Domino(int first, int second) {
		this.first = first;
		this.second = second;
	}

	/*
	 * Getter method for parameter first.
	 */
	public int first() {
		return first;
	}

	/*
	 * Getter method for parameter second.
	 */
	public int second() {
		return second;
	}
	
	/*
	 * This method flips a domino.
	 * 
	 * Ex: (1|4) = (4|1)
	 */
	public void flip() {
		int temp = first;
		first = second;
		second = temp;
	}	
	
	/*
	 * toString method for class Domino
	 */
	public String toString() {
		return "(" + first + "|" + second + ")";
	}



	
}
