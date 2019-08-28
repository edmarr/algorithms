package algorithms.resolved.leetcode;

public class HouseHobber {
	public static void main(String[] args) {
		new HouseHobber().rob(new int[] { 1, 2, 3, 1 });
		new HouseHobber().rob(new int[] { 2, 7, 9, 3, 1 });
		new HouseHobber().rob(new int[] { 1,2 });
		new HouseHobber().rob(new int[] { 3,1 });
		new HouseHobber().rob(new int[] { 1,3,1 });

	}

	   public int rob(int[] nums) {
	        
			if(nums == null | nums.length == 0 ) return 0;
			if(nums.length == 1) return nums[0];
			if(nums.length == 2) return Math.max(nums[0], nums[1]);
			
	       
	        int [] dp = new int[nums.length];
	        dp[0] = nums[0];
	        dp[1] = Math.max(nums[0] , nums[1]);
	        
	        
	        for(int i = 2 ; i < dp.length; i++){
	            dp[i]= Math.max(nums[i] + dp[i-2] , dp[i-1]);
	        }
	        
	        
	        return dp[nums.length -1];
	    }

}
