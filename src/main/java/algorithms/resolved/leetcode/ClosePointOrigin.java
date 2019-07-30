package algorithms.resolved.leetcode;

import java.util.Arrays;

public class ClosePointOrigin {

	public int[][] kClosest(int[][] points, int K) {
		Arrays.sort(points, (n1, n2) -> (((n1[0] * n1[0]) + (n1[1] * n1[1])) - ((n2[0] * n2[0]) + (n2[1] * n2[1]))));

		int[][] result = new int[K][2];

		for (int i = 0; i < K; i++) {
			for (int j = 0; j < points[0].length; j++) {
				result[i][j] = points[i][j];
			}
		}

		return result;
	}

}
