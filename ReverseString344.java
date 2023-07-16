
public class ReverseString344 {

	// Hello
	static char [] str = {'H', 'e', 'l', 'l', 'o'};	

	static String str2 = "Hello";

	// memory location
	// [I@24d46ca6
	static int [] str3 = {'H', 'e', 'l', 'l', 'o'};	
	
	public static void main(String[] args) {
//	public static void main(String str) {
		// TODO Auto-generated method stub

		// input
		// Hello
		System.out.println(str);
		
		// initialize two pointer
		int i = 0; int j = str.length - 1;
		
		System.out.println(str[i]);
		System.out.println(str[j]);

		// loop over sting from two directions
		while (i < j) {
			// swap str[i] and str[j]
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++;
			j--;
		}
		System.out.println(str);
	}
}
