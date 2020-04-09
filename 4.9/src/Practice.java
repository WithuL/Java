
//两两交换链表中的节点

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//递归
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode left = head;
        ListNode right = head.next;
        left.next = swapPairs(right.next);
        right.next = left;
        return right;
    }
}
//常规做法
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(1);
        ListNode prev = newHead;
        prev.next = head;
        while(head != null && head.next != null) {
            ListNode left = head;
            ListNode right = head.next;

            prev.next = right;
            left.next = right.next;
            right.next =left;

            prev = left;
            head = left.next;
        }
        return newHead.next;
    }
}


//旋转链表
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k < 1 ) {
            return head;
        }
        ListNode cur = head;
        int n = 0;
        while(cur != null ) {
            cur = cur.next;
            n++;
        }
        k = k % n;
        if(k == 0) {
            return head;
        }
        cur = head;
        while(k > 0) {
            cur = cur.next;
            k--;
        }
        ListNode prev = head;
        while(cur.next != null) {
            cur = cur.next;
            prev = prev.next;
        }
        ListNode newHead = prev.next;
        cur.next = head;
        prev.next = null ;
        return newHead;
    }

}

//删除链表中的重复元素
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = new ListNode(0);
        ListNode p = node;
        ListNode cur = head;
        while(cur != null && cur.next != null) {
            if(cur.next.val == cur.val) {
                while(cur != null && cur.next != null && cur.next.val == cur.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                p.next = cur;
                p = p.next;
                cur = cur.next;
            }
        }
        p.next = cur;
        return node.next;
    }
}

//分隔元素
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode cur = head;
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode min = node1;
        ListNode max = node2;
        while(cur != null) {
            if(cur.val < x) {
                min.next = cur;
                min = min.next;
                cur = cur.next;
            }else {
                max.next = cur;
                max = max.next;
                cur = cur.next;
            }
        }
        max.next = null;
        min.next = node2.next;
        return node1.next;
    }
}