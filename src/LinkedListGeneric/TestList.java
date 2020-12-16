package LinkedListGeneric;

import java.util.Iterator;

public class TestList {

	public static void main(String[] args) {
		List<Integer> L1 = new List<>();
		List<String> L2 = new List<String>();
		List<Student> L3 = new List<Student>();

		List<Integer> L4 = new List<>();

		L1.append(5);
		L1.append(10);
		L1.append(20);
		
		L2.append("My");
		L2.append(" Name is ");
		L2.append("Tatti");

		L3.append(new Student("Ahsan", 20));
		L3.append(new Student("Faiz", 14));
/**
		for (Node<Integer> n = L1.getCurr(); n != null; n = L1.getCurr()) {
			System.out.println(n);
		}
	
		for(Node<String> n = L2.getCurr(); n != null; n = L2.getCurr()) {
			System.out.println(n);
		}

		for(Node<Student> n = L3.getCurr(); n != null; n = L3.getCurr()) {
			System.out.println(n);
		}
**/
		Iterator<Integer> it = L1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}



