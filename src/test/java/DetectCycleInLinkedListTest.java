
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.practise.DetectCycleInLinkedList;
import org.practise.ListNode;
import org.junit.jupiter.api.Test;

public class DetectCycleInLinkedListTest {
    @Test
    public void testHasCycle() {
        DetectCycleInLinkedList solution = new DetectCycleInLinkedList();

        // Test case 1: List with cycle
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = head1.next; // Creating a cycle
        assertTrue(solution.hasCycle(head1));

        // Test case 2: List without cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        assertFalse(solution.hasCycle(head2));

        // Test case 3: Single node without cycle
        ListNode head3 = new ListNode(1);
        assertFalse(solution.hasCycle(head3));
    }
}
