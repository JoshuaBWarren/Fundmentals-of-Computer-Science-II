
public class Client {
	
	public static void main (String[] args) {
		
		Rectangle rect1 = new Rectangle(1, 1, 5, 10);
		//Rectangle rect2 = new Rectangle(1, 1, -2, 5);
		Rectangle rect3 = new Rectangle(1, 1, 6, 10);
		
		Point p1 = new Point(5, 6);
		Rectangle rect4 = new Rectangle(p1, 5, 10);
		
		Point p2 = new Point(3, 4);
		Point p3 = new Point(5, 11);
		
		Rectangle rect5 = rect1.union(rect3);
		Rectangle rect6 = rect1.intersection(rect3);
		
		System.out.println(rect1.getX());
		System.out.println(rect1.getY());
		System.out.println(rect1.getHeight());
		System.out.println(rect1.getWidth());
		System.out.println(rect1.toString());
		
		//System.out.println(rect2.getWidth());
		System.out.println(rect1.contains(1, 1));
		System.out.println(rect3.contains(6, 10));
		System.out.println(rect3.contains(6, 10));
		System.out.println(rect3.contains(6, 11));
		System.out.println(rect3.contains(5, 11));
		System.out.println(rect3.contains(3, 8));
		
		System.out.println(rect4.getX());
		System.out.println(rect4.getY());
		System.out.println(rect4.getWidth());
		System.out.println(rect4.getHeight());
		System.out.println(rect4.toString());
		
		System.out.println(rect4.contains(p1));
		System.out.println(rect4.contains(p2));
		System.out.println(rect4.contains(p3));
		
		System.out.println(rect5.toString());
		System.out.println(rect6.toString());
		
		
		
	}

}
