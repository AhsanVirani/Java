package LinkedListGeneric;

public class List<T> {

	private Node<T>	head;
	private Node<T>	tail;
	private Node<T>	curr;
	private int	pos;
	private int 	size;

	/** Constructor **/
	public List() {
		this.head = null;	
		this.tail = null;
		this.size = this.pos = 0;
	}
	
	public void append(Node<T> node) {
		if (this.size == 0) {
			this.head = this.tail = this.curr = node;			
		} else {
			this.tail.setNext(node);
			this.tail = node;
		}

		this.size += 1;
	}

	public void append(T data) {
		Node<T> node = new Node<T>(data);
		append(node);
	}

	public Node<T> getHead() {
		return this.head;
	}
	
	public Node<T> getTail() {
		return this.tail;
	}

	public void setHead(Node<T> node) {
		if (this.size == 0) {
			this.head = this.tail = node;
		} else {
			this.head = node;
		}
	}
	
	public void setTail(Node<T> node) {
		if (this.size == 0) {
			this.head = this.tail = node;
		} else {
			this.tail = node;
		}
	}

	public int getSize() {
		return this.size;
	}

	public Node<T> getCurr() {
		if (this.pos < this.size) {
			Node<T> node = this.curr;
			this.curr = this.curr.getNext();
			this.pos += 1;
			return node;	
		}
		return null;
	}

	public void resetCurr() {
		this.pos = 0;
		this.curr = this.head;
	}

}
