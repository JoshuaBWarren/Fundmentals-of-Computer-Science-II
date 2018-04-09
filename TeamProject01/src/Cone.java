/*
 * Cone class created by Karen Velderrain-Lopez
 */
public class Cone extends Cylinder implements Shape{
	
	private double radius;
	private double height;
	
	public Cone() {
		super();
	}
	
	public Cone(double radius, double length, double height) {
		super(radius, 0, height);
	}
	
	public double getRadius() {
		return getRadius();
	}
	
	public double getHeight() {
		return getHeight();
	}
	
    public double getVolume(){
        return Math.PI * radius * radius * (height/3);
    }
    
    public double getSurfaceArea(){
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

}
