package algorithms.resolved.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClosePointOriginTest {
	private ClosePointOrigin problem;

	@Before
	public void setUp() {
		problem = new ClosePointOrigin();
	}

	@Test
	public void compressTest() {
		int[][] arr = new int[][] { { 1, 3 }, { -2, 2 } };
		Assert.assertArrayEquals(new int[][] { { -2, 2 } }, problem.kClosest(arr, 1));

	}

}
