package LinkList;

import java.util.Scanner;

public class reverseLL2 {
	
	public static DoubleNode reverseLLBetter(node<Integer> head) {
		if(head == null || head.next == null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode smallAns = reverseLLBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		
		DoubleNode ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head; 
		return ans;
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
		DoubleNode ans = reverseLLBetter(head);
		print(ans.head);
	}

}

// its time complexity will be o(n) which is a great improbement

/* class DoubleNode {
	
	node<Integer> head;
	node<Integer> tail;

}*/

// we can actually add more than two class in one java file but the class having same name as java file name remain public
// else we will use simple without public that will work fine.
