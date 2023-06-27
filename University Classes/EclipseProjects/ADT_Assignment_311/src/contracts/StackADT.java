package contracts;

import java.util.EmptyStackException;

/**
 * Class description: Basic stack interface 
 *
 * Created On: June/25/2023
 *
 * @author Marcel Gallardo (000827700),  Lynn Park , Tyler Halvorsen
 */
public interface StackADT<Type> {
	
	
	/**
	 * Description: removes the first item on top of the stack 
	 * 
	 * @return the item on the top of the stack. 
	 * @throws EmptyStackException if there are not items in the stack
	 */
	public Type pop() throws EmptyStackException; 
	
	/**
	 * Description: adds specified element on top of the stack 
	 * 
	 * @param element to be added to the stack 
	 * @throws NullPointerException if element to add is a null value 
	 */
	public void push(Type element) throws NullPointerException;
	
	/**
	 * Description: looks at the item on the top of the stack without removing it  
	 * 
	 * @return the item on top of the stack 
	 * @throws throws EmptyStackException
	 */
	public Type peek();
	
	/**
	 * Description: removes all items from the stack. 
	 * 
	 */
	public void clear();
	
	
	
	
	/**
	 * Description: checks to see if the stack is empty 
	 * 
	 * @return true if stack has no items (size == 0) and false if stack has items 
	 */
	public boolean isEmpty();
	
	/**
	 * Description: finds the current depth of the stack as a integer 
	 * 
	 * @return the depth of the stack as a integer value 
	 */
	public int size();

}
