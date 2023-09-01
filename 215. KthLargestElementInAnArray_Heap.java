import java.util.PriorityQueue;

public class KthLargestElementInAnArray215_Heap {
    public static int solution(int[] nums, int k) {
    	PriorityQueue<Integer> heap = new PriorityQueue<>();
    	for (int x: nums) {
    		if (heap.size() < k || x >= heap.peek()) {
    			heap.offer(x);
    		}
    		if (heap.size() > k) {
    			heap.poll();
    		}
    	}
    	System.out.println(heap.peek());
    	return heap.peek();
    }
	
	public static void main(String[] args) {
		
		int [] nums = {3,2,1,5,6,4};
		int k = 2;
		
		solution(nums, k);
	}
}
