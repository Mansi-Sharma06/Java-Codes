package Trees;

import java.util.Scanner;

import Queue.queueEmptyException;
import Queue.queueUsingLL;

public class nodeWithLargestData {
	
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
		System.out.println(largest(root));

	}

}
