package algorithms.resolved.daily;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem02Test {

	private Problem02 problem;

	@Before
	public void SetUp() {
		problem = new Problem02();
	}

	@Test
	public void solution01Test() {
		int arrIn[] = { 1, 2, 3, 4, 5 };
		int arrOut[] = { 120, 60, 40, 30, 24 };
		Assert.assertArrayEquals(arrOut, problem.print01(arrIn));
	}

	@Test
	public void solution02Test() {
		int arrIn[] = { 3, 2, 1 };
		int arrOut[] = { 2, 3, 6 };
		Assert.assertArrayEquals(arrOut, problem.print01(arrIn));
	}

	@Test
	public void solutionRecursive01Test() {
		int arrIn[] = { 1, 2, 3, 4, 5 };
		int arrOut[] = { 120, 60, 40, 30, 24 };
		Assert.assertArrayEquals(arrOut, problem.callRecursive(arrIn));
	}

	@Test
	public void solutionRecursive02Test() {
		int arrIn[] = { 3, 2, 1 };
		int arrOut[] = { 2, 3, 6 };
		Assert.assertArrayEquals(arrOut, problem.callRecursive(arrIn));
	}

}
