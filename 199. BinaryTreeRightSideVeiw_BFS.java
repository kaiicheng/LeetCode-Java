import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideVeiw199_BFS {
	
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

    public static List<Integer> solution(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
        	return res;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
        	
        	int size = queue.size();
        	res.add(queue.peek().val);
        	
        	for (int i = 0; i < size; i++) {
        		TreeNode cur = queue.poll();
        		if (cur.right != null) {
        			queue.offer(cur.right);
        		}
        		if (cur.left != null) {
        			queue.offer(cur.left);
        		}
        	}
        }
        System.out.println(res);
        return res;
    }
    
	public static void main(String[] args) {
		
	    // create an object of BinaryTree
	    Tree tree = new Tree();
		
	    // create nodes of the tree
		// [1,2,3,null,5,null,4]
	    tree.root = new TreeNode(1);
	    tree.root.left = new TreeNode(2);
	    tree.root.right = new TreeNode(3);
	    tree.root.left.right = new TreeNode(5);
	    tree.root.right.right = new TreeNode(4);

		solution(tree.root);	
	}
}
