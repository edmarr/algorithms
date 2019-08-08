package algorithms.resolved.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CutOffTreesforGolfEventTest {
	private CutOffTreesforGolfEvent problem;

	@Before
	public void setUp() {
		problem = new CutOffTreesforGolfEvent();
	}

	@Test
	public void cutOffTest() {
		List<List<Integer>> forest = new ArrayList<>();
		forest.add(Arrays.asList(1, 2, 3));
		forest.add(Arrays.asList(0, 0, 4));
		forest.add(Arrays.asList(7, 6, 5));

		assertEquals(6, problem.cutOffTree(forest));
		

		forest = new ArrayList<>();
		forest.add(Arrays.asList(1, 2, 3));
		forest.add(Arrays.asList(0, 0, 0));
		forest.add(Arrays.asList(7, 6, 5));
		assertEquals(-1, problem.cutOffTree(forest));
		
		forest = new ArrayList<>();
		forest.add(Arrays.asList(0,0,6014));
		assertEquals(-1, problem.cutOffTree(forest));

		forest = new ArrayList<>();
		forest.add(Arrays.asList(54581641,64080174,24346381,69107959));
		forest.add(Arrays.asList(86374198,61363882,68783324,79706116));
		forest.add(Arrays.asList(668150,92178815,89819108,94701471));
		forest.add(Arrays.asList(83920491,22724204,46281641,47531096));
		forest.add(Arrays.asList(89078499,18904913,25462145,60813308));
		assertEquals(57, problem.cutOffTree(forest));
		

	}

}
