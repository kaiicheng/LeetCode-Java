/*
 * This modify LeetCode question #1 a bit.
 * Return two numbers whose sum is equal to target, instead of their index as original question asks.
 */

import java.util.Arrays;

public class TwoSum1_TwoPointer {
	
	static int [] nums = {2, 7, 11, 15};
	static int target = 9;
	
	public static int[] solution(int[] nums, int target) {
		
		Arrays.sort(nums);
		
		int i = 0; 
		int j = nums.length - 1;
		
		while (i < j) {
			
			int sum = nums[i] + nums[j];
			
			if (sum == target) {
				System.out.println(nums[i]);
				System.out.println(nums[j]);
				return new int[] {nums[i], nums[j]};
			} else if (sum > target) {
				j--;
			} else {
				i++;
			}
		}
		
		// need return to complete
		return null;	
	}
	
	public static void main(String[] args) {
		solution(nums, target);	
	}
}
