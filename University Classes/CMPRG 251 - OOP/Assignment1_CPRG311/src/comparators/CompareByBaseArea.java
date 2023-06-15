package comparators;

import java.util.Comparator;

import shapes.Shape;

/**
 * Class description:  CompareByBaseArea class used to compare a shape via there Base Area 
 *
 *  @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public class CompareByBaseArea implements Comparator<Shape> {
	
	@Override
	public int compare(Shape shape1, Shape shape2) {

		return (int) (shape1.getBaseArea() - shape2.getBaseArea());
	}

}
