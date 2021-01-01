package LinkedList.ReverseLinkedList;

import LinkedList.ListNode;

/**
 * 역순으로 만들어 주는문제
 *  1. 순서를 기다릴 대기공간 Next (Temp용)
 *  2. 결과를 반환할 결과용 공간 Prev
 *  3. 첫번째 노드를 제외한 뒷노드들을 Next(Tmep)에 담음
 *     첫노드의 다음노드에 Prev로 채워넣음
 *     그리고 다시 첫노드를 Prev에 담음 (최초 첫노드 - null 형태가 됨)
 *     Next(Temp)에 있는 노드를 다시 기준노드에 붙임
 *
 *     즉 앞에 있는 노드를 순서대로 뒤에 붙이는 형태라고 보면 됨.
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode result = reverseList(l1);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode reverseList(ListNode current) {
        ListNode prev = null;
        ListNode next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
