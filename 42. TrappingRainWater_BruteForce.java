
public class TrappingRainWater42_BruteForce {

	// given an integer array height of length n
	static int [] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};	
	
	public static int solution(int [] input) {

		// ans
		int ans = 0;
	
		// only add one column by each time
		// iterate the array from left to right
		for (int i = 1; i < input.length - 1; i++) {

			int left_max = 0; int right_max = 0;
			
			// search the left part for max bar size
			for (int j = i; j >= 0; j--) {
				left_max = Math.max(left_max, input[j]);
			}

			// search the right part for max bar size
			for (int j = i; j < input.length; j++) {
				right_max = Math.max(right_max, input[j]);
			}

//			System.out.print("i: ");
//			System.out.println(i);
//			
//			System.out.print("Left max: ");
//			System.out.println(left_max);
//			
//			System.out.print("Right max: ");
//			System.out.println(right_max);
//
//			System.out.print("Height[i]: ");
//			System.out.println(input[i]);
			
			// only add one column by each time, so multiple by 1
			ans += Math.min(left_max, right_max) * 1 - input[i];

		}

		System.out.println(ans);
		
		return ans;
	}
	
	public static void main(String[] args) {
		solution(height);
//		System.out.println(height);
	}
}