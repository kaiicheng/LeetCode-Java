import java.util.HashMap;
import java.util.HashSet;
//import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3_SlidingWindow_HashSet {

	static String s = "abcabcbb";	
	
	public static int solution(String input) {
	
        // initialization of two sides of window
		int left = 0; int right = 0; 
		
        // max saves the length of the longest substring
		int max = 0;
		
		Set<Character> set = new HashSet<>();
		
		while (right < input.length()) {
			
			if (set.contains(input.charAt(right))) {
			
//				set.remove(input.charAt(left++));
				set.remove(input.charAt(left));
				left++;
				
			} else {
			
//				set.add(input.charAt(right++));
				set.add(input.charAt(right));
				right++;
				
//	            max = Math.max(max, right - left + 1);
				
				if ((right - left) > max) {
					max = right - left;
				}
			}
			
			System.out.println(max);
			System.out.println(set);
		}
		
		System.out.println(max);
		
		return max;
	}

	public static void main(String[] args) {
		solution(s);
	}
}
