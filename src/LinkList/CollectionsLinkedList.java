package LinkList;

import java.util.LinkedList;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<Integer> list = new LinkedList<>();
        // will create a doubly linked list
        
        list.add(10); // one node added
        list.add(30); // insert at the end 
        list.addFirst(40); // add at first
        list.addFirst(70); // add at first
        list.set(2, 100); // will replace the value
        
        System.out.println(list.size());
        // will tell the size of the doubly LL
        
        // printing every value/node of ll
        for(int i = 0; i < list.size(); i++) {
        	System.out.println(list.get(i) +" ");
        }
	}

}
 