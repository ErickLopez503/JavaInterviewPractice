
public class stringPalindrome {

	public static void main(String[] args) {

//		String original = "civic";
//		String reverse = "";
//		
//		for (int i = original.length() - 1; i >= 0; i--) {
//			reverse = reverse + original.charAt(i);
//		}
//		
//		if (original.equals(reverse)) {
//			System.out.println("Given String is Palindrome");
//
//		} else {
//			System.out.println("Given String is NOT Palindrome");
//		}
		
		String original = "civic";
		String palindrome = "";
		
		for(int i=original.length()-1; i>=0; i--) {
			palindrome = palindrome + original.charAt(i);
		}
		
		if (original.equals(palindrome)) {
			System.out.println("Is palindrome");
		} else {
			System.out.println("Is not palindrome");
		}

	}
}
 