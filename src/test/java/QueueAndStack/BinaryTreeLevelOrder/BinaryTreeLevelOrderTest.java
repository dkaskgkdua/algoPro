package QueueAndStack.BinaryTreeLevelOrder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeLevelOrderTest {
    /**      이진트리
     *          3
     *        /   \
     *       4     5
     *     /   \
     *    6     7
     */
    @Test
    public void sovle() {
        // given
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(7);

        // when
        List<List<Integer>> solve = BinaryTreeLevelOrder.solve(root);

        //then
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> level1 = new LinkedList<>();
        List<Integer> level2 = new LinkedList<>();
        List<Integer> level3 = new LinkedList<>();
        level1.add(3);
        level2.add(4);
        level2.add(5);
        level3.add(6);
        level3.add(7);
        result.add(level1);
        result.add(level2);
        result.add(level3);

        Assert.assertEquals(result, solve);
    }
}