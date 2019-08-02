package algorithms.resolved.leetcode;

import org.junit.Before;
import org.junit.Test;

public class SumListNodeTest {

	private SumListNode problem;

	@Before
	public void setUp() {
		problem = new SumListNode();
	}

	@Test
	public void sum() {
		ListNode l1 = new ListNode(2);
		add(l1, new ListNode(4));
		add(l1, new ListNode(3));

		ListNode l2 = new ListNode(5);
		add(l2, new ListNode(6));
		add(l2, new ListNode(4));

		ListNode result = new ListNode(7);
		add(result, new ListNode(0));
		add(result, new ListNode(8));

		problem.addTwoNumbers(l1, l2);
	}

	private void add(ListNode head, ListNode node) {
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = node;
		
	}

}
