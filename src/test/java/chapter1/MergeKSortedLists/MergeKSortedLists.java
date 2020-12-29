package chapter1.MergeKSortedLists;


import chapter1.ListNode;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static ListNode mergeLists(ListNode[] lists) {
        // 오름차순 우선순위 큐
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode newHead = new ListNode(0);
        ListNode p = newHead;
        // 파라미터로 받음 List를 각각 큐에 넣음( 총 3개 들어옴)
        for(ListNode node : lists) {
            if(node != null) {
                queue.offer(node);
            }
        }

        // for
        while(!queue.isEmpty()) {
            // 큐에서 꺼내서 리턴하는 주소값에 담고
            ListNode node = queue.poll();
            p.next = node;
            p = p.next;
            // 다음걸 큐에 넣어서 다시 우선순위 돌림
            if(node.next != null) {
                queue.offer(node.next);
            }
        }

        return newHead.next;
    }


}
