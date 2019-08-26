package algorithms.resolved.leetcode;

public class FindDuplicateBST {

	public int findDuplicate(int[] nums) {
		int fast = nums[nums[0]];
		int slow = nums[0];
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[nums[fast]];
		}

		fast = 0;
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}

		return slow;

	}

}
