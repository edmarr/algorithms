package algorithms.resolved.leetcode;

/**
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 *
 * 
 * 
 */
public class SearchInsertIndex {
	public int searchInsert(int[] nums, int target) {

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				break;
			}

			if (nums[i] > target) {
				break;
			}
			index++;
		}

		return index;
	}
}
