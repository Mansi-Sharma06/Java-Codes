package Stack;

public class stackUsingLL<T> {
	
	private Node <T> head;
	private int size;
	
	public stackUsingLL() {
		head = null;
		size = 0;
	}
	
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size() == 0; 
		//if(head == null){
		// return true;
		// } else {
		// return false;
		// }
	}
	
	T top() throws stackEmptyException {
		
		if(size() == 0) {
//			stackEmptyException e = new stackEmptyException();
//			throw e;
			throw new stackEmptyException();
		}
		return head.data;
	}
	
	void push (T element) {
		
		Node<T> newNode = new Node<T>(element);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	T pop() throws stackEmptyException {
		
		if(size() == 0) {
//			stackEmptyException e = new stackEmptyException();
//			throw e;
			throw new stackEmptyException();
		}
		T tempdata = head.data;
		head = head.next;
		size--;
		return tempdata;
	}
	
	

}
