package Graph.MaximumDepthOfBinaryTree;

import Graph.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeDFSTest {
    @Test
    public void test1() throws Exception {
        //given
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.left.left.left = new TreeNode(6);
        //when
        int depth = MaximumDepthOfBinaryTreeDFS.solve(tree);
        //then
        assertEquals(4, depth);
    }
}