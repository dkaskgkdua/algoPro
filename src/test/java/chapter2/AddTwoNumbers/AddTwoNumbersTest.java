package chapter2.AddTwoNumbers;

import chapter2.ListNode;
import org.junit.Test;

public class AddTwoNumbersTest {
    @Test
    public void test1() throws Exception {
        //given
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(2);
        //when
        ListNode solve = AddTwoNumbers.solve(l1, l2);
        //then
        while(solve != null) {
            System.out.println(solve.val);
            solve = solve.next;
        }


    }
}