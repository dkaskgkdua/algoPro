package chapter1.MergeKSortedLists;

import chapter1.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeKSortedListsTest {

    @Test
    public void mergeLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] list = new ListNode[3];
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;
        ListNode result = MergeKSortedLists.mergeLists(list);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
}