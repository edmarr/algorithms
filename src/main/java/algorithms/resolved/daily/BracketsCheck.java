package algorithms.resolved.daily;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BracketsCheck {
	public static void main(String[] args) {
		assertTrue(new BracketsCheck().check( "([])[]({})"));
		assertFalse(new BracketsCheck().check( "([])[[]({})"));
	}
	
	private boolean check(String s) {
		Map<Character, Character> map = new HashMap<>();
		map.put(')','(');
		map.put(']','[');
		map.put('}','{' );
		
		
		Queue<Character> q = new LinkedList<Character>();
		for(Character c : s.toCharArray()) {
			if(map.containsKey(c)) {
				q.remove(map.get(c));
			}else {
				q.add(c);
			}
			
		}
		return q.isEmpty();
	}
	

}
