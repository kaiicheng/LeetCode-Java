// Binary Search Tree is a node-based binary tree data structure which has the following properties:
// 1. The left subtree of a node contains only nodes with keys lesser than the node’s key.
// 2. The right subtree of a node contains only nodes with keys greater than the node’s key.
// 3. The left and right subtree each must also be a binary search tree.

// java list .size()
// List.add("Scaler");
// List.add("InterviewBit");
// checking the size of the list and printing it
// System.out.println(List.size());  // 2

// java list .get()
// using add() to initialize values 
// [10, 20, 30, 40] 
// arr.add(10); 
// arr.add(20); 
// arr.add(30); 
// arr.add(40); 
// int element = arr.get(2); // element at index 2: 30

import java.util.ArrayList;
import java.util.List;

class BinaryTreeLevelOrderTraversal_BFS {

	// Definition for a binary tree node.
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		// TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	// class to create Tree with Nodes
    public static class Tree {
        private TreeNode root;
    }

	// answer to store result
	static List<List<Integer>> levels = new ArrayList<List<Integer>>();

	public static List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) 
			return levels;
		helper(root, 0);
		return levels;
	}

	public static void helper(TreeNode node, int level) {

		// System.out.println(levels.size());
		
		// create a new level if visit for the first time
		if (levels.size() == level){
			levels.add(new ArrayList<Integer>());
		}
		
		// fulfil the current level
		levels.get(level).add(node.val);

		// process child nodes for the next level
		if (node.left != null){
			helper(node.left, level + 1);
		}
		if (node.right != null){
			helper(node.right, level + 1);
		}
	}

	public static void main(String[] args) {

		// create an object of BinaryTree
	    Tree tree = new Tree();

	    // create nodes of the tree
		// [3,9,20,null,null,15,7]
	    tree.root = new TreeNode(3);
	    // tree.root.left = new TreeNode(9);
	    // tree.root.right = new TreeNode(20);
	    // tree.root.right.left = new TreeNode(15);
	    // tree.root.right.right = new TreeNode(7);

		System.out.println(levelOrder(tree.root));	
	}
}
