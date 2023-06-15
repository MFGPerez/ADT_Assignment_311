package shapes;

/**
 * Class description: Cylander class
 *
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public class Cylinder extends Shape {

	/* ENCAPSULATED FIELDS */
	
	private double height;
	private double radius;
	private String shapeName;
	private double baseArea;
	private double volume;

	public Cylinder() {

		this.shapeName = "";
		this.height = 0;
		this.radius = 0;
		
		calcBaseArea();
		calcVolume();
	}

	public Cylinder(String shapeName, double height, double radius) {

		this.shapeName = shapeName;
		this.height = height;
		this.radius = radius;
		
		calcBaseArea();
		calcVolume();
	}

	public double calcVolume() { 

		return volume = Math.PI * Math.pow(radius, 2) * getHeight();
	}

	public double calcBaseArea() { 

		return baseArea = Math.PI * Math.pow(radius, 2);
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

	public double getRadius() {
		return this.radius;
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
