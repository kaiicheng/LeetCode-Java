import java.util.Arrays;

public class RemoveAllAdjacentDuplicatesInString1047_TwoPointer {

//	static char [] s = {'a', 'b', 'b', 'a', 'c', 'a'};	
	static String s = "abbaca";	
	
	public static String solution(String input) {
		
		// turn string into array
		char[] inputArray = input.toCharArray();
		
		// initialization two pointers
		int i = 0; int j = 0;
		
		// loop over the array
		while (j < inputArray.length) {
			inputArray[i] = inputArray[j];
			if (i > 0 && inputArray[i - 1] == inputArray[i]) {
				i -= 2;
			}
			i++;
			j++;
		}
		
		// the end of each loop
//		abbaca i=0, j=0
//		abbaca i=1, j=1
//		abbaca i=2, j=2
//		abbaca i=1, j=3
//		aabaca i=0, j=4
//		cabaca i=1, j=5
//		cabaca i=2, j=6
		
		
		// equal to:
//		for (int j = 0; j < inputArray.length; j++, i++) {
//			inputArray[i] = inputArray[j];
//			if (i >0 && inputArray[i - 1] == inputArray[i]) {
//				i -= 2;
//			}
//		}

		// cabaca
//		System.out.println(inputArray);

		// turn array back to string
		String ans = Arrays.toString(inputArray);
		// [c, a, b, a, c, a]
//		System.out.println(ans);
		
		// remove "[", ",", and "]"
		ans = Arrays.toString(inputArray).replace("[", "").replace(",", "").replace("]", "");
		// c a b a c a
//		System.out.println(ans);
		
		// replace all " " space with empty ""
		ans = ans.replaceAll(" ", "");
		// cabaca
		System.out.println(ans);			
		
		// only return part of string
		// i = 2
		System.out.println(ans.substring(0, i));

		return ans.substring(0, i);
	}
	
	public static void main(String[] args) {
		solution(s);
	}
}