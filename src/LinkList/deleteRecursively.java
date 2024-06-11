package LinkList;

import java.util.Scanner;

public class deleteRecursively {
	
	public static node<Integer> delete(node<Integer> head, int pos){
		if(pos == 0) {
			return head.next;
		}
		
		if(head == null) {
			return head;
		}
		
		node<Integer> rCall = delete(head.next , pos-1);
		head.next = rCall;
		return head;
	}
	
		public static node <Integer> takeInput() {

			node <Integer> head = null, tail = null;
			Scanner s = new Scanner(System.in);
			int data = s.nextInt();

			while(data != -1) {
				node<Integer> newnode = new node<Integer>(data);
				if (head == null) {
					head = newnode;
					tail = newnode;

				} else {
//					node<Integer> temp = head;
//					while (temp.next != null) {
//						temp = temp.next;
//					}
//					temp.next = newnode;
					tail.next = newnode;
					tail = newnode;
//		1			//tail = tail.next (both are same)
				}
				data = s.nextInt();
			}
			return head;
		}

		public static void print (node <Integer>head) {
			while (head != null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 node<Integer> head = takeInput();
		head = delete(head, 0);
		print(head);
 
	}

}
