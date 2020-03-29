class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    Node head;
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null ) {
            this.head = node;
            return;
        }
        while(cur != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //在任意位置插入，第一个数据节点位置下标为0
    public void addIndex(int index,int data) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("位置不合法");
        }
        if(index == 0 ) {
            addFirst(data);
        }
        if(index == size()) {
            addLast(data);
        }
        Node cur = findIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }
    //查找是否包含关键字key是否包含在单链表中
    public boolean contains(int key) {
        if(size()==0) {
            throw  new RuntimeException("数组为空！");
        }
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的字节
    public void remove(int key) {
        Node prev = findPrev(key);
        if(prev != null) {
            prev.next = prev.next.next;
        }else {
            System.out.println("没有这个节点");
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
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
            head = head.next;
        }
    }
    //逆序链表
    public void reverse() {
        Node left = null;
        Node mid = this.head;
        if(this.head == null ||this.head.next == null) {
            return;
        }
        while(mid != null) {
            Node right = mid.next;
            mid.next = left;
            left = mid;
            mid = right;
        }
    }
    private  Node findPrev(int key){
        Node prev = this.head;
        if(this.head.data == key) {
            return this.head;
        }
        while(prev.next != null){
            if(prev.next.data == key ) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    //找到前驱
    private  Node findIndex(int index) {
        Node cur = this.head;
        while(index-1 > 0) {
            index--;
            cur = cur.next;
        }
        return cur;
    }

    //计算长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur != null){
            cur = cur.next;
            count++;
        }
        return count;
    }
}
