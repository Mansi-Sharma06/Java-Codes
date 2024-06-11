package LinkList;

import java.util.Scanner;

public class mergeTwoSortedLL {
	
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

	public static node<Integer> mergeTwoSortedLL(node<Integer> head1, node<Integer> head2){
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		node<Integer> head3 = null;
		node<Integer> tail3 = null;
		node<Integer> temp1 = head1;
		node<Integer> temp2 = head2;

		//we have compared for 1 node and attach the head and tail respectively 
			if(temp1.data <= temp2.data) {
//				tail3.next = temp1;
				head3 = temp1;
				tail3= temp1;
				temp1 = temp1.next;
			}else {
				
				head3 = temp2;
				tail3= temp2;
				temp2 = temp2.next;
			}

			
			while(temp1!=null && temp2!=null) {
				if(temp1.data <= temp2.data) {
					tail3.next = temp1;
					tail3 = temp1;
					temp1 =  temp1.next;
				}else {
					tail3.next = temp2;
					tail3 = temp2;
					temp2 =  temp2.next;
				}
			}
			
			//one list is over now
			
			if(temp1 != null) {
				//first list is remaining
				tail3.next = temp1;
			}else {
				//second list is remaining
				tail3.next = temp2;
			}
		return head3;
	}
	
	public static void printR(node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printR(head.next);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> listL1 = takeInput();
		node<Integer> listL2 = takeInput();
		node<Integer> head = mergeTwoSortedLL(listL1, listL2);
		printR(head);
	}
}

	