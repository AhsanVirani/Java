
public class TestNode {

	public static void main(String[] args) {

		Node<Integer> b = new Node<Integer>(10);

		//Node b = new Node(10);
		//a.setNext(b);
		Node<Integer> a = new Node<Integer>(5, b);

		System.out.println(a.getData());
		System.out.println(a.getNext().getData());

		/** ANORMALISATION **/

		Node<String> d = new Node<String>("World");
		//Node b = new Node(10);
		//a.setNext(b);
		Node<String> c = new Node<String>("Hello, ", d);

		System.out.println(c.getData());
		System.out.println(c.getNext().getData());
	}

}



