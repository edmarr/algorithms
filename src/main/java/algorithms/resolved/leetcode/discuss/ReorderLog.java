package algorithms.resolved.leetcode.discuss;

import java.util.Arrays;

public class ReorderLog {

	private String[] reorder(String[] logs) {
		Arrays.sort(logs, (s1,s2) -> {
			String[] split1 = s1.split(" ", 2);
			String[] split2 = s2.split(" ", 2);
			boolean  isDigit1 = Character.isDigit(split1[1].charAt(0));
			boolean  isDigit2 = Character.isDigit(split2[1].charAt(0));

			if(!isDigit1 && !isDigit2){
				int comp = split1[1].compareTo(split2[1]);
				if(comp == 0){
					return split1[0].compareTo(split2[0]);
				}else{
					return comp;
				}
				
			}else{
				return isDigit1 ? (isDigit2 ? 0:1) : -1;
			}

		});
		return logs;
	}

	public static void main(String[] args) {
		String[] arr = new String[] { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero" };
		for (String s : new ReorderLog().reorder(arr)) {
			System.out.println(s);
		}
	}

}
