package algorithms.resolved.udemy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListDuplicate {
	public Set<Integer> removeDuplicates(LinkedList<Integer> list) {
	
		Set<Integer> uniques = new HashSet<Integer>();
		
		for (Integer i : list) {
			if(!uniques.contains(i)) {
				uniques.add(i);
			}
		}
		return uniques;
	}
}
