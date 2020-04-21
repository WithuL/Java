class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class MyQueue {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void offer(int x) {
        Node node = new Node(x);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public int pop() {
        if(size == 0) {
            throw new RuntimeException("队列为空");
        }
        size--;
        Node node = head;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return node.val;

    }

    public int peek() {
        if(size == 0) {
            throw new RuntimeException("队列为空！");
        }
        return head.val;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }
}
