package algorithms.resolved.daily;

import java.util.Arrays;

/**
 * Given an array of integers, find the first missing positive integer in linear
 * time and constant space. In other words, find the lowest positive integer
 * that does not exist in the array. The array can contain duplicates and
 * negative numbers as well.
 * 
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0]
 * should give 3.
 *
 * 
 * 
 */
public class MissingNumber {

	public int missingInteger(int[] arr) {
		int[] arrOrdered = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrOrdered);
		int missing = 0;
		for (int i = 0; i < arrOrdered.length; i++) {
			if (i >= 0) {
				if (i + 1 < arrOrdered.length) {
					if (arrOrdered[i] > 0 && (arrOrdered[i + 1] - arrOrdered[i]) > 1) {
						missing = arrOrdered[i] + 1;
						break;
					}
				} else {
					missing = arrOrdered[i] + 1;
				}
			}
		}
		return missing;
	}

	/**
	 * Array always need contain zero TODO let code. 
	 * @param arr
	 * @return
	 */
	public int missingIntegerFast(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		int n = arr.length + 1;
		return (n * (n - 1) / 2) - sum;
	}

}
