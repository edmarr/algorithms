package algorithms.resolved.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MostCommonWorldTest {
	private MostCommonWorld problem;

	@Before
	public void setUp() {
		problem = new MostCommonWorld();
	}

	@Test
	public void compressTest() {
		Assert.assertEquals("b", problem.mostCommonWord("a, a, a, a, b,b,b,c, c", new String[] { "a" }));
		Assert.assertEquals("ball", problem.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] { "hit" }));
		
	}

}
