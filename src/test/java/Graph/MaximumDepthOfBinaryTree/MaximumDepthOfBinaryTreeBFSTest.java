package Graph.MaximumDepthOfBinaryTree;

import Graph.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeBFSTest {
    @Test
    public void test() throws Exception {
        //given
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);
        //when
        int depth = MaximumDepthOfBinaryTreeBFS.bfs(tree);
        //then
        assertEquals(4, depth);
    }

}