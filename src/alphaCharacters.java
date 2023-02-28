
public class alphaCharacters {

	public static void main(String[] args) {
		

		String given = "wefeKHGUFVqf878979797fewfewrf879797efds&^&^*^*^";
		//String replaced = given.replaceAll("[A-Za-z]", "");
		String replaced = given.replaceAll("[A-Za-z0-9]", "");

		System.out.println(replaced);

	}
}
 