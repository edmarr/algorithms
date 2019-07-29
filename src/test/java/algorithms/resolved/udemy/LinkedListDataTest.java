package algorithms.resolved.udemy;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListDataTest {
	private LinkedListDuplicate problem;

	@Before
	public void setUp() {
		problem = new LinkedListDuplicate();
	}

	@Test
	public void compressTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		
		Assert.assertEquals(4 , problem.removeDuplicates(list).size());
		
	}

}
