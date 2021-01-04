package Graph.MaximumDepthOfBinaryTree;

import Graph.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        return Math.max(leftMax, rightMax)+1;
    }
}
