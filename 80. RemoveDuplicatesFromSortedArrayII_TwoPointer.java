
public class RemoveDuplicatesFromSortedArrayII80_TwoPointer {

	
	static int [] str = {1, 1, 1, 2, 2, 3};		
//	static int [] str = {0, 0, 1, 1, 1, 1, 2, 3, 3};
	
	public static int solution(int [] input) {
		
		// corner case
		if (input.length <= 2) {
			return input.length;
		}
		
		// if index i=0, i+2 exceed the length of nums, then set i larger (i=2) and calculate i-2
		// initialization
		int i = 2;
		
		for (int j = 2; j < input.length; j++) {
			if (input[j] != input[i-2]) {
				input[i] = input[j];
				i++;
			}
		}
		
//		1 1 1 2 2 3 i=2, j=2
//		1 1 2 1 2 3 i=3, j=3
//		1 1 2 1 2 3 i=4, j=3
//		1 1 2 2 1 3 i=4, j=4
//		1 1 2 2 1 3 i=4, j=5
//		1 1 2 2 3 1 i=4, j=6
		
		System.out.println(i);
		
		return i;
	}
	
	public static void main(String[] args) {
		solution(str);
	}
}
