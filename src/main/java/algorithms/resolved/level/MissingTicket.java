package algorithms.resolved.level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingTicket {

	public static void main(String[] args) {
		List<List<Integer>> first = new ArrayList<>();
		first.add(Arrays.asList(121, 2, 3));
		first.add(Arrays.asList(011, 0, 4));
		first.add(Arrays.asList(712, 6, 5));

		List<List<Integer>> second = new ArrayList<>();
		second.add(Arrays.asList(121, 2, 3));
		second.add(Arrays.asList(011, 0, 4));
		second.add(Arrays.asList(712, 6, 5));
		second.add(Arrays.asList(888, 6, 5));
		second.add(Arrays.asList(999, 6, 5));

		List<Integer> missing = new MissingTicket().missing(first, second);
		missing.stream().forEach(System.out::println);
	}

	public List<Integer> missing(List<List<Integer>> first, List<List<Integer>> second) {
		Set<Integer> set = new HashSet<>();
		for(List<Integer> list: second) {
			set.add(list.get(0));
		}
		
		for(List<Integer> list: first) {
			set.remove(list.get(0));
		}
		
		return set.stream().collect(Collectors.toList());

	}

}
