package algorithms.resolved.udemy;

import java.util.Arrays;

/**
 * Challenge: Given two strings, check if one is a permutation of the other
 *
 */
public class Permutation {

	public boolean isPermutation(String str, String perm) {
		if (str.length() != perm.length()) {
			return false;
		}

		for (int i = 0; i < str.length() -1; i++) {
			if (!(str.charAt(i) == perm.charAt((perm.length() -1) - i))) {
				return false;
			}
		}

		return true;
	}

	public boolean isPermutationV2(String str, String perm) {
		if (str.length() != perm.length()) {
			return false;
		}
		return sort(str).equals(sort(perm));
	}
	
	
	private String sort(String str) {
		char[] arrStr = str.toCharArray(); 
		Arrays.sort(arrStr);
		return new String(arrStr);
	}

}
