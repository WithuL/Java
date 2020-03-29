//链表类型
class Node{
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}
//单链表
public class MyList {
    public Node head;

    public MyList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if( this.head == null ) {
            this.head = node;
            return ;
        }
        node.next = this.head;
        this.head = node;
    };

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if( cur == null ) {
            this.head = node;
            return ;
        }
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    };

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        Node cur = this.head;
        if( index == 0 ) {
            addFirst(data);
            return true;
        }
        if( index == size()) {
            addLast(data);
            return true;
        }
        if((index < 0) || (index > size())){
            System.out.println("此位置不合法");
            return false;
        }
        for(int i = 0; i < index -1; i++) {
            cur = cur.next;
        }
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
        return true;
    };
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key){
                return true;
            }else {
                cur = cur.next;
            }
        }
        return false;
    };
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        Node cur = this.head;
        Node prev = this.head;
        if(this.head.data == key){
            this.head = this.head.next;
        }
        while(cur != null ) {
            if(cur.data == key) {
                prev.next = cur.next;
                return ;
            }
            prev = cur;
            cur = cur.next;
        }
        System.out.println("没有这个节点");
    };
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = prev.next;
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = prev.next;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    };
    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //打印函数
    public void display() {
        Node cur = this.head;
        while(cur != null ) {
            System.out.print(cur.data +" ");
            cur = cur.next;
        }
        System.out.println();
    };
    //清除所有节点
    public void clear() {
        this.head = null;
        /*

        Node cur = this.head;
        while(head != null ) {
            head = head.next;
            cur.next = null ;
            cur = head;
        }

        */
    };

    //合并有序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);

        ListNode p = head;

        while(l1 != null && l2 != null) {

            if( l1.val <= l2.val) {

                p.next = l1;

                l1 = l1.next;

            }else {

                p.next = l2;

                l2 = l2.next;

            }

            p = p.next;

        }

        p.next = l1 == null ? l2 : l1;

        return head.next;

    }
    //链表倒数第K个节点
    public ListNode FindKthToTail(ListNode head,int k) {
        if( k<=0 || head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(k-1 > 0) {
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else{
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //反转一个链表
    public ListNode reverseList(ListNode head) {
        ListNode left = null;
        ListNode mid = head;
        while(mid != null) {
            ListNode right = mid.next;
            mid.next = left;
            left = mid;
            mid = right;
        }
        return left;
    }

    //删除链表中所有给定值val的节点
    if(head == null) {
        return null;
    }
    ListNode cur = head.next;
    ListNode pre = head;
        while(cur != null) {
        if(cur.val == val) {
            pre.next = cur.next;
            cur = cur.next;
        }else {
            pre = pre.next;
            cur = cur.next;
        }
    }
        if(head.val == val) {
        head = head.next;
    }
        return head;

}
