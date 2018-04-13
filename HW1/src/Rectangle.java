/*
 * Joshua Warren
 * CS211
 * 4/12/2018
 * HW1 Assignment
 */

// Represents rectangle shapes.
public class Rectangle implements Shape {
	
	private double width;
	private double height;
	
	// Constructs a new rectangle with the given dimensions.
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		}
	
	// Returns the area of this rectangle.
	public double getArea() {
		return width * height;
		}
	
	// Returns the perimeter of this rectangle.
	public double getPerimeter() {
		return 2.0 * (width + height);
		}
	
	// HW1: problem 14
	// Equals method for class Rectangle.  
	// Two shapes are considered equal if the 
	// fields are the same.
	public boolean equals(Object o) {
		if(o instanceof Rectangle) {
			Rectangle other = (Rectangle) o;
			return other.height == this.height && other.width == this.width;
		}
		return false;
	}
}