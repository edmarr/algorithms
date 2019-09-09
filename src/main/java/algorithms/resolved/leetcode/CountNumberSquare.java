package algorithms.resolved.leetcode;

public class CountNumberSquare {

	public int getSquareCount(int x, int y) {
		int maxSize = Math.min(x, y);
		int count = 0;
		for (int i = 1; i < maxSize; i++) {
			count += (y - i + 1) * (x - i + 1);
		}
		return count;

	}

}
