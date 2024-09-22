
import static org.junit.Assert.assertEquals;
import org.example.ListNode;
import org.example.ReverseLinkedList;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {

    private String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append("->");
            head = head.next;
        }
        return sb.append("NULL").toString();
    }

    @Test
    public void testReverseList() {
        ReverseLinkedList solution = new ReverseLinkedList();
        
        // Test case 1: Regular list
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        assertEquals("5->4->3->2->1->NULL", listToString(solution.reverseList(head1)));

        // Test case 2: Single element list
        ListNode head2 = new ListNode(1);
        assertEquals("1->NULL", listToString(solution.reverseList(head2)));

        // Test case 3: Empty list
        assertEquals("NULL", listToString(solution.reverseList(null)));
    }
}
