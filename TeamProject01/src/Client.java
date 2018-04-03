
public class Client {
	
	public static void main(String[] args) {
		
		Cube c1 = new Cube(5);
		
		System.out.println(c1.getVolume());
		System.out.println(c1.getSurfaceArea());
		
		RectangularPrism r1 = new RectangularPrism(10, 5, 8);
		
		System.out.println(r1.getVolume());
		System.out.println(r1.getSurfaceArea());
		
		Shape s1 = new Cube(5);
		
		System.out.println(s1.getVolume());
		System.out.println(s1.getSurfaceArea());
	}

}
