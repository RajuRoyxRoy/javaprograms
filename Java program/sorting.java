
import java.util.*;

class sorting{

	public static int[] sortArrays(int[] arr)
	{
		int length = arr.length;
		for (int j = 0; j < length - 1; j++) {

			if (arr[j] > arr[j + 1]) {

				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;

				// updating the value of j = -1
				// so after getting updated for j++
				// in the loop it becomes 0 and
				// the loop begins from the start.
				j = -1;
			}
		}

		return arr;
	}

	// Declaring main method
	public static void main(String args[])
	{
		// Declaring an integer array of size 11.
		int arr[] = { 1, 2, 99, 9, 8,
					7, 6, 0, 5, 4, 3 };

		// Printing the original Array.
		System.out.println("Original array: "
						+ Arrays.toString(arr));

		// Sorting the array using a single loop
		arr = sortArrays(arr);

		// Printing the sorted array.
		System.out.println("Sorted array: "
						+ Arrays.toString(arr));
	}
}
