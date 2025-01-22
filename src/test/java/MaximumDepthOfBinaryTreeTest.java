
import static org.junit.Assert.assertEquals;
import org.practise.MaximumDepthOfBinaryTree;
import org.practise.TreeNode;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTreeTest {


    @Test
    public void testMaxDepth() {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

        // Test case 1
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        assertEquals(3, solution.maxDepth(root1));

        // Test case 2: Single node
        TreeNode root2 = new TreeNode(1);
        assertEquals(1, solution.maxDepth(root2));
    }
}
