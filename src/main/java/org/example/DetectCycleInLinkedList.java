package org.example;
// Problem: Determine if a linked list has a cycle in it.
// Example:
// Input: head = [3,2,0,-4], pos = 1 (tail connects to node index 1)
// Output: true

import java.util.HashSet;
import java.util.Set;

public class DetectCycleInLinkedList {

    // Implement the function below
    public boolean hasCycle(ListNode head) {
        // Your code here
        Set<ListNode> set = new HashSet<>();
        while(head!=null) {
            if (set.contains(head))
                return true;
            else
                set.add(head);

            head = head.next;

        }
        return false ; // Placeholder return to avoid compilation error
    }
}

