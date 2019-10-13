package algorithms.resolved.leetcode.discuss;

import java.util.Arrays;

public class TwoSumLess {
	public int twoSum(int[] A, int K) {
		int value = -1;
        int index = 0;
        Arrays.sort(A);
        while (index < A.length){
            for(int i = 0; i < A.length; i++ ){
                 if(i != index){
                    int temp = A[index] + A[i];
                    if(value < temp && temp < K){
                        value = temp;
                    }                    
                }
            }
                 
            index++;
        }
        return value;

	}

	public static void main(String[] args) {
		int[] arr = new int [] {34,23,1,24,75,33,54,8};
		int target = 60;

		System.out.println(new TwoSumLess().twoSum(arr, target));


	}
}
