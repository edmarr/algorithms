package algorithms.resolved.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PartitionLabelsTest {
	PartitionLabels problem ;
	
	@Before
	public void setUp() {
		problem = new PartitionLabels();
	}
	
	@Test
	public void partitionTest() {
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(7);
		list.add(8);
		
		Assert.assertArrayEquals(list.toArray(), problem.partitionLabels("ababcbacadefegdehijhklij").toArray());
	}

}
