package algorithms.resolved.leetcode;

public class CheckCycleLinkedListII {
	public ListNode detectCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow) {
				ListNode check = head;
				while (slow != check) {
					slow = slow.next;
					check = check.next;
				}
				return slow;
			}
		}
		return null;
	}
}
