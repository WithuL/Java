
//带头双向链表
class Node {
    int data;
    Node prev;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class DoubleLinkedList {

    private Node head;
    private Node last;
    //傀儡节点
    private Node pHead;

    public DoubleLinkedList() {
        this.pHead = new Node(0);
        this.pHead.next = this.head;
    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.pHead.next == null) {
            this.last = node;
            this.pHead.next = node;
        } else {
            this.pHead.next.prev = node;
            node.next = this.pHead.next;
            this.pHead.next = node;
        }
    }

    ;

    //尾插法

    public void addLast(int data) {
        Node node = new Node(data);
        if (this.pHead.next == null) {
            this.pHead.next = node;
            this.last = node;
        } else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    ;

    //检查位置合法性；
    private boolean checkIndex(int index) {
        if (index < 0 || index > size()) {
            return true;
        } else {
            return false;
        }
    }

    //找到index位置的节点
    private Node findIndex(int index) {
        Node cur = this.pHead.next;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index, int data) {
        if (checkIndex(index)) {
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == size()) {
            addLast(data);
            return true;
        }
        Node cur = findIndex(index);
        Node node = new Node(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
        node.prev.next = node;
        return true;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.pHead.next;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            } else {
                cur = cur.next;
            }
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        Node cur = this.pHead.next;
        if (contains(key) == false) {
            System.out.println("没有这个关键字！");
            return;
        }
        while (cur != null) {
            if (cur.data == key) {
                if (cur == this.pHead.next) {
                    this.pHead.next = this.pHead.next.next;
                    this.pHead.next.prev = null;
                } else if (cur == this.last) {
                    this.last = this.last.prev;
                    this.last.next = null;
                } else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return;
            }
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node cur = this.pHead.next;
        while (cur != null) {
            if (cur.data == key) {
                if (cur == this.pHead.next) {
                    this.pHead.next = this.pHead.next.next;
                    this.pHead.next.prev = null;
                } else if (cur == this.last) {
                    this.last = this.last.prev;
                    this.last.next = null;
                } else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }
            cur = cur.next;
        }
    }

    //得到单链表的长度
    public int size() {
        Node cur = this.pHead.next;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display() {
        Node cur = this.pHead.next;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear() {
        this.pHead = null;
        this.last = null;
    }


    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addLast(1);
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(4);
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(4);

        doubleLinkedList.display();

        doubleLinkedList.removeAllKey(4);
        doubleLinkedList.display();

    }
}