
public class Cube implements Shape{

	private double edge;
	
	public Cube(double edge) {
		this.edge = edge;
	}

	/*
	 * Getter method for parameter edge.
	 */
	public double getEdge() {
		return edge;
	}

	/*
	 * Setter method for parameter edge.
	 */
	public void setEdge(double edge) {
		this.edge = edge;
	}


	@Override
	public double getVolume() {
		return Math.pow(edge, 3);
	}

	@Override
	public double getSurfaceArea() {
		return 6 * Math.pow(edge, 2);
	}

}
