
//实现队列可以用链表，也可以用顺序表
//先用链表方式实现，更简单一点
//链表尾部作为队尾，链表首部作为队首
//为了方便操作，多用一个引用指向链表尾部
public class MyQueue {
    public Node head = new Node(1);
    public Node tail = head;

    public int size = 0; // 队列中的元素个数

    //入队列 尾插
    public void offer(int x) {
        Node node = new Node(x);
        tail.next = node;
        tail = node;
    }

    public Integer poll() {
        if(head.next == null) {
            //队列为空
            return null;
        }
        Node ret = head.next;
        head.next = head.next.next;
        if(head.next == null) {
            tail = head;
        }
        return ret.val;
    }

    public Integer peek() {
        if(head.next == null) {
            return null;
        }
        return head.next.val;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        while(true) {
            Integer ret = myQueue.poll();
            if(ret == null) {
                break;
            }
            System.out.println(ret);
        }
    }
}
