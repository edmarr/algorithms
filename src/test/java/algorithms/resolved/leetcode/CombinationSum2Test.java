package algorithms.resolved.leetcode;

import org.junit.Before;
import org.junit.Test;

public class CombinationSum2Test {
	private CombinationSum2 problem;

	@Before
	public void setUp() {
		problem = new CombinationSum2();
	}

	@Test
	public void test() {

		problem.combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8);

	}

}
