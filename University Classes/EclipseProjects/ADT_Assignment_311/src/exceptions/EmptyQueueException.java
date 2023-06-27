
package exceptions;

/**
 *
 * @author mfgperez
 */
public class EmptyQueueException extends Exception {
    
    public EmptyQueueException() {
		super("queue is empty");

	}
    
}
