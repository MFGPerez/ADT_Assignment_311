package shapes;

/**
 * Class description: TriangularPrism class
 *
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public class TriangularPrism extends Prism {

	/* ENCAPSULATED FIELDS */
	
	private double height;
	private double side;
	private String shapeName;
	private double baseArea;
	private double volume;

	public TriangularPrism() {

		this.shapeName = "";
		this.height = 0;
		this.side = 0;
		
		calcBaseArea();
		calcVolume();
	}

	public TriangularPrism(String shapeName, double height, double side) {

		this.shapeName = shapeName;
		this.height = height;
		this.side = side;
		
		calcBaseArea();
		calcVolume();
	}

	@Override
	public double calcVolume() {
		
		return volume = (calcBaseArea() * getHeight()) / 3.0;
	}

	@Override
	public double calcBaseArea() {
		
		return baseArea = (Math.pow(side, 2) * Math.sqrt(3)) / 4.0;
	}

	@Override
	public double getBaseArea() {
		
		return baseArea;
	}

	@Override
	public double getBaseVolume() {
		
		return volume;
	}

	@Override
	public double getSide() {
		
		return this.side;
	}

	public double setSide(double side) {

		return this.side = side;
	}

	@Override
	public double getHeight() {
		
		return this.height;
	}

	/**
	 * @return the shapeName
	 */
	public String getShapeName() {
		return shapeName;
	}

	/**
	 * @param shapeName the shapeName to set
	 */
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}



}
