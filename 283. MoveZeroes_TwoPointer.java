
public class MoveZeroes283_TwoPointer {

	// given an integer array height of length n
	static int [] nums = {0, 1, 0, 3, 12};	
	
	public static int[] solution(int [] input) {

		// initialization two pointers
		int i = 0; int j = 0;
		
		// temp to save temporary number
		int temp = 0;
		
		// loop over the array
		while (j < input.length)  {
			if (input[i] == 0) {
				if (input[j] != 0) {
					temp = input[j];
					input[j] = input[i];
					input[i] = temp;
				} else {
					j++;
				}
			} else {
				i++;
				j++;
			}
		}

		for (int n: input) {
			System.out.println(n);
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		solution(nums);
//		System.out.println(height);
	}
}
