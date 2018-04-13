/*
 * Joshua Warren
 * CS211
 * 4/12/2018
 * HW1 Assignment
 */

/*
 * This is the client facing class used for testing.
 */
public class Client {
	
	public static void main (String[] args) {
		
		TimeSpan test1 = new TimeSpan(1, 30);
		TimeSpan test2 = new TimeSpan(1, 30);
		TimeSpan test3 = new TimeSpan(1, 25);		
		
		//System.out.println("TimeSpan equals test 1 (should be true): " + test1.equals(test2)); //jwl
		//System.out.println("TimeSpan equals test 2 (should be false): " + test1.equals(test3)); //jwl
		
		Cash test4 = new Cash(100);
		Cash test5 = new Cash(100);
		Cash test6 = new Cash(150);
		
		//System.out.println("Cash equals test 1 (should be true): " + test4.equals(test5)); //jwl
		//System.out.println("Cash equals test 2 (should be false): " + test4.equals(test6)); //jwl
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(10);
		
		//System.out.println("Circle equals test 1 (should be true): " + c1.equals(c2)); //jwl
		//System.out.println("Circle equals test 2 (should be false): " + c1.equals(c3)); //jwl
		
		Rectangle r1 = new Rectangle(5, 10);
		Rectangle r2 = new Rectangle(5, 10);
		Rectangle r3 = new Rectangle(10, 5);
		
		//System.out.println("Rectangle equals test 1 (should be true): " + r1.equals(r2)); //jwl
		//System.out.println("Rectangle equals test 2 (should be false): " + r1.equals(r3)); //jwl
		
		Triangle t1 = new Triangle(1, 2, 3);
		Triangle t2 = new Triangle(1, 2, 3);
		Triangle t3 = new Triangle(2, 4, 6);
		
		//System.out.println("Triangle equals test 1 (should be true): " + t1.equals(t2)); //jwl
		//System.out.println("Triangle equals test 2 (should be fasle): " + t1.equals(t3)); //jwl
		
		Octagon o1 = new Octagon(5);
		
		//System.out.println("Octagon o1.getArea(): " + o1.getArea()); //jwl
		//System.out.println("Octagon o1.getPerimeter(): " + o1.getPerimeter()); //jwl
		
		Hexagon h1 = new Hexagon(5);
		
		//System.out.println("Hexagon h1.getArea(): " + h1.getArea()); //jwl
		//System.out.println("Hexagon h1.getPerimeter(): " + h1.getPerimeter()); //jwl
	}

}
