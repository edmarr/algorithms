package algorithms.resolved.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDesapearNumber {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();

		for (int i : nums) {
			set.add(i);
		}

		for (int i = 1; i <= nums.length; i++) {
			if (!set.contains(i))
				list.add(i);
		}

		return list;

	}

	public List<Integer> findDisappearedNumbersII(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			if (nums[val] > 0)
				nums[val] = -nums[val];
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				list.add(i + 1);
		}

		return list;
	}

	public static void main(String[] args) {
		new FindDesapearNumber().findDisappearedNumbersII(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
	}

}
