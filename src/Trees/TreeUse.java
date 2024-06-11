package Trees;

public class TreeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode<Integer> root =  new TreeNode<Integer>(4);
		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
		TreeNode<Integer> node3 = new TreeNode<Integer>(5);
		TreeNode<Integer> node4 = new TreeNode<Integer>(6);
		// these will just create the nodes 
		
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node2.children.add(node4);
		// these will attach the nodes with each other
		
		System.out.println(root);
		
	}

}
