

// 盛最多水的容器.
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int res = 0;
        while(i < j) {
            int tmp = 0;
            if(height[i] < height[j]) {
                tmp = height[i] * (j-i);
                i++;
            }else{
                tmp = height[j] * (j-i);
                j--;
            }
            res = Math.max(res,tmp);
        }
        return res;
    }
}

//删除链表的倒数第N个节点
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        if(n < 0) {
            return null;
        }
        while(n-1 > 0) {
            n--;
            if(fast != null) {
                fast = fast.next;
            }else{
                return null;
            }
        }
        if(fast.next == null) {
            head=head.next;
            return head;
        }
        ListNode prev = null;
        while(fast.next != null) {
            prev = slow;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = slow.next;
        return head;
    }
}