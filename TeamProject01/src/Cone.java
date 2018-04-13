/*
 * Team Batman
 * CS211
 * 4/12/2018
 * Team Project One
 */

/*
 * Cone class created by Karen Velderrain-Lopez
 */
public class Cone extends Cylinder implements Shape{

	// Constructor for Cylinder using the super class.
	public Cone() {
		super();
	}
	
	// Constructor for class Cone.
	public Cone(double radius, double height) {
		super(radius, height);
	}

	// This method grabs the value for the side area.
	public double getSideArea() {
		return Math.PI * getRadius() * Math.hypot(getRadius(), getHeight());
	}
	
	// Formula for the volume of a Cylinder is 
	public double getVolume() {
		return super.getVolume() / 3;		
	}
    
	// Formula for the surface area of a Cylinder is A=πr(r+sqrth2+r2)
	// Mathematical pie times the radius times the square root of
	// height squared plus radius squared.
	public double getSurfaceArea() {
		return getBaseArea() + getSideArea();
	}

}
