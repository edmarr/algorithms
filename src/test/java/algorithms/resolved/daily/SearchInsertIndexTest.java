package algorithms.resolved.daily;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithms.resolved.leetcode.SearchInsertIndex;

public class SearchInsertIndexTest {
	SearchInsertIndex problem;

	@Before
	public void setUp() {
		problem = new SearchInsertIndex();
	}

	@Test
	public void search() {
		Assert.assertEquals(2, problem.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
		Assert.assertEquals(1, problem.searchInsert(new int[] { 1, 3, 5, 6 }, 2));

	}

}
