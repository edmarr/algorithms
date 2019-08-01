package algorithms.resolved.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PrisionCellAfterDay {

	public int[] prisonAfterNDays(int[] cells, int N) {
		Map<String, int[]> seen = new LinkedHashMap<>();
		int day = 0;

		while (day < N) {
			int[] next = new int[cells.length];
			for (int i = 0; i < cells.length; i++) {
				if (i > 0 && i < cells.length - 1) {
					next[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
				} else {
					next[i] = 0;
				}
			}

			String key = Arrays.toString(next);
			if (seen.containsKey(key)) {
				break;
			} else {
				seen.put(key, next);
			}

			cells = next.clone();
			day++;

		}

		if (day < N) {
			List<String> arr = new ArrayList<>(seen.keySet());
			arr.add(0 , "-1");
			int index = N % day;
			cells = seen.get(arr.get(index == 0 ? arr.size() -1 : index));
		}

		return cells;
	}

}
