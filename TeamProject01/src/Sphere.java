/*
 * Team Batman
 * CS211
 * 4/12/2018
 * Team Project One
 */

/*
 * Sphere class created by Hadassah Latchague
 */
public class Sphere extends Cube implements Shape {
	
	// Constructor for Sphere using the super class.
	public Sphere() {
		super();
	}
	
	// Constructor for Sphere
	// radius is half the width of a circle, so we multiply 
	// it by 2 to get the full diameter.
	public Sphere(double radius) {
		super(2 * radius);
	}
	
	// Getter method for parameter radius, as size.
	// For the formula's needing a radius, we take the 
	// diameter and divde it by two.
	public double getRadius() {
		return getSize() / 2;
	}
	
	// Method for getting the Perimeter of a sphere.
	public double getPerimeter() {
		return 2 * Math.PI * getRadius();
	}
	
	// Formula for the surface area of a sphere is A = 4πr2.
	// Four times mathematical pie times the radius, squared.
	public double getSurfaceArea() {
		return 4 * Math.PI * Math.pow(getRadius(), 2);
	}
	
	// Formula for the volume of a sphere is V = 4/3πr3
	// 4/3 times mathematical pie times the radius, cubed.
	public double getVolume() {
		return 4 * Math.PI * Math.pow(getRadius(), 3) / 3;
	}

}
