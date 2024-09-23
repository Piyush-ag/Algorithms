package org.example;
// Problem: Merge `k` sorted linked lists and return it as one sorted list.
// Example:
// Input: lists = [[1,4,5],[1,3,4],[2,6]]
// Output: [1,1,2,3,4,4,5,6]

import java.util.*;

public class MergeKSortedLists {

    // Implement the function below
    public ListNode mergeKLists(ListNode[] lists) {
        // Your code here
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val-b.val);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i]!= null)
                queue.add(lists[i]);
        }
        while(queue.size()>0) {
            ListNode node = queue.poll();
            dummy.next= node;
            dummy=dummy.next;
            if (node.next!=null) {
                queue.add(node.next);
            }
        }
        return head.next; // Placeholder return to avoid compilation error
    }
}
