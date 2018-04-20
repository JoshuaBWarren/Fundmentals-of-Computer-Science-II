/*
 * Joshua Warren
 * CS211
 * 4/17/2018
 * Assignment 2
 */

// A Point object represents a pair of (x, y) coordinates.
// Seventh version: Immutable.
// Class invariant: x >= 0 && y >= 0.
public class Point implements Comparable<Point>{
	private int x;
	private int y;
	
	// Constructs a new point at the origin, (0, 0).
	public Point() {
		this(0, 0);    // calls Point(int, int) constructor
		}
		
		// Constructs a new point with the given (x, y) location.// pre: x >= 0 && y >= 0
		public Point(int x, int y) {
			if (x < 0 || y < 0) {
				throw new IllegalArgumentException();
				}
			this.x = x;
			this.y = y;}
		
		// Returns the distance between this Point and (0, 0).
		public double distanceFromOrigin() {
			return Math.sqrt(x * x + y * y);
			}
		
		// Returns whether o refers to a point with the same (x, y)
		// coordinates as this point.
		public boolean equals(Object o) {
			if (o instanceof Point) {
				Point other = (Point) o;
				return x == other.x && y == other.y;
				} else {  // not a Point object
					return false;
					}
			}
		
		// Returns the x-coordinate of this point.
		public int getX() {
			return x;
			}
		// Returns the y-coordinate of this point.
		public int getY() {
			return y;
			}
		
		// Returns a String representation of this point.
		public String toString() {
			return "(" + x + ", " + y + ")";
			}

// Shifts this point's location by the given amount.// pre: x + dx >= 0 && y + dy >= 0
public Point translate(int dx, int dy) {
	return new Point(x + dx, y + dy);
	}


@Override
/*
 * Problem 18: modify the Point class so that it defines a natural ordering
 * by implementing the Comparable interface.  Then, compare points by y-major
 * order, as in, points with smaller y-coordinate values come before those
 * with higher y-coordinate values.
 * 
 * Ties are broken by comparing their x-coordinates
 */
public int compareTo(Point o) {
	
	// grab the input point y-coordinate
	int value = ((Point) o).getY();
	
	// if the input is equal to the Point being checked
	if(this.y == value) {
		
		// then compare their x-coordinates
		return this.x - o.getX();
	} else {
		
		// else the input and Point being check is not
		// equal so compare their y-coordinates
		return this.y - value;
		}
	}
}