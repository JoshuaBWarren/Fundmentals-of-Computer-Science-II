/*
 * Rectangular Prism class created by Joshua Warren.
 * 
 */
public class RectangularPrism extends AbstractShape implements Shape{
	
	// Constructor for RectangularPrism using the super class.
	public RectangularPrism() {
		super();
	}
	
	// Constructor for class RectangularPrism
	public RectangularPrism(double width, double length, double height) {
		super(length, width, height);
	}
	
	// This method grabs the value of the base, or, the value of multiplying the
	// length by the width.
	public double getBaseArea() {
		return getLength() * getWidth();
	}
	
	// This method grabs the value of the front, or, the value of multiplying the
	// length by the height.
	public double getFrontArea() {
		return getLength() * getHeight();
	}
	
	// This method grabs the value of the side, or, the value of multiplying the
	// width by the height.
	public double getSideArea() {
		return getWidth() * getHeight();
	}

	// Formula for the volume of a Rectangular Prism is V = whl.
	// Width times height times length.
	public double getVolume() {
		return getWidth() * getHeight() * getLength();
	}

	// Formula for the surface area of a Rectangular Prism is 2(wl + hl + hw).
	// 2 times the result of width times length plus height times length plus height times width.
	public double getSurfaceArea() {
		return 2 * ((getWidth() * getLength()) + (getHeight() * getLength()) + (getHeight() * getWidth()));
	}

}
