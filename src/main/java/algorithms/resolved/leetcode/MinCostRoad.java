package algorithms.resolved.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class MinCostRoad {
	public Integer getMinCostToConstruct(int numCities, int totalAvailableCities, int[][] roadsAvailable, int roadsToBeRepaired, int[][] costRoadsToBeRepaired) {
		int cost = 0;
		if (numCities < 1) {
			return cost;
		}

		int components = numCities;
		int[] parents = new int[components + 1];

		for (int i = 0; i < parents.length; i++) {
			parents[i] = i;
		}
		
		
		PriorityQueue<int []> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int [] a , int [] b) {
				return a[2] - b[2];
			}
			
		});
		
		Map<Integer , Set<Integer>> map = new HashMap<>();
		Set<Integer> set = null;
		
		
		for(int[] damaged : costRoadsToBeRepaired) {
			
		}
		
		

		return null;
	}

}
