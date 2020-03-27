

public class TestDemo {

}


//链表的回文结构

public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        // write code here
        if (A == null || A.next == null) {
            return false;
        }
        ListNode B = reverseList(A);
        while(A != null) {
            if(A.val != B.val) {
                return false;
            }else{
                A = A.next;
                B = B.next;
            }
        }
        return true;

    }
    public ListNode reverseList( ListNode A) {
        ListNode B = new ListNode(A.val);
        A = A.next;
        while(A != null) {
            ListNode C = new ListNode(A.val);
            C.next = B;
            B = C;
            A = A.next;
        }
        return B;
    }
}


//环形链表
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != slow) {
            if(fast == null || fast.next == null) {
                return false;
            }else{
                fast=fast.next.next;
                slow = slow.next;
            }
        }
        return true;
    }
}2