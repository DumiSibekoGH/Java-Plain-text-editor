

/**
 * @author sibekodumisani
 *
 */
public class List<T>  {
	
	Node<T> head;
	int size;

	public List() {
		head = null;
		size = 0;
	}

	/**
	 * @return the head
	 */
	public Node<T> getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Node<T> head) {
		this.head = head;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	
	public void add(T newElem) {
		Node<T> n = new Node<T>(newElem,head);
		head = n;
	}
	
	public void remove() {
		if(head != null)
		head = head.getNext();
	}
	
	
	public Node<T> search(T elem){
		Node<T> n = head;
		
		if(n != null) {
			while(n.element != elem) {
				n = n.next;
			}
			
			return n;
		}
		
		return null;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		
		return false;
	}
}
