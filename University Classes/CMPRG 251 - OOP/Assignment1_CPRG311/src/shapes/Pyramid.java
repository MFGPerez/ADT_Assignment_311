package shapes;

/**
 * Class description: Pyramid class 
 *
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public class Pyramid extends Shape {

	/* ENCAPSULATED FIELDS */
	
	private double height;
	private double side;
	private String shapeName;
	private double baseArea;
	private double volume;

	public Pyramid() {

		this.shapeName = "";
		this.height = 0;
		this.side = 0;
		
		calcBaseArea();
		calcVolume();
	}

	public Pyramid(String shapeName, double height, double side) {

		this.shapeName = shapeName;
		this.height = height;
		this.side = side;
		
		calcBaseArea();
		calcVolume();

	}

	public double calcVolume() { 

		return volume = ((1 / 3.0) * Math.pow(this.side, 2)) * getHeight();
	}

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
