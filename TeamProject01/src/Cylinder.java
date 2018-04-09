/*
 * Class created by Andrew Franko
 */
public class Cylinder extends RectangularPrism implements Shape {
	
	private double height;
	private double radius;
    
    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    public Cylinder() {
		super();
	}
	public double getLength(){
        return radius*2;
    }
    public double getWidth(){
        return radius*2;
    }
    public double getRadius(){
        return radius;
    }
    public double getVolume(){
        return getBase()*height;
    }
    public double getBase(){
        return Math.PI*radius*radius;
    }
    public double getSideArea(){
        return 2*Math.PI*radius*height;
    }
    public double getSufaceArea(){
        return getSideArea()+2*getBase();
    }

}
