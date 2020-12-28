package chapter1.AddTwoNumbers;

/**
 * 1. LinkedList와 유사한 ListNode라는 객체를 생성한다.
 * 2. 각 객체는 val 변수와 ListNode 객체를 가진다.
 * 3. 참조변수라는 특성을 이용하여 문제해결을 함.
 */
public class AddTwoNumbers {
    public static ListNode solve(ListNode l1, ListNode l2) {
        // 1.
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3 = newHead;
        int carry = 0;

        // 2. 참조값 p1 또는 p2가 null이 아닐경우까지 실행
        while(p1 != null || p2 != null) {
            // carry 값 연산 후 p1,p2 에 다음 ListNode의 주소값을 참조시킴
            if(p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }
            if(p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }
            // p3의 다음 ListNode를 케리%10(나머지)값을 포함해서 생성
            p3.next = new ListNode(carry%10);
            // p3에 다음 ListNode 주소값을 참조시킴
            p3 = p3.next;
            // 케리값 나누기 10의 몫을 담음
            carry /= 10;

            // p1, p2, p3는 참조주소만 바뀔 뿐 본 newHead는 계속해서 데이터가 쌓임
        }
        // 마지막 케리가 1일 경우 노드 하나 더 생성
        if(carry == 1) {
            p3.next = new ListNode(1);
        }

        return newHead.next;
    }
}
