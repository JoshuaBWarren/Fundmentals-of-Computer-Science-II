/*
 * Team Batman
 * CS211
 * 4/12/2018
 * Team Project One
 */

/*
 * TriangularPrism class created by Ho Young Lim
 */
public class TriangularPrism extends RectangularPrism implements Shape {

	// Constructor for TriangularPrism using the super class.
	public TriangularPrism() {
		super();
	}

	// Constructor for class TriangularPrism.
	public TriangularPrism(double length, double width, double height) {
		super(length, width, height);
	}
	
	// This method grabs the volume of a TriangularPrism.
	public double getVolume() {
		return super.getVolume() / 2;		
	}
	
	// This method grabs the surface area of a TriangularPrism.
	public double getSurfaceArea() {
		return getBaseArea() + 2 * (getFrontArea() + getSideArea());
	}
	
	// This method grabs the value of the front area.
	public double getFrontArea() {
		return super.getFrontArea() / 2;
	}
	
	// This method grabs the value of the side area.
	public double getSideArea() {
		return  Math.hypot(getLength()/2, getHeight()) * getWidth();
	}

}
