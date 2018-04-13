/*
 * Joshua Warren
 * CS211
 * 4/12/2018
 * HW1 Assignment
 */

public class Client {
	
	public static void main (String[] args) {
		
		TimeSpan test1 = new TimeSpan(1, 30);
		TimeSpan test2 = new TimeSpan(1, 30);
		TimeSpan test3 = new TimeSpan(1, 25);
		
		//System.out.println(test1.equals(test2));
		//System.out.println(test1.equals(test3));
		
		Cash test4 = new Cash(100);
		Cash test5 = new Cash(100);
		Cash test6 = new Cash(150);
		
		//System.out.println(test4.equals(test5));
		//System.out.println(test4.equals(test6));
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(10);
		
		//System.out.println(c1.equals(c2));
		//System.out.println(c1.equals(c3));
		
		Rectangle r1 = new Rectangle(5, 10);
		Rectangle r2 = new Rectangle(5, 10);
		Rectangle r3 = new Rectangle(10, 5);
		
		//System.out.println(r1.equals(r2));
		//System.out.println(r1.equals(r3));
		
		Triangle t1 = new Triangle(1, 2, 3);
		Triangle t2 = new Triangle(1, 2, 3);
		Triangle t3 = new Triangle(2, 4, 6);
		
		//System.out.println(t1.equals(t2));
		//System.out.println(t1.equals(t3));
		
		Octagon o1 = new Octagon(5);
		
		//System.out.println(o1.getArea());
		//System.out.println(o1.getPerimeter());
		
		Hexagon h1 = new Hexagon(5);
		
		//System.out.println(h1.getPerimeter());
		//System.out.println(h1.getArea());
	}

}
