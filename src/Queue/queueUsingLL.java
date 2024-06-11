package Queue;

public class queueUsingLL <T> {
	
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public queueUsingLL() {
		// TODO Auto-generated constructor stub
		front = null;
		rear = null;
		size = 0;
	}
	
	int size() {
		return size;
	}
	
	public boolean isEmpty() {    // public for trees function only
		return size == 0;
	}
	
	T front() throws queueEmptyException {
		if(size == 0) {
			throw new queueEmptyException();
		}
		return front.data;
	}
	
	public void enqueue(T element) {          // public for trees function only
		
		Node<T> newNode  = new Node<>(element);
		if(rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
	
	public T dequeue() throws queueEmptyException {     // public for trees function only
		
		if(size == 0) {
			throw new queueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(size == 1) {
			rear = null;
		}
		size--;
		return temp;
	}

}

// time complexity of all functions will be O(n)

