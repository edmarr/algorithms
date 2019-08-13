package algorithms.resolved.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/cut-off-trees-for-golf-event/submissions/
 *
 */
public class CutOffTreesforGolfEvent {

	private static int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	public int cutOffTree(List<List<Integer>> forest) {
		int minSteps = 0;
		List<int[]> treeHeights = getAllTreeHights(forest);
		Collections.sort(treeHeights, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});

		int x = 0;
		int y = 0;
		while (!treeHeights.isEmpty()) {
			int[] curr = treeHeights.remove(0);
			int steps = getMinSteps(forest, x, y, curr[0], curr[1]);
			if (steps == -1) {
				return -1;
			}
			minSteps += steps;
			x = curr[0];
			y = curr[1];
			forest.get(x).set(y, 1);
		}

		return minSteps;
	}

	private int getMinSteps(List<List<Integer>> forest, int x, int y, int valueX, int valueY) {
		int steps = 0;
		int rows = forest.size();
		int cols = forest.get(0).size();
		boolean visited[][] = new boolean[rows][cols];
		visited[x][y] = true;
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] { x, y });

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int tree[] = queue.poll();

				if (tree[0] == valueX && tree[1] == valueY) {
					return steps;
				}
				for (int[] direction : directions) {
					int nx = tree[0] + direction[0];
					int ny = tree[1] + direction[1];

					if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && !visited[nx][ny]
							&& forest.get(nx).get(ny) != 0) {
						queue.add(new int[] { nx, ny });
						visited[nx][ny] = true;
					}

				}

			}

			steps++;
		}

		return -1;
	}

	private List<int[]> getAllTreeHights(List<List<Integer>> forest) {
		List<int[]> list = new LinkedList<int[]>();
		for (int i = 0; i < forest.size(); i++) {
			for (int j = 0; j < forest.get(i).size(); j++) {
				int temp = forest.get(i).get(j);
				if (temp > 1) {
					int[] tree = new int[] { i, j, temp };
					list.add(tree);
				}
			}
		}
		return list;
	}
}
