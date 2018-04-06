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


	@Override
	public double getVolume() {
		return getWidth() * getHeight() * getLength();
	}

	@Override
	public double getSurfaceArea() {
		return 2 * ((getWidth() * getLength()) + (getHeight() * getLength()) + (getHeight() * getWidth()));
	}

}
