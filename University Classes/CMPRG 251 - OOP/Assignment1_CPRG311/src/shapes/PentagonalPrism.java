package shapes;

/**
 * Class description: PentagonalPrism class 
 *
 *  @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public class PentagonalPrism extends Prism {

	/* ENCAPSULATED FIELDS */
	
	private double height;
	private double side;
	private String shapeName;
	private double baseArea;
	private double volume;

	public PentagonalPrism() {

		this.shapeName = "";
		this.height = 0;
		this.side = 0;
		
		calcBaseArea();
		calcVolume();
	}

	public PentagonalPrism(String shapeName, double height, double side) {

		this.shapeName = shapeName;
		this.height = height;
		this.side = side;
		
		calcBaseArea();
		calcVolume();
	}

	@Override
	public double calcVolume() {

		return volume = calcBaseArea() * getHeight();

	}

	@Override
	public double calcBaseArea() {


		return baseArea = (5 * Math.pow(this.side, 2)) * Math.tan(Math.toRadians(54))/4;
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
