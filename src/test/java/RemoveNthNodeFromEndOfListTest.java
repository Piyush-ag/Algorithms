
import static org.junit.Assert.assertEquals;
import org.practise.ListNode;
import org.practise.RemoveNthNodeFromEndOfList;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndOfListTest {

    private String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append("->");
            head = head.next;
        }
        return sb.append("NULL").toString();
    }

    @Test
    public void testRemoveNthFromEnd() {
        RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();

        // Test case 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        assertEquals("1->2->3->5->NULL", listToString(solution.removeNthFromEnd(head1, 2)));

        // Test case 2: Remove head
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        assertEquals("2->NULL", listToString(solution.removeNthFromEnd(head2, 2)));
    }
}
