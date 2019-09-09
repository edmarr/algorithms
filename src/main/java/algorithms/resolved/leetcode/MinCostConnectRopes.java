package algorithms.resolved.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinCostConnectRopes {
	public static int getMinCost(List<Integer> ropes) {

		Queue<Integer> pq = new PriorityQueue<>(ropes);
		int totalCost = 0;
		while (pq.size() > 1) {
			int cost = pq.poll() + pq.poll();
			pq.add(cost);
			totalCost += cost;
		}
		return totalCost;
	}

	public static void main(String[] args) {

		System.out.println(getMinCost(Arrays.asList(8, 4, 6, 12))); // 58
		System.out.println(getMinCost(Arrays.asList(20, 4, 8, 2))); // 54
		System.out.println(getMinCost(Arrays.asList(1, 2, 5, 10, 35, 89))); // 224
		System.out.println(getMinCost(Arrays.asList(2, 2, 3, 3))); // 20
	}

}
