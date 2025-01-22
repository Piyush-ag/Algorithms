package org.practise;
// Problem: Reverse a singly linked list.
// Example:
// Input: 1->2->3->4->5->NULL
// Output: 5->4->3->2->1->NULL

public class ReverseLinkedList {
    
    // Implement the function below
    public ListNode reverseList(ListNode head) {
        // Your code here
        ListNode current = head;
        ListNode prev = null;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev; // Placeholder return to avoid compilation error
    }
}
