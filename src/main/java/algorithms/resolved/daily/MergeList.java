package algorithms.resolved.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeList {
	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(10, 15, 30));
		list.add(Arrays.asList(12, 15, 20));
		list.add(Arrays.asList(117, 20, 32));
		
		new MergeList().merge(list).stream().forEach(System.out::print);;
		
	}
	
	public List<Integer> merge(List<List<Integer>> list){
			List<Integer> result = new ArrayList<Integer>();
			
			list.stream().forEach((l) -> {
				result.addAll(l);
			});
			
			
			Collections.sort(result);
			
			return result;
			
			
	}
	
}
