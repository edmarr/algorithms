package algorithms.resolved.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindAllDuplicates {

	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 0);
			}
		}

		map.keySet().forEach(i -> {
			if (map.get(i) == 1)
				list.add(i);
		});

		return list;
	}

	public List<Integer> findDuplicatesII(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			if (set.contains(i)) {
				list.add(i);
			} else {
				set.add(i);
			}
		}
		return list;
	}

	public List<Integer> findDuplicatesIII(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int count[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			count[nums[i] - 1] += 1;
		}

		for (int i = 0; i < count.length; i++) {
			if(count[i] == 2) list.add(i);
		}

		return list;
	}

	public static void main(String[] args) {
		new FindAllDuplicates().findDuplicates(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
	}

}
