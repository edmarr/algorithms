package algorithms.resolved.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MinCostRoad {
	Map<Integer, Integer> cities = new HashMap<>();

	public Integer getMinCostToConstruct(int numCities, int totalAvailableCities, int[][] roadsAvailable,
			int roadsToBeRepaired, int[][] costRoadsToBeRepaired) {
		int cost = 0;
		if (numCities < 1) {
			return cost;
		}
		int visit = numCities;
		while (numCities > 0) {
			cities.put(numCities, numCities);
			numCities--;
		}

		for (int[] route : roadsAvailable) {
			System.out.println(route[0] + " x > y " + route[1]);
			union(route[0], route[1]);
			visit--;
		}

		PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[2] - b[2];
			}
		});

		for (int[] route : costRoadsToBeRepaired) {
			queue.add(route);
		}
		
		while(visit != 0 &&  queue.size() > 0) {
			int[] poll = queue.poll();
			int x = getParent(poll[0]);
			int y = getParent(poll[1]);
			int value = getParent(2);
			
			if(x != y) {
				union(x, y);
				cost = cost+ value;
			}
			visit--;
			
		}

		return cost;
	}

	private void union(int i, int j) {
		int x = getParent(i);
		int y = getParent(j);
		
		System.out.println( y +  " union " +  x );
		
		if (x != y) {
			cities.put(y,x);
		}
	}

	private Integer getParent(Integer i) {
        if(cities.get(i) != i){
            cities.put(i, getParent(cities.get(i)));
        }
        return cities.get(i);
        
	}

}
