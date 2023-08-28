import java.util.HashMap;

public class SubarraySumEqualsK560_HashMap {

	static int [] nums = {3, 4, 7, 2, -3, 1, 4, 2};
	static int target = 7;
	
    public static int solution(int[] nums, int target) {
        
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	map.put(0, 1);
    	
    	int sum = 0, ans = 0;
    	
    	for (int x: nums) {
    		sum += x;
    		if (map.containsKey(sum - target)) {
    			ans += map.get(sum - target);
    		}
    		map.put(sum, map.getOrDefault(sum, 0) + 1);
    	}
    	
		System.out.println(ans);

    	return ans;
    }
	
	public static void main(String[] args) {
		solution(nums, target);	
	}
}
