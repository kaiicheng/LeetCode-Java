import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree104_BFS {

	// class to create nodes
	public static class TreeNode {
    	
    	public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
	
	// class to create Tree with Nodes
    public static class Tree {
        private TreeNode root;
    }
	
    public static int solution(TreeNode root) {
        if (root == null) {
        	return 0;
        }
        
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
    
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	for (int i = 0; i <size; i++) {
        		TreeNode cur = queue.poll();
        		if (cur.left != null) {
        			queue.offer(cur.left);
        		}
        		if (cur.right != null) {
        			queue.offer(cur.right);
        		}
        	}
        	depth++;
        }
        System.out.println(depth);
        return depth;
    }
	
	public static void main(String[] args) {
		
	    // create an object of BinaryTree
	    Tree tree = new Tree();
		
	    // create nodes of the tree
		// [3,9,20,null,null,15,7]
	    tree.root = new TreeNode(3);
	    tree.root.left = new TreeNode(9);
	    tree.root.right = new TreeNode(20);
	    tree.root.right.left = new TreeNode(15);
	    tree.root.right.right = new TreeNode(7);
		
		solution(tree.root);
	}

}
