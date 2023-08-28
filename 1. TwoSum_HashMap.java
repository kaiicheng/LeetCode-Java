import java.util.HashMap;

public class TwoSum1_HashMap {

	static int [] nums = {2, 7, 11, 15};
	static int target = 9;
	
	public static int[] solution(int[] nums, int target) {
		
		// initialize a HashMap
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				int[] ans = new int []{map.get(target - nums[i]), i};
				
				// print out answers from the array
				System.out.println(ans[0]);
				System.out.println(ans[1]);
				
				return ans;
			}
			map.put(nums[i], i);
		}
		return new int[2];
	}
	
	public static void main(String[] args) {
		solution(nums, target);	

	}
}
