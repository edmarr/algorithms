package algorithms.resolved.leetcode.discuss;

public class MergedTwoSorted {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = new ListNode(-1);
        head.next = l1;
        ListNode side = l2;
        ListNode current = head;
        while(current != null && side != null){
            if(current.next == null || current.next.val  > side.val){
                ListNode tmp = current.next;
                current.next = side;
                side = tmp;
            }
            current = current.next;
        }
        return head.next;
    }
    
}


class  ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
 }	
