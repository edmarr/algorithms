package algorithms.resolved.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SearchRangeNumbersTarget {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]== target){
                if(list.size() > 1){
                    list.remove(list.size() -1);
                }
                list.add(i);
            }
        }
        
        if(list.size() == 1){
            list.add(list.get(0));
        }
        
        if(list.isEmpty()){
            list.add(-1);
            list.add(-1);
        }
        
        int arr[] = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++ ){
            arr[i] = list.get(i);
        }
        
        return arr;
        
    }
}
