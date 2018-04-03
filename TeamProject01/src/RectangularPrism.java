
public class RectangularPrism implements Shape{

	private int width;
	private int length;
	private int height;
	
	public RectangularPrism(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	

	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public double getVolume() {
		return width * height * length;
	}

	@Override
	public double getSurfaceArea() {
		return 2 * ((width * length) + (height * length) + (height * width));
	}

}
