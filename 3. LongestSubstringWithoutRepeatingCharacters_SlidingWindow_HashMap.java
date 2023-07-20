import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3_SlidingWindow_HashMap {

	//	static char [] s = {'a', 'b', 'b', 'a', 'c', 'a'};	
	static String s = "abcabcbb";	
	
	public static int solution(String input) {
		
		// incorrect
        // Map<Character, Integer> chars = new HashMap();
        Map <Character, Integer> chars = new HashMap<>();

        // initialization of two sides of window
        int left = 0;
        int right = 0;

        // res saves the length of the longest substring
        int res = 0;
        
        while (right < input.length()) {
        	
        	// character on the right side of window
            char r = input.charAt(right);
            
            // getOrDefault() returns 0 (or set as Not Found), if HashMap doesn't contain the key
            chars.put(r, chars.getOrDefault(r,0) + 1);
            
            // hash_map.put(25, "Hello world!");
            // hash_map.get(25)
            // "Hello world!"
            while (chars.get(r) > 1) {

            	// character on the left side of window
            	char l = input.charAt(left);
            	
            	// decrease the frequency of the deleted character
                chars.put(l, chars.get(l) - 1);
           
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
            
	        System.out.println("Hash map: " + chars);
        }
        
        System.out.println(res);
        return res;
	}

	public static void main(String[] args) {
		solution(s);
	}
}