package algorithms.resolved.level;

import java.util.ArrayList;
import java.util.List;

public class FizBuzzFizz {

	public List<Integer>   getValues( int x , int y , int z , int n) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1 ; i <= n ; i++) {
			if( (i % x == 0   && i%y == 0 ) && (i != z) ) {
				list.add(i);
			}else if (i % x == 0   && (i != z) ) {
				list.add(i);
			}else if (y % x == 0   && (y != z) ) {
				list.add(i);
			}
			
		}
		
		return list;
	}
	
}
