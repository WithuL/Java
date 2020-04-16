class Node {
    public int val;
    public Node next ;

    public Node(int val) {
        this.val = val;
    }
}
//链表实现栈
public class MyStack2 {
    private Node head = new Node(-1);

    public void add(int x) {
        Node node = new Node(x);
        node.next = head.next;
        head.next = node;

    }

    public Integer pop() {
        if(head.next == null) {
            return null;
        }
        Integer val = head.next.val;
        head.next = head.next.next;
        return val;
    }

    public Integer peek() {
        return head.next.val;
    }
}
