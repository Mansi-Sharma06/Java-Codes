package Trees;

import java.util.Scanner;

public class takeInputAndPrint {
	
	public static TreeNode<Integer> takeInput(Scanner s){  // for one take input scanner s
		
		int n;
	//	Scanner s = new Scanner(System.in);
		System.out.println("Enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter no. of children" + n);
		
		int childCount = s.nextInt();
		for(int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(s);   // one take input so s passed 
			root.children.add(child);
		}
		return root;
		
	}
	
	public static void print(TreeNode<Integer> root) {
		
		String s = root.data + " : ";
		for(int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + " , ";
		}
		System.out.println(s);
		for(int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		// if wanna to take input in one go then dont need to create new scanner each time 
		
		TreeNode<Integer> root = takeInput(s);  //  one take input so s passed
		print(root);

	}

}
