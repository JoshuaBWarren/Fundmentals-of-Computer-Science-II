/*
 * Joshua Warren
 * CS211
 * 4/12/2018
 * HW1 Assignment
 */

// Represents triangle shapes.
public class Triangle implements Shape {
	
	private double a;
	private double b;
	private double c;
	
	// Constructs a new Triangle given side lengths.
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		}
	
	// Returns this triangle's area using Heron's formula.
	public double getArea() {
		double s = (a + b + c) / 2.0;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
		}
	
	// Returns the perimeter of this triangle.
	public double getPerimeter() {
		return a + b + c;
		}
	
	// HW1: problem 14
	// Equals method for class Triangle.  
	// Two shapes are considered equal if the 
	// fields are the same.
	public boolean equals(Object o) {
		if(o instanceof Triangle) {
			Triangle other = (Triangle) o;
			return other.a == this.a && other.b == this.b && other.c == this.c;
		}
		return false;
	}
}