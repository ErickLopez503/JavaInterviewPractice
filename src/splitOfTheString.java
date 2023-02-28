
public class splitOfTheString {

	public static void main(String[] args) {

		String a = "Welcome to the interview sessions with Syntax";
		
		System.out.println(a.substring(39));  
		
		String[] words = a.split(" "); //Printing how many words are in the String
		System.out.println(words.length);
		
		for (String string : words) {  //Printing word by word
			System.out.println(string);
		} 
	}
}