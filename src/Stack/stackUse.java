package Stack;

public class stackUse {

	public static void main(String[] args) throws stackFullException {
		// TODO Auto-generated method stub
		
		stackUsingLL<Integer> stack = new stackUsingLL<>();  // for LL method
		
		//stackUsingArray stack = new stackUsingArray(3);   //for array method
		for(int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			try {
			System.out.println(stack.pop());
			} catch (stackEmptyException e) {
				//never reach here
			}
		}
	}

}
