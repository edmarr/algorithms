package algorithms.resolved.udemy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniqueCharacterTest {
	private UniqueCharacter problem;

	@Before
	public void setUp() {
		problem = new UniqueCharacter();
	}

	@Test
	public void UniqueCharacters() {
		Assert.assertTrue(problem.isUnique("ab"));
		Assert.assertFalse(problem.isUnique("aa"));
		Assert.assertTrue(problem.isUnique("abcdefghijklmnopqrstuvxyz"));
		Assert.assertFalse(problem.isUnique("abcdefghijklmnopqrstuvxyzd"));

	}
}