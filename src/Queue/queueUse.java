package Queue;

public class queueUse {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	//	queueUsingArray queue = new queueUsingArray();
//		queueUsingArray queue = new queueUsingArray(3); // for double capacity
//		for (int i = 1; i <= 5; i++) {
//			try {
//				queue.enqueue(i);
//			} catch (queueFullException e) {
//				
//			}
//		}
//		
//		while(! queue.isEmpty()) {
//			try {
//				System.out.println(queue.dequeue());
//			} catch (queueEmptyException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//}

// for queue using LL

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
    queueUsingLL<Integer> queue = new queueUsingLL<>();
	for (int i = 1; i <= 5; i++) {
		 queue.enqueue(i);
	}
	
	while(! queue.isEmpty()) {
		try {
			System.out.println(queue.dequeue());
		} catch (queueEmptyException e) {
			e.printStackTrace();
		}
	}

}

}

