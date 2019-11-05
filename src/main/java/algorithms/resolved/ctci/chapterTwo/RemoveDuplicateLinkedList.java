package algorithms.resolved.ctci.chapterTwo;

import java.util.HashSet;
import java.util.Set;

// Write code to remove duplicates from an unsorted linked list
public class RemoveDuplicateLinkedList {
    public ListNode Rotation(ListNode n) {
        ListNode previous = n;
        Set<Integer> set = new HashSet<>();
        while(n != null){
            if(set.contains(n.val)){
                previous.next = n.next;
            }else{
                set.add(n.val);
                previous = n;
            }
            n = n.next;
                

        }

        return n;

    }


    private class ListNode {
        int val;
        ListNode next;
    }   


}