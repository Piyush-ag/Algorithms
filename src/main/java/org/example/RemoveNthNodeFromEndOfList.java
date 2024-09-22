package org.example;
// Problem: Remove the nth node from the end of a linked list.
// Example:
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

public class RemoveNthNodeFromEndOfList {
    // Implement the function below
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i <=n ; i++) {
            first = first.next;
        }
        while(first != null) {
            first = first.next;
            second = second.next;
        }

        second.next= second.next.next;


        return dummy.next; // Placeholder return to avoid compilation error
    }
}
