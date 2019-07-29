package algorithms.resolved.udemy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompressorTest {
	private Compressor problem;

	@Before
	public void setUp() {
		problem = new Compressor();
	}

	@Test
	public void compressTest() {
		
		Assert.assertEquals("a3b2", problem.compress("aaabb"));
		Assert.assertEquals("aabb", problem.compress("aabb"));
		Assert.assertEquals("ab", problem.compress("ab"));
		Assert.assertEquals("abc", problem.compress("abc"));
		Assert.assertEquals("z3", problem.compress("zzz"));
		Assert.assertEquals("aabbaabb", problem.compress("aabbaabb")); // not shorter
	}

}
