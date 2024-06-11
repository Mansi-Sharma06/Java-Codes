package Stack;

public class stackUsingArray {
	
   private int data[];
	private int top; // is the index of topmost element of stack
	
	public stackUsingArray() {
		// TODO Auto-generated constructor stub
		
	data = new int[10];
	top = -1;
	}
	
	public stackUsingArray(int capacity) {
		// TODO Auto-generated constructor stub
		
	data = new int[capacity];
	top = -1;
	}
	
	public boolean isEmpty() {
//		if(top == -1) {
//			return true;
//		} else {
//			return false;
//		}
		// both the statements means same
		return (top == -1);
	}
	
	public int size() {
		return top + 1;
	}
	
	public int top() throws stackEmptyException{
		if(size() == 0) {
			//StackEmptyException 
			stackEmptyException e = new stackEmptyException();
			throw e;
		}
		return data[top];
	}

	public void push(int elem) throws stackFullException {

		if(size() == data.length) {
//			// stack full Exception 
//			stackFullException e = new stackFullException();
//			throw e;
			
			doubleCapacity(); // for double capacity stack
		}
		top++;
		data[top] = elem;
	}
	
	public void doubleCapacity() {    // will keep it private as only access to ourself.
		int temp[] = data;
		data = new int [2 * temp.length];
		for (int i = 0; i <= top; i++) {
			data[i] = temp[i];
		}
	}
	
	public int pop() throws stackEmptyException {
		if(size() == 0) {
			//StackEmptyException 
			stackEmptyException e = new stackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}
}

// time complexity of all the functions is empty, size, top, push, pop is O(1).
// only for push in double capacity its O(n).
// all the functons of stack are very efficient.