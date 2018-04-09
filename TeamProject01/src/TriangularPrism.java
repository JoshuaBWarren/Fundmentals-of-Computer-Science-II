/*
 * TriangularPrism class created by Ho Young Lim
 */
public class TriangularPrism extends RectangularPrism implements Shape {

	public TriangularPrism() {
		super();
	}

	public TriangularPrism(double length, double width, double height) {
		super(length, width, height);
	}
	
	public double getVolume() {
		return super.getVolume() / 2;		
	}
	
	public double getSurfaceArea() {
		return getBaseArea() + 2 * (getFrontArea() + getSideArea());
	}
	
	public double getFrontArea() {
		return super.getFrontArea() / 2;
	}
	
	public double getSideArea() {
		return  Math.hypot(getLength()/2, getHeight()) * getWidth();
	}

}
