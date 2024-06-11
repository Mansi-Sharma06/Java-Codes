package LinkList;

import java.util.Scanner;

public class reverseLL {
	
	public static node<Integer> reverseR(node<Integer> head){
		if(head == null || head.next == null) {
			return head;  //base case
		}
		
		node<Integer> finalHead = reverseR(head.next);
		node<Integer> temp = finalHead;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;   // 2 pointing to 1 in 1234 ll
		head.next = null;   // 1 next has null after the ll is reversed
		return finalHead;
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
		
		node <Integer> head = takeInput();
		head = reverseR(head);
		print(head);

	}

}

// its time complexity is very bad which is o(n^2) 
// we can do a lot to improve this will use double node concept
