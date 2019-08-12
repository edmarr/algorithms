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

	private static int directions[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	public int cutOffTree(List<List<Integer>> forest) {

		if (forest.size() > 50 || forest.get(0).size() > 50) {
			return -1;
		}

		if (forest.get(0).get(0) < 1) {
			return -1;
		}

		List<int[]> allTrees = getAllTrees(forest);

		Collections.sort(allTrees, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o1[2];
			}
		});

		int minSteps = 0;
		int curX = 0;
		int curY = 0;
		while (!allTrees.isEmpty()) {
			int[] curTree = allTrees.remove(0);
			int steps = getMinSteps(forest, curX, curY, curTree[0], curTree[1]);
			if (steps == -1) {
				return -1;
			}

			minSteps += steps;
			curX = curTree[0];
			curY = curTree[1];

		}

		return minSteps;
	}

	private int getMinSteps(List<List<Integer>> forest, int curX, int curY, int valueX, int valueY) {
		int minSteps = 0;
		int rows = forest.size();
		int cols = forest.get(0).size();
		boolean[][] visited = new boolean[rows][cols];
		Queue<int[]> queue = new LinkedList<int[]>();

		queue.offer(new int[] { curX, curY });
		visited[curX][curY] = true;

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] cell = queue.poll();
				if(cell[0] == valueX && cell[1] == valueY) {
					return minSteps;
				}
				for(int [] direction : directions) {
					int nx = cell[0] + direction[0];
					int ny = cell[1] + direction[1];
					if(nx >= 0 && nx < rows && ny>0 && ny < cols && !visited[nx][ny] && forest.get(nx).get(ny) != 0) {
						queue.add(new int[] {nx , ny});
						visited[nx][ny] = true;
					}
					
				}
			}
			minSteps++;
		}

		return -1;
	}

	private List<int[]> getAllTrees(List<List<Integer>> forest) {
		List<int[]> list = new LinkedList<>();
		for (int i = 0; i < forest.size(); i++) {
			for (int j = 0; j < forest.get(i).size(); j++) {
				int value = forest.get(i).get(j);
				if (value > 1) {
					int element[] = new int[3];
					element[0] = i;
					element[1] = j;
					element[2] = value;
					list.add(element);
				}

			}
		}

		return list;

	}
}
