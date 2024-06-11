package LinkList;

import java.util.Scanner;

public class reverseIterative {
	
	public static node<Integer> reverse(node<Integer> head){
		
		node<Integer> curr = head;
		node<Integer> prev = null;
		node<Integer> temp;
		
		while(curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		
		return prev;
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
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		node<Integer> head = takeInput();
		head = reverse(head);
		print(head);

	}

}
