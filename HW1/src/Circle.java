/*
 * Joshua Warren
 * CS211
 * 4/12/2018
 * HW1 Assignment
 */

// Represents circle shapes.
public class Circle implements Shape {
	private double radius;
	
	// Constructs a new circle with the given radius.
	
	public Circle(double radius) {
		this.radius = radius;
		}
	
	// Returns the area of this circle.
	
	public double getArea() {
		return Math.PI * radius * radius;
		}
	
	// Returns the perimeter of this circle.
	public double getPerimeter() {
		return 2.0 * Math.PI * radius;
		}
	
	// HW1: problem 14
	// Equals method for class Circle.  
	// Two shapes are considered equal if the 
	// fields are the same.
	public boolean equals(Object o) {
		if(o instanceof Circle) {
			Circle other = (Circle) o;
			return other.radius == this.radius;
		}
		return false;
	}
}