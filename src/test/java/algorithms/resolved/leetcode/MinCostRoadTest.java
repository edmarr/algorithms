package algorithms.resolved.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinCostRoadTest {
	
	MinCostRoad problem;
	
	@Before
	public void setUp() {
		problem = new MinCostRoad();
	}
	
	@Test
	public void getMinTest() {
		int numTotalAvailableCities = 6;
		int numTotalAvailableRoads = 3;
		int[][] roadsAvailable = { { 1, 4 }, { 4, 5 }, { 2, 3 } };
		int numNewRoadConstruct = 4;
		int[][] costNewRoadsConstruct = { { 1, 2, 5 }, { 1, 3, 10 }, { 1, 6, 2 }, { 5, 6, 5 } };
		Assert.assertEquals(Integer.valueOf(7), problem.getMinCostToConstruct(numTotalAvailableCities, numTotalAvailableRoads, roadsAvailable,
				numNewRoadConstruct, costNewRoadsConstruct));
	}
	

}
