package algorithms.resolved.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidStrParenthesis {
	public static void main(String[] args) {
	 System.out.print(	new ValidStrParenthesis().isValid("{[]}"));
	}
	
	 public boolean isValid(String s) {
		 System.out.println("value input: " + s);
		 
	        Map<Character , Character> map = new HashMap<>();
	        
	        map. put('{', '}');
	        map.  put('[', ']');
	        map. put('(', ')');
	        
	        Stack<Character> stack = new Stack<>();
	        for (char c : s.toCharArray()) {
	            if (map.containsKey(c)) {
	                stack.push(c);
	            }
	            else {
	                if (stack.isEmpty()) {
	                    return false;
	                }

	                char removed = stack.pop();
	                if (map.get(removed) != c) {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty();
	    }

}
