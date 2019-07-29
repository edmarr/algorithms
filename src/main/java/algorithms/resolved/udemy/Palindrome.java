package algorithms.resolved.udemy;

/**
 * Challenge: Detect if a given string is a palindrome. // A palindrome is a
 * word that can be spelt the same way forwards and backwards.
 * 
 */
public class Palindrome {

	public boolean isPalindrome(String str) {

		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt((str.length() -1) - i)) {
				return false;
			}
		}

		return true;
	}

}
