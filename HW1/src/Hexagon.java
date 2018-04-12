// Represents Hexagon shapes.
public class Hexagon implements Shape{

	private int side;
	
	public Hexagon(int side) {
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


	// This method will get the area of a hexagon.
	public double getArea() {
		return (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
	}

	// This method will get the perimeter of a hexagon.
	public double getPerimeter() {
		return 6 * side;
	}

	
}
