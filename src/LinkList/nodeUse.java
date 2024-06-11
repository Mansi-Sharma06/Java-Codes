package LinkList;

public class nodeUse {

	public static void main(String[] args) {

		node<Integer> node1 = new node<Integer>(10);
		System.out.println(node1.data);
		System.out.println(node1.next);

		node<Integer> node2 = new node<Integer>(20);
		node1.next = node2;
		System.out.println(node2);
		// print address of node 2
		System.out.println(node1.next);
		//print address of node 1 next element i.e. node 2
		

	}

}
