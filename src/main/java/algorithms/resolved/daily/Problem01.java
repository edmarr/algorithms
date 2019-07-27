package algorithms.resolved.daily;

import java.util.Arrays;

/**
 * 
 * Given a list of numbers and a number k, return whether any two numbers from
 * the list add up to k.
 * 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
 * 17.
 * 
 *
 */

public class Problem01 {

	public int[] solution1(int k, int[] arr) {
		int[] check = Arrays.copyOf(arr, arr.length);
		int result[] = new int[2];
		int i = 0;
		int j = 1;

		while (i < check.length) {
			if (check[i] + check[j] == k) {
				result[0] = check[i];
				result[1] = check[j];
				break;
			} else {
				if (j < check.length - 1) {
					j++;
				} else {
					j = 0;
					i++;
				}
			}

		}
		return result;

	}
}
