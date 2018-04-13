/*
 * Class created by Andrew Franko
 */
public class Cylinder extends RectangularPrism implements Shape {
	
	// Constructor for Cylinder using the super class.
	public Cylinder() {
		super();
	}
    
	// Constructor for class Cylinder.
    public Cylinder(double height, double radius){
        super(2 * radius, 2 * radius, height);
    }

    // The formula will need a radius, we we take the length
    // and divide it by two.
	public double getRadius(){
        return getLength() / 2;
    }
	
	// This method gets the value of the base area.
	public double getBaseArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	// This method gets the value for the side area.
    public double getSideArea() {
		return 2 * Math.PI * getRadius() * getHeight();
	}
    
    // Formula for volume of a Cylinder is V = πr2h.
    // Mathematical pie times the radius, squared, and times the height.
    public double getVolume(){
        return getBaseArea() * getHeight();
    }
    
    // Formula for the surface area of a Cylinder is A=2πrh+2πr2.
    // 2 times mathematical pie times radius and height plus
    // 2 times mathematical pie times radius, squared.
    public double getSurfaceArea() {
		return 2 * getBaseArea() + getSideArea();
	}

}
