
public class TrappingRainWater42_TwoPointer {

	// given an integer array height of length n
	static int [] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};	
	
	public static int solution(int [] input) {

		// ans
		int ans = 0;
	
		// initialization two pointers
		int left = 0; int right = input.length - 1;
		
		// left max and right max to save the highest bar
		int left_max = 0; int right_max = 0;
		
		// iterate the array from left to right
		while (left < right) {
			if (input[left] < input[right]) {
				
				// incorrect in Java, works in C++
//				input[left] >= left_max ? (left_max = input[left]) : ans += (left_max - input[left]);
				
				// equal to:
				if (input[left] >= left_max) {
					left_max = input[left];
				} else {
					ans += left_max - input[left];
				}

				left++;
			} else {
				
				// incorrect in Java, works in C++
//				input[right] >= right_max ? (right_max = input[right]) : ans += (right_max - input[right]);
				
				
				// equal to:
				if (input[right] >= right_max) {
					right_max = input[right];
				} else {
					ans += right_max - input[right];
				}
				right--;
			}
		}
		
		System.out.println(ans);
		return ans;
	}
	
	public static void main(String[] args) {
		solution(height);
//		System.out.println(height);
	}
}