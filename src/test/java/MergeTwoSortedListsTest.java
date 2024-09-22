
import static org.junit.Assert.assertEquals;
import org.example.ListNode;
import org.example.MergeTwoSortedLists;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

    private String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append("->");
            head = head.next;
        }
        return sb.append("NULL").toString();
    }

    @Test
    public void testMergeTwoLists() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        // Test case 1
        ListNode l1_1 = new ListNode(1);
        l1_1.next = new ListNode(2);
        l1_1.next.next = new ListNode(4);

        ListNode l1_2 = new ListNode(1);
        l1_2.next = new ListNode(3);
        l1_2.next.next = new ListNode(4);

        assertEquals("1->1->2->3->4->4->NULL", listToString(solution.mergeTwoLists(l1_1, l1_2)));

        // Test case 2: One list empty
        ListNode l2_1 = null;
        ListNode l2_2 = new ListNode(0);

        assertEquals("0->NULL", listToString(solution.mergeTwoLists(l2_1, l2_2)));
    }
}
