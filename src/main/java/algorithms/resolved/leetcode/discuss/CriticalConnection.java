package algorithms.resolved.leetcode.discuss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalConnection {

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int[] seen = new int[n];
        int[] low = new int[n];
        Arrays.fill(seen, -1);
        List<Integer>[] graph = new ArrayList[n];
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < connections.size(); i++) {
            // p -> q
            int p = connections.get(i).get(0);
            int q = connections.get(i).get(1);
            graph[p].add(q);
            graph[q].add(p);
        }

        for (int i = 0; i < n; i++) {
            if (seen[i] == -1)
                dfs(i, low, seen, graph, res, 0);
        }

        return res;
    }

    int time = 1;

    private void dfs(int i, int[] low, int[] seen, List<Integer>[] graph, List<List<Integer>> res, int node) {
        seen[i] = low[i] = time++;
        for (int j = 0; j < graph[i].size(); j++) {
            int parent = graph[i].get(j);
            if (parent == node)
                continue;

            if (seen[parent] == -1) {
                dfs(parent, low, seen, graph, res, i);
                low[i] = Math.min(low[i], low[parent]);
                if (low[parent] > seen[i])
                    res.add(Arrays.asList(i, parent));

            } else {
                low[i] = Math.min(low[i], seen[parent]);
            }
        }
    }

}
