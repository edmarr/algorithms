package algorithms.resolved.daily;

/**
 * Given an array of integers, return a new array such that each element at
 * index i of the new array is the product of all the numbers in the original
 * array except the one at i.
 * 
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
 * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
 * be [2, 3, 6]
 *
 */
public class CalcProductArray {

	public int[] print01(int[] arrIn) {
		int[] arrOut = new int[arrIn.length];

		int index = 0;

		while (index < arrIn.length) {
			int product = 1;
			for (int i = 0; i < arrIn.length; i++) {
				if (i != index) {
					product = product * arrIn[i];
				}
			}
			arrOut[index] = product;
			index++;
		}
		return arrOut;

	}

	public int[] callRecursive(int[] arr) {
		int[] arrOut = new int[arr.length];
		recursive(0, 0, 1, arr, arrOut);
		return arrOut;
	}

	public void recursive(int currentIndex, int index, int product, int[] arr, int[] arrOut) {
		if (currentIndex != index) {
			product = product * arr[currentIndex];
		}
		if (currentIndex + 1 == arr.length) {
			arrOut[index] = product;

			if (currentIndex + 1 == arr.length && index + 1 == arr.length) {
				return;
			}
			currentIndex = 0;
			product = 1;
			index++;
		} else {
			currentIndex++;
		}
		recursive(currentIndex, index, product, arr, arrOut);
	}

}
