package algorithms.resolved.daily;

import org.junit.Before;
import org.junit.Test;

import algorithms.resolved.leetcode.ReverseString;

public class ReverseStringTest {

	private ReverseString problem;

	@Before
	public void SetUp() {
		problem = new ReverseString();
	}

	@Test
	public void solution2Test() {
		// String in[] = new String[] { "H", "e", "l", "l", "o" };
		// String in[] = new String[] { "H", "a", "n", "n", "a", "h" };
		String in[] = new String[] { "A", " ", "m", "a", "n", ",", " ", "a", " ", "p", "l", "a", "n", ",", " ", "a",
				" ", "c", "a", "n", "a", "l", ":", " ", "P", "a", "n", "a", "m", "a" };

		char arrIn[] = new char[in.length];
		for (int i = 0; i < in.length; i++) {
			arrIn[i] = in[i].charAt(0);
		}

		problem.reverseString(arrIn);
	}

}
