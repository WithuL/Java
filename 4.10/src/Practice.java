public class Practice6 {
}

//重拍链表
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return ;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast!=null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow =slow.next;
        }
        ListNode ret = slow;
        prev.next = null;
        ret = reverse(ret);
        prev = head;
        while(prev != null && ret != null) {
            ListNode tmp = ret.next;
            ret.next = prev.next;
            prev.next = ret;
            prev = ret.next;
            ret = tmp;
        }
    }
    public ListNode reverse(ListNode slow) {
        if(slow.next == null) {
            return slow;
        }
        ListNode last = reverse(slow.next);
        slow.next.next = slow;
        slow.next = null;
        return last;
    }
}