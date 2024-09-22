
import static org.junit.Assert.assertEquals;
import org.example.LowestCommonAncestorOfBinaryTree;
import org.example.TreeNode;
import org.junit.jupiter.api.Test;

public class LowestCommonAncestorOfBinaryTreeTest {
    @Test
    public void testLowestCommonAncestor() {
        LowestCommonAncestorOfBinaryTree solution = new LowestCommonAncestorOfBinaryTree();

        // Test case 1
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(8);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        assertEquals(root1, solution.lowestCommonAncestor(root1, root1.left, root1.right)); // LCA of 5 and 1

        // Test case 2: LCA of nodes on same subtree
        assertEquals(root1.left, solution.lowestCommonAncestor(root1, root1.left, root1.left.right.right)); // LCA of 5 and 4
    }
}
