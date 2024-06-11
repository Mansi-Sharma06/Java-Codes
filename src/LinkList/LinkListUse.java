package LinkList;

import java.util.Scanner;

public class LinkListUse {

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
//				node<Integer> temp = head;
//				while (temp.next != null) {
//					temp = temp.next;
//				}
//				temp.next = newnode;
				tail.next = newnode;
				tail = newnode;
//	1			//tail = tail.next (both are same)
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
	
		public static node <Integer> insert (node <Integer> head, int data, int pos) { 
			// return type will be node integer 
			node<Integer> newNode = new node<Integer>(data);
	 
		if(pos == 0) {    // for adding at zero position 
			newNode.next = head;
			return newNode; // now return type will also change from void to node <int>
		} 
		int i = 0;
		
		node<Integer> temp = head;
		while(i < pos-1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		 temp.next = newNode;
		 return head; // for zero position 
	}
		
		public static node<Integer> delete (node<Integer> head, int pos){
			if(head == null) {
				return head;
			}
			if(pos == 0) {
				return head.next;
			}
			
			int count = 0;
			node <Integer> currHead = head;
			int currentPos = 0;
			while(currHead != null && count < (pos-1)) {
				currHead = currHead.next;
				count++;
			}
			if(currHead == null || currHead.next == null) {
				return head;
			}
			currHead.next = currHead.next.next;
			return head;
			
		}
		
		public static node<Integer> midPointLL(node<Integer> head) {
			if(head == null || head.next == null) {
				return head;
			}
			node<Integer> slow = head;
			node<Integer> fast = head;
			while(fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
		
	
	
	public static void main(String[] args) {

		node <Integer> head = takeInput();
	 //	head = insert(head, 80, 3);
	  //  head = 	delete (head, 3);
		node<Integer> data = midPointLL(head);
		System.out.println(data.data);
		
	}

}
 