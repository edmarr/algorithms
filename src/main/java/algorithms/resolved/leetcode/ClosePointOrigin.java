package algorithms.resolved.leetcode;

import java.util.Arrays;

public class ClosePointOrigin {

	public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points , (x,y) -> (((x[0] * x[0]) + (x[1]  * x[1])  ) - ((y[0] * y[0])  + (y[1] * y[1]) ) ) );
    
        int [][] result = new int[K][2];
        for(int x = 0 ; x < K ; x++){
            for(int y = 0 ; y < points[x].length; y++){
                result[x][y] = points[x][y];                
            }
        }
        return result;
    }

}
