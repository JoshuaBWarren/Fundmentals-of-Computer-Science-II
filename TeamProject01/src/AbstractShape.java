// This class was made via a joint effort by Team Batman.  All individual members are responsible.
public class AbstractShape {
	
	// An abstractShape, or a 3D shape, will have a length, width, and height.
	private double length;
	private double width;
	private double height;
	
	// Empty constructor for class abstractShape.
	public AbstractShape() {}
	
	// Constructor for class abstractShape.
	public AbstractShape(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	// Getter method for parameter length.
	public double getLength() {
		return length;
	}
	
	// Getter method for parameter width.
	public double getWidth() {
		return width;
	}
	
	// Getter method for parameter height.
	public double getHeight() {
		return height;
	}

}
