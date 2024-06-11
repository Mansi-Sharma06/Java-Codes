package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class queueCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();
		
	    System.out.println(queue.add(10));    //enqueue
		System.out.println(queue.add(20));   // enqueue
		System.out.println(queue.add(40));
		System.out.println(queue.poll());   // dequeue
		System.out.println(queue.size());   // size
		System.out.println(queue.peek());   // front
		System.out.println(queue.isEmpty());   // is empty check
	

	}

}
