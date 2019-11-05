package algorithms.resolved.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a paragraph and a list of banned words, return the most frequent word
 * that is not in the list of banned words. It is guaranteed there is at least
 * one word that isn't banned, and that the answer is unique.
 * 
 * Words in the list of banned words are given in lowercase, and free of
 * punctuation. Words in the paragraph are not case sensitive. The answer is in
 * lowercase.
 *
 */

public class MostCommonWorld {
	public String mostCommonWord(String paragraph, String[] banned) {
		String change = paragraph.replaceAll("[^a-zA-Z0-9\\s]", " ");

		Set<String> bans = new HashSet<String>();
		for (String s : banned) {
			bans.add(s.toLowerCase());
		}

		String[] split = change.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : split) {
			if (!s.trim().isEmpty()) {

				if (map.containsKey(s.toLowerCase()) && !bans.contains(s.toLowerCase())) {
					map.put(s.toLowerCase(), map.get(s.toLowerCase()) + 1);
				} else {
					map.put(s.toLowerCase(), 1);
				}
			}
		}

		String value = null;
		int count = 0;
		for (String s : map.keySet()) {
			if (map.get(s) > count) {
				value = s;
				count = map.get(s);
			}
		}

		return value;
	}


	public String mostCommonWordFast(String paragraph, String[] banned) {
		paragraph += ".";
		Set<String> bans = new HashSet<>();
        for(String s : banned){
            bans.add(s.toLowerCase());
        }
        
        Map<String, Integer> map = new HashMap<>();
        String common = null;
        int times = 0;
        StringBuilder word = new StringBuilder();
        for(char c: paragraph.toCharArray()){
            if(Character.isLetter(c)) word.append(Character.toLowerCase(c));
            else if(word.length() > 0){
                String append = word.toString();
                if(!bans.contains(append)){
                    map.put(append , map.getOrDefault(append, 0) + 1);    
                    if(map.get(append) > times){
                        common = append;
                        times = map.get(append);
                    }
                }
                word = new StringBuilder();
            }
            
        }
        
        return common;


	}

	public static void main(String[] args) {
		System.out.println(new MostCommonWorld().mostCommonWordFast("Bob" , new String[]{""}));
	}
}
