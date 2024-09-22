package org.example;
// Problem: Merge two sorted linked lists and return it as a new sorted list.
// Example:
// Input: l1 = [1,2,4], l2 = [1,3,4]
// Output: [1,1,2,3,4,4]

public class MergeTwoSortedLists {
    
    // Implement the function below
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Your code here
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(l1 != null && l2 != null ) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;

            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        current.next = l1 == null ? l2: l1;
        return dummy.next; // Placeholder return to avoid compilation error
    }
}
