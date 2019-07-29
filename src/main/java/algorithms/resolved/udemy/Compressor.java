package algorithms.resolved.udemy;

/**
 * Challenge: Give a string with repeating characters (i.e. "aaabb") write an
 * algorithm that will compress the string down to the character, followed by
 * the number of times it appears in the string (i.e "a3b2"). If the compressed
 * string is not smaller than original, return original.
 *
 */
public class Compressor {

	public String compress(String str) {
		StringBuilder sb = new StringBuilder();

		int count = 0;
		for (int i = 0; i < str.length() ; i++) {
			count++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				sb.append(str.charAt(i)).append(count);
				count = 0;
			}

		}

		return sb.length() < str.length() ? sb.toString() : str;
	}

}
