/**
 * @author sibekodumisani
 *
 */

public class Stack<T extends Comparable<T>> {
	
	List<T> list;
	
	/*
	 * Default constructor
	 */
	public Stack() {
		list = new List<T>();
	}
	
	
	/*
	 * Add an element to the stack, by adding at the beginning of the list
	 */
	public void push(T o) {
		list.add(o);
		System.out.println(o + "Added to stack...");
	}
	
	
	/*
	 * Removes an element from the stack, by removing the first element in the list
	 */
	public T pop() {
		list.remove();
		
		if(list.getHead() != null) {
			T obj = list.getHead().element;
			
			return obj;
		}
		else {
			return null;
		}
		
	}
	
	/*
	 * Takes a look at the first element in the stack without removing it (2 marks)
	 */
	public T peek() {
		return list.getHead().element;
	}
	
	/*
	 * Returns the size of the stack
	 */
	public int size() {
		return list.getSize();
	}
	
	/*
	 * Returns whether the stack is empty or not
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
}
