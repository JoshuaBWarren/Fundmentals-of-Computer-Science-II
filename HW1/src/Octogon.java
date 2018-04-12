// Represent Octogon shapes.
public class Octogon implements Shape{
	
	private int side;
	
	// Contructor for class Octogon.
	public Octogon(int side) {
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

	// This method gets the value for the area of an Octogon.
	@Override
	public double getArea() {
		return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
	}

	// This method gets the value for the perimeter of an Octogon.
	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
	// equals method for class Octogon
	public boolean equals(Object o) {
		if(o instanceof Octogon) {
			Octogon other = (Octogon) o;
			return other.side == this.side;
		}
		return false;
	}

}
