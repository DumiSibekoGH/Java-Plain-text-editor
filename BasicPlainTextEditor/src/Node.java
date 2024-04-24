/**
 * 
 */

/**
 * @author sibekodumisani
 *
 */
public class Node<T> {
	T element;
	Node<T> next;
	
	public Node(T elem, Node<T> next){
		this.element = elem;
		this.next = next;
	}

	/**
	 * @return the element
	 */
	public T getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(T element) {
		this.element = element;
	}

	/**
	 * @return the next
	 */
	public Node<T> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
}
