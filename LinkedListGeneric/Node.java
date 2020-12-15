
public class Node<T> {

	private T data;
	private Node<T> next;
	private Node<T> prev;

	/**
	<Constructor Node>
	**/
	public Node(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public Node(T data, Node<T> next) {
		this.data = data;
		//Node node = new Node(data);
		this.next = next;
		//this.prev = null;
	}

	public Node(T data, Node<T> next, Node<T> prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	/** <GETTERS FOR THE NODE> **/

	/** Gets the data of the node**/
	public T getData() {
		return this.data;
	}

	/** Gets the next node**/
	public Node<T> getNext() {
		return this.next;
	}

	/** Gets the previous node**/
	public Node<T> getPrev() {
		return this.prev;
	}

	/** <SETTERS FOR THE NODE> **/

	/** Sets the data of the node**/
	public void setData(T data) {
		this.data = data;
	}

	/** Sets the next node**/
	public void setNext(Node<T> next) {
		this.next = next;
	}

	/** Sets the previous node**/
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

}
