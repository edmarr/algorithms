package algorithms.resolved.leetcode.discuss;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    // Hashtable back up the Double LinkedList for O(1) access to cache items
    private class DoubleLinkedNode {
        int key;
        int value;
        DoubleLinkedNode prev;
        DoubleLinkedNode next;
    }

    Map<Integer, DoubleLinkedNode> hashTable = new HashMap<>();
    DoubleLinkedNode head;
    DoubleLinkedNode tail;

    int totalItemsInCache;
    int maxCapacity;

    public LRUCache(int maxCapacity) {
        // Cache capacity is set by client
        this.maxCapacity = maxCapacity;
        totalItemsInCache = 0;

        // Head and tail nodes to avoid empty states
        head = new DoubleLinkedNode();
        tail = new DoubleLinkedNode();

        // Wire the head and tail together
        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        DoubleLinkedNode node = hashTable.get(key);
        if (node == null)
            return -1;

        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DoubleLinkedNode node = hashTable.get(key);
        if (node == null) {
            node = new DoubleLinkedNode();
            node.key = key;
            node.value = value;

            // Add to hashTable the actual item is in the cache
            hashTable.put(key, node);
            addFront(node);
            totalItemsInCache++;

            if (totalItemsInCache > maxCapacity)
                removeLRUEntry();

        } else {
            node.value = value;
            moveToHead(node);
        }

    }

    private void moveToHead(DoubleLinkedNode node) {
        removeFromList(node);
        addFront(node);
    }

    private void removeFromList(DoubleLinkedNode node) {
        DoubleLinkedNode savePrev = node.prev;
        DoubleLinkedNode saveNext = node.next;

        savePrev.next = saveNext;
        saveNext.prev = savePrev;
    }

    private DoubleLinkedNode popTail() {
        DoubleLinkedNode node = tail.prev;
        removeFromList(node);
        return node;
    }

    private void addFront(DoubleLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        /*
         * Re-wire the node after the head. Our node is still sitting
         * "in the middle of nowhere". We got the new node pointing to the right things,
         * but we need to fix up the original head & head's next. head <-> head.next <->
         * head.next.next <-> head.next.next.next <-> ... ^ ^ |- new node -| That's
         * where we are before these next 2 lines.
         */

         head.next.prev = node;
         head.next = node;

    }

    private void removeLRUEntry() {
        DoubleLinkedNode tail = popTail();
        hashTable.remove(tail.key);
        totalItemsInCache--;
    }
}