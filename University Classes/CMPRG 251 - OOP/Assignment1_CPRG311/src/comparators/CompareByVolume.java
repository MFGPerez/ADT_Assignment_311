package comparators;

import java.util.Comparator;

import shapes.Shape;

/**
 * Class description: CompareByVolume class used to compare a shape via there Volume 
 *
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public class CompareByVolume implements Comparator<Shape> {
	
	@Override
	public int compare(Shape shape1, Shape shape2) {
		
		return (int) (shape1.getBaseVolume() - shape2.getBaseVolume());
	}


}
