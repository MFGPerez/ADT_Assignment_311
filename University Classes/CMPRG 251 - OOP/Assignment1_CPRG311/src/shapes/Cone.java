package shapes;

/**
 * Class description: cone class 
 *
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public class Cone extends Shape {

	/* ENCAPSULATED FIELDS */
	
	private double height;
	private double radius;
	private String shapeName;
	private double baseArea;
	private double volume;

	/**
	 * 
	 * Initializes the newly created default Cone
	 */
	public Cone() {

		this.shapeName = "";
		this.height = 0;
		this.radius = 0;
		
		calcBaseArea();
		calcVolume();
	}

	/**
	 * 
	 * Description: Initializes the newly created Cone
	 * @param shapeName string 
	 * @param height double 
	 * @param radius double 
	 */
	public Cone(String shapeName, double height, double radius) {

		this.shapeName = shapeName;
		this.height = height;
		this.radius = radius;
		
		calcBaseArea();
		calcVolume();

	}

	public double calcVolume() { // works
		
		return volume = ((1 / 3.0) * Math.PI * Math.pow(radius, 2)) * getHeight();
	}

	
	public double calcBaseArea() { // works

		return baseArea = Math.PI * (Math.pow(radius, 2));
	}

	public double getHeight() {
		
		return this.height;
	}

	public double getRadius() {
		return this.radius;

	}

	@Override
	public double getBaseArea() {

		return baseArea;
	}

	@Override
	public double getBaseVolume() {

		return volume;
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
