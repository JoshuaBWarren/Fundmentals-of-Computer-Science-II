
public class Rectangle {
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	/*
	 * Constructs a rectangle located at x and y coordinates
	 * with an integer width and height.
	 * 
	 * If height and width are negative numbers then
	 * throw an exception.
	 */
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		if(width < 0 || height < 0) {
			throw new IllegalArgumentException("Width/Height cannot be a negative number.");
		}
		this.width = width;
		this.height = height;
	}
	
	/*
	 * Constructions a rectangle located at Point p
	 * with an integer width and height.
	 */
	public Rectangle(Point p, int width, int height) {
		this(p.getX(), p.getY(), width, height);
	}
	
	/*
	 * Getter method for parameter x.
	 */
	public int getX() {
		return x;
	}

	/*
	 * Getter method for parameter y.
	 */
	public int getY() {
		return y;
	}

	/*
	 * Getter method for parameter width.
	 */
	public int getWidth() {
		return width;
	}

	/*
	 * Getter method for parameter height.
	 */
	public int getHeight() {
		return height;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 
	 * toString method that prints out the object Rectangle
	 * into a String format.
	 */
	public String toString() {
		return "Rectangle" + " [" + "x = " + x + ", " + "y = " + y + ", " + "width = " + width + ", " + "height = " + height + "]";
	}
	
	/*
	 * Method for proving if the given x and y coordinates
	 * are within the given Rectangle.
	 */
	public boolean contains(int x, int y) {
		return this.x <= x && x < this.x + this.width &&
				this.y <= y && y < this.y + this.height;
	}
	
	/*
	 * Method for proving if the given Point p
	 * is within the given Rectangle.
	 */
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}
	
	/*
	 * Method for returning a new rectangle that represents the tightest
	 * bound box that is contained within the the old and new Rectangle.
	 */
	public Rectangle union(Rectangle rect) {
		
        int left = Math.min(this.x, rect.x);
        int right = Math.max(this.x + this.width, rect.x + rect.width);
        
        int top = Math.min(this.y, rect.y);
        int bottom = Math.max(this.y + this.height, rect.y + rect.height);
        
        return new Rectangle(left, top, right - left, bottom - top);
	}
	
	/*
	 * Method for returning a new rectangle that represents the largest
	 * rectangular region that is contained within both rectangles.
	 * 
	 * If the rectangles don't intersect, then make width and height 0.
	 */
    public Rectangle intersection(Rectangle rect) {
    	
        int left = Math.max(this.x, rect.x);
        int right = Math.min(this.x + this.width, rect.x + rect.width);
        
        int top = Math.max(this.y, rect.y);
        int bottom = Math.min(this.y + this.height, rect.y + rect.height);
        
        int width = Math.max(0, right - left);
        int height = Math.max(0, bottom - top);
        
        return new Rectangle(left, top, width, height);
    }
	

}
