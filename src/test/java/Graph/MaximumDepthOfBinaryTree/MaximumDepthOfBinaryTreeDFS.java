package Graph.MaximumDepthOfBinaryTree;

import Graph.TreeNode;

import java.util.Stack;

/**
 *              1
 *            /   \
 *           2     3
 *          / \
 *         4   5
 *        /
 *       6
 */
public class MaximumDepthOfBinaryTreeDFS {
    public static int solve(TreeNode root) {
        if(root == null) return 0;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        int count = 1;
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int check = 0;
            if(node.left !=null) {
                stack.push(node.left);
                check = 1;
            }
            if(node.right != null) {
                stack.push(node.right);
                check = 1;
            }
            count += check;
        }
        return count;
    }
}
