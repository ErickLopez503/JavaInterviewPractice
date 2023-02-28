import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicatesFromArrayList {

	public static void main(String[] args) {

		ArrayList<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Erick");
		aList.add("Erick");


		// 1st way
		HashSet<String> set = new HashSet<>(aList);
		System.out.println(set);

		
		// 2nd way
		HashSet<String> hset = new HashSet<>();
		for (String name : aList) {
			hset.add(name);
		}
        System.out.println(hset);
	}
}
