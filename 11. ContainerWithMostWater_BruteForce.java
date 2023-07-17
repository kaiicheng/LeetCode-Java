
public class ContainerWithMostWater11_BruteForce {

	// given an integer array height of length n
	static int [] str = {1, 8, 6, 2, 5, 4, 8, 3, 7};	
	
	public static int solution(int [] input) {

		// max to save the largest result
		int max = 0;

		// initialize two pointer		
		for (int left = 0; left < input.length; left++) {
			for (int right = 0; right < input.length; right++) {
				int width = right - left;
				int tempMax = Math.min(input[left], input[right]) * width;
				max = Math.max(tempMax, max);
			}
		}

		System.out.println(max);
		
		return max;
	}
	
	public static void main(String[] args) {
		solution(str);
//		System.out.println(str);
	}
}