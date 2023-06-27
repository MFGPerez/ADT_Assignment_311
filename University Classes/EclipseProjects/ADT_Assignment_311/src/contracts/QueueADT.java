package contracts;

import exceptions.EmptyQueueException;



/**
 * Class description: Basic interface for a queue. 
 * 
 * Created On: June/25/2023
 *
 * @author Marcel Gallardo (000827700),  Lynn Park , Tyler Halvorsen
 */
public interface QueueADT<Type> {

	
	/**
	 * Description: adds a item to the end of the queue 
	 * 
	 * @param itemToAdd the item to be added to the queue 
	 * @throws NullPointerException if the element to be added is a null value
	 */
	public void enqueue(Type itemToAdd) throws NullPointerException;
	
	/**
	 * Description: removes the item at the start of the queue 
	 * 
	 * @return item at the from of the queue
	 * @throws EmptyQueueException when queue contains no items 
	 */
	public Type dequeue();
	
	/**
	 * Description: peek method provides the first item in the queue without removing it 
	 * 
	 * @return the first item in the queue 
	 * @throws EmptyQueueException if queue size is equal to zero 
	 */
	public Type peek() throws  EmptyQueueException;
	
	

	
	/**
	 * Description: if queue is equal to zero its empty return true 
	 * 
	 * @return true if queue size is zero and false otherwise 
	 */
	public boolean isEmpty();
	
	/**
	 * Description: returns the queue size as a integer 
	 * 
	 * @return the size of the queue as a integer 
	 */
	public int size();
	
}
