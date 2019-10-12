package algorithms.resolved.leetcode;

public class MaximumSubarray {
	public int max(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for(int i =1 ; i < nums.length ; i++){
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(max, sum);
        }

        return max;
	}

	public static void main(String[] args) {
		int[] arr = new int [] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new MaximumSubarray().max(arr));
	}
}
