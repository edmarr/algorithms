package algorithms.resolved.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

	public List<Integer> partitionLabels(String S) {
		List<Integer> list = new ArrayList<Integer>();

		int[] checks = new int[128];
		char[] chars = S.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			checks[chars[i]] = i;
		}

		int count = 0;
		int check = 0;

		for (int index = 0; index < chars.length; index++) {
			int last = checks[chars[index]];
			if (index <= check) {
				count++;
				if (last > check) {
					check = last;
				}
			}else {
				list.add(count);
				count = 1;
				check = last;
			}
		}

		list.add(count);
		return list;
	}

}
