
public class Main {

	public static void main(String[] args) {
		Node b = new Node(10);
		//a.setNext(b);
		Node a = new Node(5, b);

		System.out.println(a.getData());
		System.out.println(a.getNext().getData());
	}

}
