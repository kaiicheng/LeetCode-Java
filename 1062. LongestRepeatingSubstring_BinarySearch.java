import java.util.HashSet;

public class LongestRepeatingSubstring1062_BinarySearch {

	static String s = "aabcaabdaab";
	
	public static int check(int LenNow, int len, String S) {
		
//		System.out.println("-----Start of check()!-----");
//		System.out.println("len: " + len);
//		System.out.println("S: " + S);
//		System.out.println("Current Length: " + LenNow);
		
	    HashSet<String> visited = new HashSet<>();
	    String temp;
	    
	    // for(int i = 0; i < len - LenNow + 1; i++) {
	    for(int i = 0; i <= len - LenNow; i++) {
	    	temp = S.substring(i, i + LenNow);
//			System.out.println("temp: " + temp);
	    	if (visited.contains(temp)) {
//	    		System.out.println("-----Repeating!-----");
	    		return i;
	    	}
	    	visited.add(temp);
	    }
//		System.out.println("-----No repeating!-----");
	    return -1;
	  }
	
	
	public static int solution(String input) {
		
		int l = 0; int r = input.length(); int len = input.length();
		
		// L = repeating string length
		int LenNow;
		
		while (l <= r) {
			
			LenNow = l + (r - l) / 2;
		
//			System.out.println("l: " + l);
//			System.out.println("r: " + r);
//			System.out.println("Current Length: " + LenNow);
			
			if (check(LenNow, len, input) == -1) {
//				System.out.println("==-1");
				r = LenNow - 1;
			} else {
//				System.out.println("=!=-1");
				l = LenNow + 1;
			}
		}
		
		// System.out.println(r);
		System.out.println(l - 1);
		
		// System.out.println(r);
		return l - 1;
	}	
	

	public static void main(String[] args) {
		solution(s);
	}

}
