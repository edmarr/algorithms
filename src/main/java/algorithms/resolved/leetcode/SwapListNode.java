package algorithms.resolved.leetcode;

public class SwapListNode {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode pre = node;
        for(int i = 0 ; i < m-1; i++) pre = pre.next ;
        
        ListNode start = pre.next;
        ListNode then = start.next;
        
        for(int i=0 ; i < n-m ; i++){
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        
       
        return node.next;
        
    }
}
