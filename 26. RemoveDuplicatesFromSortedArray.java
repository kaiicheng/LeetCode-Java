
public class RemoveDuplicatesFromSortedArray26 {

	// Hello
	static int [] str = {1, 2, 2, 2, 3, 5, 5};		
	
	public static int solution(int [] input) {
		
		// initialization
		int i = 0; int j = 0;
		
		// loop over the sorted array
		while (j < input.length) {
			
			if (i == 0) {
				i++;
				j++;
			} else if (input[j] != input[i - 1]) {  // save array[j] in array[i], if array[j] is not same as array[i-1]
				input[i] = input[j];
				i++;
				j++;
			} else {  // skip array[j], if array[j] is same as array[j-1]
				j++;
			}
			
		}
		
//		for (int n : input) {
//			System.out.println(n);
//		}

		// 4
		//System.out.println(i);
		
		return i;
	}
	
	public static void main(String[] args) {
		solution(str);
	}
}
