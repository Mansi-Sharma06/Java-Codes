package LinkList;

import java.util.Scanner;

public class insertRecursively {

	public static node<Integer> insert(node<Integer> head, int pos, int elem){
		
		if(pos == 0) {
			node<Integer> newNode = new node<>(elem);
			newNode.next = head;
			return newNode;
		}
		
		if(head == null) {
			return head;
		}
		head.next = insert(head.next, pos-1, elem);
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
		head = insert(head, 5, 10);
		print(head);
	}

}
