package Stack;

import java.util.Stack;

public class stackCollections {
	
	public static void main(String[] args) {
		
		Stack <Integer> stack = new Stack <>();
		int arr[] = {5,2,8,1};
		
		for(int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		
		while(! stack.isEmpty()) {
			
			System.out.println(stack.pop());
		}
		
		
	}

}
