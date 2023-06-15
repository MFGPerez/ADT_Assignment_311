package shapes;

/**
 * Class description: Prism sub class of shape, super class to prism 
 *
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public abstract class Prism extends Shape {

	/* ENCAPSULATED FIELDS */
	
	private double height = 0;

	
	/* ABSTRACT METHODS */
	
	public abstract double getSide();

	public abstract double setSide(double side);

	
	

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	





}
