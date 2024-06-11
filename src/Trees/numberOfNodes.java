package Trees;

import java.util.Scanner;

import Queue.queueEmptyException;
import Queue.queueUsingLL;

public class numberOfNodes {
	
	public static void preOrder(TreeNode<Integer> root) {
		if(root == null) {    // edge case
			return;
		}
		System.out.print(root.data + " ");
		for(int i = 0; i < root.children.size(); i++) {
			preOrder(root.children.get(i));
		}
	}
	
	public static void postOrder(TreeNode<Integer> root) {
		if(root == null) {    // edge case
			return;
		}
		for(int i = 0; i < root.children.size(); i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}
	
	public static void printAtK(TreeNode<Integer> root, int k) {
		
		if(k < 0) {
			return;
		}
		if(k == 0) {       // base case
			System.out.println(root.data);
			return;
		}
		for (int i = 0; i < root.children.size(); i++) {
			printAtK(root.children.get(i), k - 1);
		}
		
	}

    public static int largest(TreeNode<Integer> root) {
		
		if(root == null) {             // edge case
			return Integer.MIN_VALUE;    // infinity
		}
		int ans = root.data;
		for(int i = 0; i < root.children.size(); i++) {
			int childLargest = largest(root.children.get(i));
			if(childLargest > ans) {
				ans = childLargest;
			}
		}
		return ans;
	}
	
	public static int numNodes(TreeNode<Integer> root) {

		if(root == null) {  // not base case but edge case, in case user passes root as null
			return 0;
		}
		int count = 1;
		for(int i = 0; i < root.children.size(); i++) {
			count += numNodes(root.children.get(i));
		}
		return count;
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

	public static TreeNode<Integer> takeInputLevelWise() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();

		queueUsingLL<TreeNode<Integer>> pendingNodes = new queueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter no. of children of " + frontNode.data);

				int numChildren = s.nextInt();
				for(int i = 0; i < numChildren; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);

					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (queueEmptyException e) {
				// should not return 
				return null;
			}
		}
		return root;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode<Integer> root = takeInputLevelWise();
		print(root);
		System.out.println(numNodes(root));
		System.out.println(largest(root));
	//	printAtK(root, 2);
		preOrder(root);
		System.out.println(" ");
		postOrder(root);
		System.out.println(" ");


	}

}
