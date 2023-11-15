// Binary Search Tree is a node-based binary tree data structure which has the following properties:
// 1. The left subtree of a node contains only nodes with keys lesser than the node’s key.
// 2. The right subtree of a node contains only nodes with keys greater than the node’s key.
// 3. The left and right subtree each must also be a binary search tree.

public class UniqueBinarySearchTree {

	static Integer[] memo;

	public static int solution(int n) {

		memo = new Integer[n + 1];
		return dfs(n);
	}

	public static int dfs(int n){
		if (n <= 1){
			return 1;
		}

		if (memo[n] != null){
			return memo[n];
		}

		int res = 0;
		for (int i = 1; i <= n; i++){
			int left = dfs(i - 1);
			int right = dfs(n - i);
			res += left * right;
		}
	
		memo[n] = res;
		return res;
	}

	public static void main(String[] args) {
		System.out.println(solution(3));	
	}
}
