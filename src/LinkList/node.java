package LinkList;

public class node<T> {
	//generic
	
	T data;
	node<T> next;
	
	node(T data){
		this.data = data;
		next = null;
	}

}
