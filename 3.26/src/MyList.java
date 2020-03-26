class Node {
    public int data;
    public Node next;
    public Node (int data ) {
        this.data = data;
    }
}

public class MyList {
    public Node head;

    public MyList() {

    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        Node cur = this.head;
        if(cur == null) {
            this.head = node;
            return;
        }
        while(cur.next != null ) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //任意一个位置插入
    public boolean addIndex(int index,int data) {
        Node cur = this.head;
        if(cur == null) {
            addFirst(data);
            return true;
        }
        if(cur.next == null) {
            addLast(data);
            return true;
        }
        if(index <0 || index > size()){
            System.out.println("该位置不合法");
            return false;
        }
        while(cur.next != null) {
            cur = cur.next;
        }
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    //删除第一次出现关键字为key的节点
    public void remove (int data ) {
        //假设头节点存在
        Node prev = this.head;
        Node cur = prev.next;
        if(prev.data ==  data) {
            prev.next = null;
            return;
        }
        while(cur != null) {
            if(cur.data == data) {
                prev.next = cur.next;
                return;
            }
            cur = cur.next;
            prev = prev.next;
        }
        System.out.println("无此节点");
    }

    //删除所有值为key的节点
    public void removeAll(int key) {
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null) {
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
    }

    //链表节点大小
    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur != null ) {
            count ++;
            cur = cur.next;
        }
        return count;
    }

    //打印函数
    public void display(){
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //清除节点
    public void clear() {
        this.head = null;
    }


    //倒数第K个节点
    public Node FindKthToTail(int k) {
        if(k <= 0 || k > size()) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        //1、让fast先走k-1步

        //2、让两个引用 一起走  直到 fast.next == null
        // slow 所指的位置就是倒数第K个节点
        for(int i = 0; i < k-1; ++i) {
            fast = fast.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        MyList mylist = new MyList();
        mylist.addFirst(4);
        mylist.addFirst(3);
        mylist.addFirst(2);
        mylist.addFirst(4);
        mylist.addLast(5);
        mylist.addLast(4);
        mylist.display();
        mylist.removeAll(4);
        mylist.display();
        mylist.clear();
        mylist.display();


    }

}
