package shapes;

/**
 * Class description: SquarePrism class
 *
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public class SquarePrism extends Prism {

	/* ENCAPSULATED FIELDS */
	
	private double height;
	private double side;
	private String shapeName;
	private double baseArea;
	private double volume;

	public SquarePrism() {

		this.shapeName = "";
		this.height = 0;
		this.side = 0;
		
		calcBaseArea();
		calcVolume();
	}

	public SquarePrism(String shapeName, double height, double side) {

		this.shapeName = shapeName;
		this.height = height;
		this.side = side;
		
		calcBaseArea();
		calcVolume();
	}

	@Override
	public double calcVolume() {

		return volume = Math.pow(this.side, 2) * getHeight();
	}

	@Override
	public double calcBaseArea() {

		return baseArea = Math.pow(this.side, 2);
	}

	@Override
	public double getBaseArea() {

		return baseArea;
	}

	@Override
	public double getBaseVolume() {

		return this.volume;
	}

	public double getHeight() {
		return this.height;
	}

	public double getSide() {
		return this.side;
	}

	public double setSide(double side) {

		return this.side = side;
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
