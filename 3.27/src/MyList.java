class Node {
    int data ;
    Node next;
    public Node (int data) {
        this.data = data;
    }
}

public class MyList {
    private Node head;
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null) {
            head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null) {
            this.head = node;
            return;
        }
        while(cur.next == null){
            cur = cur.next;
        }
        cur.next = node;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        Node node = new Node(data);
        Node cur = this.head;
        while(index-1 > 0) {
            cur = cur.next;
            index--;
        }
        node.next = cur.next;
        cur.next = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key);
    //删除第一次出现关键字为key的节点
    public void remove(int key);
    //删除所有值为key的节点
    public void removeAllKey(int key);
    //得到单链表的长度
    public int size();
    public void display();
    public void clear();

}
