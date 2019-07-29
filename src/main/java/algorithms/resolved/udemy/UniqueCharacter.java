package algorithms.resolved.udemy;

import java.util.HashMap;
import java.util.Map;

/**
 * Challenge: Given a string, see if you can detect whether it contains only
 * unique chars
 *
 */
public class UniqueCharacter {

	public boolean isUnique(String string) {

		Map<Character, Integer> map = new HashMap<>();

		for (char s : string.toCharArray()) {
			if (map.get(s) == null) {
				map.put(s, 1);
			} else {
				return false;
			}
		}

		return true;
	}

}
