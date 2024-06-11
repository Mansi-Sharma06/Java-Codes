package LinkList;

import java.util.Scanner;

public class reverseLL3 {
	
	public static node<Integer> reverseLLR(node<Integer> head){
		
		if(head == null || head.next == null) {
			return head;
		}
		node<Integer> reversedTail = head.next;
		node<Integer> smallHead = reverseLLR(head.next);
		
		reversedTail.next = head;
		head.next = null;
		return smallHead;
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
		head = reverseLLR(head);
		print(head);
		
	}

}

// its time complexity is also o(n) that too without using double node
// its simplest and efficient of all three approaches.