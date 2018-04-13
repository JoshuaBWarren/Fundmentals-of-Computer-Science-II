/*
 * Team Batman
 * CS211
 * 4/12/2018
 * Team Project One
 */

/*
 * Cube class by Joshua Yuan.
 */
public class Cube extends RectangularPrism implements Shape{
	
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
		return super.getSurfaceArea();
		}

	@Override
	public double getVolume(){
		return super.getVolume();
		}
}
