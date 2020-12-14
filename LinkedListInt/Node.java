
public class Node {

	private int data;
	private Node next;
	private Node prev;

	/**
	<Constructor Node>
	**/
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public Node(int data, Node next) {
		this.data = data;
		//Node node = new Node(data);
		this.next = next;
		//this.prev = null;
	}

	public Node(int data, Node next, Node prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	/** <GETTERS FOR THE NODE> **/

	/** Gets the data of the node**/
	public int getData() {
		return this.data;
	}

	/** Gets the next node**/
	public Node getNext() {
		return this.next;
	}

	/** Gets the previous node**/
	public Node getPrev() {
		return this.prev;
	}

	/** <SETTERS FOR THE NODE> **/

	/** Sets the data of the node**/
	public void setData(int data) {
		this.data = data;
	}

	/** Sets the next node**/
	public void setNext(Node next) {
		this.next = next;
	}

	/** Sets the previous node**/
	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
