/*
 * Time: O(n)
 * Space O(mn)
 */

import java.util.LinkedList;
import java.util.Queue;

public class Matrix542_GraphBFS {

	static int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
	
	public static int[][] solution(int[][] matrix){
		
		// initialize a result matrix
		int m = matrix.length, n = matrix[0].length;
		int[][] res = new int[m][n];
		
		// initialize a visited array (mXn)
		boolean[][] visited = new boolean[m][n];
		Queue<int[]> queue = new LinkedList<>();
		
		// initialize a queue with all 0 nodes, a boolean[][] to record visited nodes
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					queue.offer(new int[]{i, j});
					visited[i][j] = true;
				}
			}
		}
		
//		System.out.println(queue);
		
		// initialize cost (level)
		int cost = 0;
		
		// while queue is not empty
		while (!queue.isEmpty()) {
			// retrieve current queue size as number of nodes in the current level
			int size = queue.size();
			for (int s = 0; s < size; s++) {
				// for each node in current level
				int[] cur = queue.poll();
				int i = cur[0], j = cur[1];
				//mark the node with cost
				if (matrix[i][j] == 1) {
					res[i][j] = cost;
				}
				// offer all its neighbor to the queue if not visited and valid
				for (int [] dir: dirs) {
					int x = i + dir[0], y = j + dir[1];
					if (x >=0 && x < m && y >= 0 && y < n && !visited[x][y]) {
						queue.offer(new int[] {x, y});
						visited[x][y] = true;
					}
				}
			}
			// increase level
			cost++;
		}
		
		// print out result
		for (int[] i : res) {
			for (int j : i)
				System.out.print(i[j] + " ");
				System.out.println();
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
		solution(mat);
	}
}
