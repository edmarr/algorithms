package algorithms.resolved.udemy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

	private Palindrome problem;

	@Before
	public void setUp() {
		problem = new Palindrome();
	}

	@Test
	public void Palindromes() {
		Assert.assertTrue(problem.isPalindrome("abba"));
		Assert.assertTrue(problem.isPalindrome("mom"));
		Assert.assertTrue(problem.isPalindrome("dad"));
		Assert.assertFalse(problem.isPalindrome("rush"));
		Assert.assertFalse(problem.isPalindrome("yes"));
	}

}
