/*
 * Rectangular Prism class created by Joshua Warren
 */
public class RectangularPrism extends abstractShape implements Shape{
	
	public RectangularPrism() {
		super();
	}
	
	public RectangularPrism(double width, double length, double height) {
		super(length, width, height);
	}
	
	public double getBaseArea() {
		return getLength() * getWidth();
	}
	
	public double getFrontArea() {
		return getLength() * getHeight();
	}
	
	public double getSideArea() {
		return getWidth() * getHeight();
	}

	@Override
	public double getVolume() {
		return getWidth() * getHeight() * getLength();
	}

	@Override
	public double getSurfaceArea() {
		return 2 * ((getWidth() * getLength()) + (getHeight() * getLength()) + (getHeight() * getWidth()));
	}

}
