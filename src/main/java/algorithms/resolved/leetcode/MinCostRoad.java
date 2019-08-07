package algorithms.resolved.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinCostRoad {
	Map<Integer, Integer> cities = new HashMap<>();

	public Integer getMinCostToConstruct(int numCities, int totalAvailableCities, int[][] roadsAvailable,
			int roadsToBeRepaired, int[][] costRoadsToBeRepaired) {
		int cost = 0;
		if (numCities < 1) {
			return cost;
		}

		while (numCities > 0) {
			cities.put(numCities, numCities);
			numCities--;
		}

		for (int[] city : roadsAvailable) {
			System.out.println(city[0] + " x > y " + city[1]);
			union(city[0], city[1]);
		}

		Queue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});

		for (int[] city : costRoadsToBeRepaired) {
			queue.add(city);
		}

		while (!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = getParent(poll[0]);
			int y = getParent(poll[1]);
			int value = poll[2];

			if (x != y) {
				union(y, x);
				cost = cost + value;
			}

		}

		return cost;
	}

	private void union(int i, int j) {
		int x = getParent(i);
		int y = getParent(j);

		if (x != y) {
			cities.put(y, x);
		}

	}

	private int getParent(int i) {
		if (cities.get(i) != i) {
			cities.put(i, getParent(cities.get(i)));
		}
		return cities.get(i);
	}

}
