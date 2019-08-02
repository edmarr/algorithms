package algorithms.resolved.leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class SumListNode {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode root = new ListNode(0);
		ListNode head = root;

		for (int sum = 0; l1 != null || l2 != null || sum != 0; sum /= 10, root = root.next) {
			if (l1 != null) {
				sum = sum + l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum = sum + l2.val;
				l2 = l2.next;
			}
			root.next = new ListNode(sum % 10);
		}

		return head.next;

	}
}
