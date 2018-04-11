/*
 * This class is the client facing testing class used to test all
 * of the shape classes for the project.
 */
public class Client {
	
	public static void main(String[] args) {
		
		Cube c1 = new Cube(2);
		
		//System.out.println(c1.getVolume());
		//System.out.println(c1.getSurfaceArea());
		
		RectangularPrism r1 = new RectangularPrism(2, 2, 2);
		
		//System.out.println(r1.getVolume());
		//System.out.println(r1.getSurfaceArea());
		
		Cylinder c10 = new Cylinder(10, 5);
		
		//System.out.println(c10.getSurfaceArea());
		//System.out.println(c10.getVolume());
		
		Cone c20 = new Cone(5, 10);
		
		//System.out.println(c20.getSurfaceArea());
		//System.out.println(c20.getVolume());
		
		Sphere s1 = new Sphere(10);
		
		//System.out.println(s1.getSurfaceArea());
		//System.out.println(s1.getVolume());
		
		TriangularPrism t1 = new TriangularPrism(2, 5, 6);

		//System.out.println(t1.getSurfaceArea());
		//System.out.println(t1.getVolume());
	}

}
