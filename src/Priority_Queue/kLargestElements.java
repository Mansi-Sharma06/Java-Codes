package Priority_Queue;

import java.util.PriorityQueue;

public class kLargestElements {
	
	public static void printKlargest(int arr[], int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for(int i = k; i < arr.length; i++) {
			if(pq.peek() < arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		while(! pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
	
	//// OR another code for same approach same 
	
    public static void printKlargest1(int arr[], int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i = 0;
		for( ; i < k; i++) {
			pq.add(arr[i]);
		}
		for( ; i < arr.length; i++) {
			int min = pq.element();
			if(min < arr[i]) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		while(! pq.isEmpty()) {
			System.out.println(pq.remove());
		}
    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,1,6,3,7,2,9,8};
		int k = 3;
		printKlargest(arr, k);
		
		// for second function 
//		int arr[] = {2,15,8,9,12,13,20};
//		int k =3;
//		printKlargest1(arr, k);

	}

}
