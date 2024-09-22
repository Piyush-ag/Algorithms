
import static org.junit.Assert.assertEquals;
import org.example.BinaryTreeInorderTraversal;
import org.example.TreeNode;
import org.junit.jupiter.api.Test;
import java.util.*;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void testInorderTraversal() {
        BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

        // Test case 1
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        List<Integer> expected1 = Arrays.asList(1, 3, 2);
        assertEquals(expected1, solution.inorderTraversal(root1));

        // Test case 2: Empty tree
        assertEquals(new ArrayList<>(), solution.inorderTraversal(null));
    }
}
