/*
 * Joshua Warren
 * CS211
 * 4/12/2018
 * HW1 Assignment
 */

// Represent Octagon shapes.
public class Octagon implements Shape{
	
	private int side;
	
	// Empty constructor for class Octagon
	public Octagon() {}
	
	// Constructor for class Octagon.
	public Octagon(int side) {
		this.side = side;
	}
	
	// Getter method for parameter side.
	public int getSide() {
		return side;
	}
	
	// Setter method for parameter side.
	public void setSide(int side) {
		this.side = side;
	}

	// This method gets the value for the area of an Octagon.
	@Override
	public double getArea() {
		return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
	}

	// This method gets the value for the perimeter of an Octagon.
	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
	// equals method for class Octagon
	public boolean equals(Object o) {
		if(o instanceof Octagon) {
			Octagon other = (Octagon) o;
			return other.side == this.side;
		}
		return false;
	}

}
