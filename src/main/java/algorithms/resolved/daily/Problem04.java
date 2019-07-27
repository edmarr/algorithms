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
public class Problem04 {

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
}
