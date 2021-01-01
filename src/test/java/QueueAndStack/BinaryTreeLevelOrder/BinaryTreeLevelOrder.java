package QueueAndStack.BinaryTreeLevelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 이진 트리 문제
 * Queue를 이용해서 푸는 BFS의 기초적인 문제임
 *
 * 루트부터 탐색해서 각 레벨 별로 queue에 담은 후 List에 넣음
 * 즉. 레벨 1 탐색 -> 큐 넣고 -> list 넣고
 *     레벨 2 탐색 -> 큐 넣고 -> list 넣고
 *     레벨 3 .... 반복임
 */
public class BinaryTreeLevelOrder {
    public static List<List<Integer>> solve(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // 2
        while(!queue.isEmpty()) {
            int size = queue.size();
            // 그릇
            List<Integer> list = new LinkedList<>();

            // root 노드부터 순차적으로 탐색
            for(int i = 0; i < size; i++) {
                // 큐에서 뽑아내고
                TreeNode node = queue.poll();
                // 반환할 값에 넣고
                list.add(node.val);

                // 좌, 우 탐색해서 큐에 넣음 -> 그리고 그 큐는 상단에서 다시 탐색색
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        this.val = x;
    }
}