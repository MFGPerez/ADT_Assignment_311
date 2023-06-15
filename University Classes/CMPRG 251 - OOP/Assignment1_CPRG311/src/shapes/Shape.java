package shapes;

/**
 * Class description: Shape super class 
 *
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public abstract class Shape implements Comparable<Shape> {
	
	/* ENCAPSULATED FIELDS */
	
    private double height;
   
    
   
    /* ABSTRACT METHODS */
    public abstract double calcVolume();
    public abstract double calcBaseArea();
    public abstract double getBaseArea();
	public abstract double getBaseVolume();
	

    public double getHeight() {
        return height;
    }

    public void setHeight(double heights) {
        this.height = heights;
    }
 
   
    
   
    
    public int compareTo(Shape other){
		if ( this.getHeight() > other.getHeight() ){
                    return 1;
                }
		else if ( this.getHeight() < other.getHeight() ){
                    return - 1;
                }
		else return 0;
	}

  
    public String toString() {
        return  "height=" + height;
    }
    

    

    
    
    
}