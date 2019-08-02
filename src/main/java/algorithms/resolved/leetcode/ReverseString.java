package algorithms.resolved.leetcode;

public class ReverseString {
	public void reverseString(char[] s) {
		int changed = s.length - 1;
		for (int i = 0; i < s.length; i++) {

			if (changed < i) {
				break;
			}
			char temp = s[changed];
			s[changed] = s[i];
			s[i] = temp;
			changed--;
		}
	}

}
