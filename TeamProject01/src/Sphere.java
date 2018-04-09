/*
 * Sphere class created by Hadassah Latchague
 */
public class Sphere extends Cube implements Shape {
	
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double getSurfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public double getVolume() {
		return (4.0/3) * Math.PI * Math.pow(radius, 3);
	}

}
