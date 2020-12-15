
public class TestList {

	public static void main(String[] args) {
		List<Integer> L1 = new List<Integer>();
		List<String> L2 = new List<String>();

		L1.append(5);
		L1.append(10);
		L1.append(20);
		
		L2.append("My");
		L2.append(" Name is ");
		L2.append("Tatti");

		for (Node n = L1.getCurr(); n != null; n = L1.getCurr()) {
			System.out.println(n.getData());
		}
	
		for(Node n = L2.getCurr(); n != null; n = L2.getCurr()) {
			System.out.println(n.getData());
		}
	}

}



