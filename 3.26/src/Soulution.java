public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Soulution{
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p = head;
        int i = 0;
        while(p!=null){
            ++i;
            p = p.next;
        }
        p = head;
        for(int j = 0; j < (i-k);j++){
            p = p.next;
        }
        return p;
    }
} {
}
