
public class ContainerWithMostWater11_TwoPointer {

	// given an integer array height of length n
	static int [] str = {1, 8, 6, 2, 5, 4, 8, 3, 7};
	
//	static int [] str = {2, 3, 10, 5, 7, 8, 9};
	
	public static int solution(int [] input) {

		// initialization
		int left = 0; int right = input.length - 1;
		
		// max to save the largest result
		int max = 0;
		
		while (left < right) {
			
			int width = right - left;
			int tempMax = Math.min(input[left], input[right]) * width;
			max = Math.max(tempMax, max);
//			System.out.println(max);
			if (input[left] > input[right]) {
				right--;
			} else {
				left++;
			};
			
//incorrect attempt:
//			int width = right - left;
//			int tempMax = Math.min(input[left], input[right]) * width;
//			max = Math.max(tempMax, max);
//			System.out.println(max);
//			left++;
//			
//			width = right - left;
//			tempMax = Math.min(input[left], input[right]) * width;
//			max = Math.max(tempMax, max);
//			System.out.println(max);
//			right--;
		}

		System.out.println(max);
		
		return max;
	}
	
	public static void main(String[] args) {
		solution(str);
//		System.out.println(str);
	}
}
