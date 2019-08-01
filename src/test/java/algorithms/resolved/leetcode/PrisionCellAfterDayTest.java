package algorithms.resolved.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrisionCellAfterDayTest {
	private PrisionCellAfterDay problem;

	@Before
	public void setUp() {
		problem = new PrisionCellAfterDay();
	}

	@Test
	public void prision7Test() {

		Assert.assertArrayEquals(new int[] { 0, 0, 1, 1, 0, 0, 0, 0 },
				problem.prisonAfterNDays(new int[] { 0, 1, 0, 1, 1, 0, 0, 1 }, 7));

	}

	@Test
	public void prision1000000000Test() {

		Assert.assertArrayEquals(new int[] { 0, 0, 1, 1, 1, 1, 1, 0 },
				problem.prisonAfterNDays(new int[] { 1, 0, 0, 1, 0, 0, 1, 0 }, 1000000000));

	}

}
