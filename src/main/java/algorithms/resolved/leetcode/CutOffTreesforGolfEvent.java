package algorithms.resolved.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * https://leetcode.com/problems/cut-off-trees-for-golf-event/submissions/
 *
 */
public class CutOffTreesforGolfEvent {

	public int cutOffTree(List<List<Integer>> forest) {

		if (forest.size() > 50 || forest.get(0).size() > 50) {
			return -1;
		}

		if (forest.get(0).get(0) < 1) {
			return -1;
		}

		Set<Integer> trees = getCuts(forest);

		Boolean isLeft = false;
		Boolean isRight = true;
		int x = 0;
		int y = 0;
		int cut = 0;

		while (!trees.isEmpty()) {
			if (isSecureRight(forest, x, y) && isRight) {
				cut++;
				y++;
				isLeft = false;
				 System.out.println(forest.get(x).get(y));
				trees.remove(forest.get(x).get(y));
			} else if (isSecureLeft(forest, x, y) && isLeft) {
				cut++;
				y--;
				isRight = false;
				 System.out.println(forest.get(x).get(y));
				trees.remove(forest.get(x).get(y));
			} else if (isSecureDown(forest, x, y)) {
				x++;
				cut++;
				isRight = true;
				isLeft = true;
				 System.out.println(forest.get(x).get(y));
				trees.remove(forest.get(x).get(y));
			} else {
				break;
			}
		}

		if (trees.size() > 1) {
			return -1;
		}

		return cut;
	}

	private boolean isSecureRight(List<List<Integer>> forest, int x, int y) {
		return y + 1 < forest.get(x).size() && !forest.get(x).get(y + 1).equals(0);
	}

	private boolean isSecureLeft(List<List<Integer>> forest, int x, int y) {
		return y - 1 >= 0 && !forest.get(x).get(y - 1).equals(0);
	}

	private boolean isSecureDown(List<List<Integer>> forest, int x, int y) {
		return x + 1 < forest.size() && !forest.get(x+1).get(y).equals(0);
	}

	private Set<Integer> getCuts(List<List<Integer>> forest) {
		Set<Integer> set = new HashSet<Integer>();
		for (List<Integer> list : forest) {
			for (Integer value : list) {
				if (!value.equals(0)) {
					set.add(value);
				}
			}
		}
		return set;
	}

}
