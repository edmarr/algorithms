package algorithms.resolved.leetcode;

public class FirstBadVersion {
	
	
	public boolean isBadVersion( int i) {
		//Mock to exclude compile error at workspace. 
		return true;
	}
	
    public int firstBadVersion(int n) {
        
        int left = 1;
        int right = n;
        
        while(left < right){
            int value = left + (right -left)/2;
            if(isBadVersion(value)){
                right = value;
            }else{
                left = value +1;
            }
        }
        return left;
    }

}
