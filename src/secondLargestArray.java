import java.util.Arrays;

public class secondLargestArray {

	public static void main(String[] args) {

//		int[] numArray = { 12, 11, 34, 5, 6, 77, 87 };
//
//		Arrays.sort(numArray);
//		System.out.println(numArray[numArray.length - 2]);

		int[] numArray = { -2, 12, 13, 12, 15, 0, -1 };
		int largest = numArray[0];
		int smallest = numArray[0];
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > largest) {
				largest = numArray[i];
			}
			if (numArray[i] < smallest) {
				smallest = numArray[i];
			}

		}

		System.out.println("The min value in the array is: " + smallest);
		System.out.println("The max value in the array is: " + largest);
	}
}
