
public class reverseString {

	public static void main(String[] args) {

		// Easy way to reverse a String
		
		String a = "Hello Syntax";
		StringBuffer sb = new StringBuffer(a);
		System.out.println("Reversed String is: " + sb.reverse());

		// Second way to reverse a String
		
//		for (int i = toReverse.length() - 1; i >= 0; i--) {
//			reversed = reversed + toReverse.charAt(i);
//		}
//
//		System.out.println("Reversed String is: " + reversed);

		String toReversed = "Daniel";
		String reversed ="";
		
		for(int i=toReversed.length()-1; i>=0; i--) {
			
			reversed =reversed + toReversed.charAt(i);
		}
		System.out.println(reversed);
		
	}
}
