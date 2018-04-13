/*
 * Team Batman
 * CS211
 * 4/12/2018
 * Team Project One
 */

/*
 * This class is the client facing testing class used to test all
 * of the shape classes for the project.
 */
public class Client {
	
	public static void main(String[] args) {
		
		Cube c1 = new Cube(2);
		
		//System.out.println("Cube c1.getVolume(): " + c1.getVolume()); //jwl
		//System.out.println("Cube c1.getSurfaceArea(): " + c1.getSurfaceArea()); //jwl
		
		RectangularPrism r1 = new RectangularPrism(2, 2, 2);
		
		//System.out.println("RectangularPrism r1.getVolume(): " + r1.getVolume()); //jwl
		//System.out.println("RectangularPrism r1.getSurfaceArea(): " + r1.getSurfaceArea()); //jwl
		
		Cylinder c10 = new Cylinder(10, 5);
		
		//System.out.println("Cylinder c10.getVolume(): " + c10.getVolume()); //jwl
		//System.out.println("Cylinder c10.getSurfaceArea(): " + c10.getSurfaceArea()); //jwl
		
		Cone c20 = new Cone(5, 10);
		
		//System.out.println("Cone c20.getVolume(): " + c20.getVolume()); //jwl
		//System.out.println("Cone c20.getSurfaceArea(): " + c20.getSurfaceArea()); //jwl
		
		Sphere s1 = new Sphere(10);
		
		//System.out.println("Sphere s1.getVolume(): " + s1.getVolume()); //jwl
		//System.out.println("Sphere s1.getSurfaceArea(): " + s1.getSurfaceArea()); //jwl
		
		TriangularPrism t1 = new TriangularPrism(2, 5, 6);
		
		//System.out.println("TriangularPrism t1.getVolume(): " + t1.getVolume()); //jwl
		//System.out.println("TriangularPrism t1.getSurfaceArea(): " + t1.getSurfaceArea()); //jwl
	}

}
