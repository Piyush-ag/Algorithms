package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.PriorityQueue;
import java.util.Comparator;

public class MergeKSortedListsTest {

    // Test method for the mergeKLists function
    @Test
    public void testMergeKLists() {
        MergeKSortedLists solution = new MergeKSortedLists();

        // Test Case 1: Regular test case with three sorted lists
        ListNode[] lists1 = new ListNode[3];
        lists1[0] = createList(new int[] {1, 4, 5});
        lists1[1] = createList(new int[] {1, 3, 4});
        lists1[2] = createList(new int[] {2, 6});
        ListNode result1 = solution.mergeKLists(lists1);
        assertEquals("1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6", listToString(result1));

        // Test Case 2: All input lists are empty
//        ListNode[] lists2 = new ListNode[3];
//        lists2[0] = createList(new int[] {});
//        lists2[1] = createList(new int[] {});
//        lists2[2] = createList(new int[] {});
//        ListNode result2 = solution.mergeKLists(lists2);
//        assertEquals("", listToString(result2));

        // Test Case 3: Only one list with elements
        ListNode[] lists3 = new ListNode[1];
        lists3[0] = createList(new int[] {1, 2, 3});
        ListNode result3 = solution.mergeKLists(lists3);
        assertEquals("1 -> 2 -> 3", listToString(result3));

        // Test Case 4: All lists are null
        ListNode[] lists4 = new ListNode[3];
        lists4[0] = null;
        lists4[1] = null;
        lists4[2] = null;
        ListNode result4 = solution.mergeKLists(lists4);
        assertEquals("", listToString(result4));

        // Test Case 5: Single empty list
        ListNode[] lists5 = new ListNode[1];
        lists5[0] = createList(new int[] {});
        ListNode result5 = solution.mergeKLists(lists5);
        assertEquals("", listToString(result5));
    }

    // Helper method to create a linked list from an array of values
    private ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to convert a linked list to a string representation for easy comparison
    private String listToString(ListNode head) {
        if (head == null) return "";
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) {
                sb.append(" -> ");
            }
            head = head.next;
        }
        return sb.toString();
    }

    // Method to be tested
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (ListNode list : lists) {
            if (list != null) minHeap.add(list);
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            current.next = node;
            current = current.next;
            if (node.next != null) {
                minHeap.add(node.next);
            }
        }
        return dummy.next;
    }
}