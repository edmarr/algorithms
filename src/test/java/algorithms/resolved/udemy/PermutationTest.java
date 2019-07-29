package algorithms.resolved.udemy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermutationTest {
	private Permutation problem;

	@Before
	public void setUp() {
		problem = new Permutation();
	}

	@Test
	public void permutationTest() {
        Assert.assertTrue(problem.isPermutation("abc", "cba"));
        Assert.assertFalse(problem.isPermutation("abc", "xyz"));
	}
	
	@Test
	public void permutationV2Test() {
        Assert.assertTrue(problem.isPermutationV2("abc", "cba"));
        Assert.assertFalse(problem.isPermutationV2("abc", "xyz"));
	}
	
}