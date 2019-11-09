package algorithms.resolved.leetcode.discuss;

public class Trap {
	public int trap(int[] height) {
        int left = 0;
        int right = height.length -1;
        int left_max = 0;
        int right_max = 0;
        int ans = 0;
        
    while (left < right) {
        if (height[left] < height[right]) {
            if(height[left] >= left_max){
                left_max = height[left]; 
            }else{
                ans += (left_max - height[left]);
            }
            ++left;
        }
        else {
            if(height[right] >= right_max){
                right_max = height[right];
            }else{
                ans += (right_max - height[right]);

            }
            --right;
        }
    }
    return ans;
        

	}

	public static void main(String[] args) {
		int[] arr = new int [] {2,1,2,0,1};
		System.out.println(new Trap().trap(arr));
	}
}
