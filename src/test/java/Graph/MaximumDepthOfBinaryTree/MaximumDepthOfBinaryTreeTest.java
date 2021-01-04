package Graph.MaximumDepthOfBinaryTree;

import Graph.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *              3
 *            /   \
 *           1     4
 *          / \
 *         5   8
 *        /
 *       7
 */
public class MaximumDepthOfBinaryTreeTest {
    @Test
    public void test1() throws Exception {
        //given
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);
        //when
        int depth = MaximumDepthOfBinaryTree.maxDepth(tree);

        //then
        assertEquals(4, depth);
    }

}