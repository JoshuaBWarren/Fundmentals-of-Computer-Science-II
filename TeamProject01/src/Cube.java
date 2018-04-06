/*
 * Cube class by Joshua Yuan.
 */
public class Cube extends RectangularPrism implements Shape{

	private double sideLength;
	
	public Cube(){
		super();
	}
	
	public Cube(double len){
		super(len, len, len);
	}
	
	public double getSize() {
		return getLength();
	}
	
	@Override
	public double getSurfaceArea(){
		return 6 * sideLength * sideLength;
		}

	@Override
	public double getVolume(){
		return sideLength * sideLength * sideLength;
		}
}
