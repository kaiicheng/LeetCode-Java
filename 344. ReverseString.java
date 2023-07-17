
public class ReverseString344 {
	
	// Hello
	static char [] str = {'H', 'e', 'l', 'l', 'o'};	

	static String str2 = "Hello";

	// memory location
	// [I@24d46ca6
	static int [] str3 = {'H', 'e', 'l', 'l', 'o'};	
	
	public static char[] solution(char [] input) {
		// TODO Auto-generated method stub

		// input
		// Hello
		// System.out.println(input);
		
		// initialize two pointer
		int i = 0; int j = input.length - 1;
		
		// System.out.println(input[i]);
		// System.out.println(input[j]);

		// loop over sting from two directions
		while (i < j) {
			// swap str[i] and str[j]
			char temp = input[i];
			input[i] = input[j];
			input[j] = temp;
			i++;
			j--;
		}
		return str;
	}
	
	public static void main(String[] args) {
		solution(str);
		System.out.println(str);
	}
}
