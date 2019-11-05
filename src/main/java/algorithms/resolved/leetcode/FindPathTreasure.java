package algorithms.resolved.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class FindPathTreasure {

	public int minSteps(char[][] grid) {
		int sizeX = grid.length;
		int sizeY = grid[0].length;

		int[][] dirs = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		boolean[][] visited = new boolean[sizeX][sizeY];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { 0, 0, 0 });
		while (!q.isEmpty()) {
			int[] loc = q.poll();
			int x = loc[0];
			int y = loc[1];
			if (grid[x][y] == 'X')
				return loc[2];

			for (int[] d : dirs) {
				int xx = x + d[0];
				int yy = y + d[1];

				if (xx < 0 || xx > sizeX - 1)
					continue;
				if (yy < 0 || yy > sizeY - 1)
					continue;
				if (grid[xx][yy] == 'D')
					continue;
				if (visited[xx][yy])
					continue;

				visited[xx][yy] = true;
				q.add(new int[] { xx, yy, loc[2] + 1 });
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		char[][] grid = { 
							{ 'O', 'O', 'D', 'O' }, 
							{ 'D', 'O', 'D', 'O' }, 
							{ 'O', 'O', 'O', 'O' },
							{ 'O', 'D', 'D', 'X' } 
						};

		System.out.println(new FindPathTreasure().minSteps(grid)); // 6

		char[][] grid1 = new char[][]{ 
										  { 'O', 'O', 'O', 'O' }, 
										  { 'D', 'O', 'D', 'O' }, 
										  { 'O', 'O', 'O', 'O' },
										  { 'X', 'D', 'D', 'O' } 
									  };
		int re1 = new FindPathTreasure().minSteps(grid1);
		System.out.println(re1); // 5

		char[][] grid2 = new char[][]{ 
									  	{ 'O', 'D', 'O', 'O', 'O' }, 
										{ 'O', 'O', 'O', 'D', 'X' } 
									};
		int re2 = new FindPathTreasure().minSteps(grid2);
		System.out.println(re2); // 7

	}

}
