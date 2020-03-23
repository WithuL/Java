class MyArrayList {
    private int[] elem;//null
    private int usedSize;//0

    //设置默认容量
    private static final int DEFAULT_SIZE = 3;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }

    public boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(this.usedSize == 0) {
            return true;
        }
        return false;
    }

    //打印顺序表
    public void display() {
        for(int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]);
        }
        System.out.println();
    }
    //判断pos位置的合法性
    public boolean pos(int pos) {
        if((pos < 0) || (pos > this.usedSize)) {
            return true;
        }
        return false;
    }

    //在pos位置新增元素
    public void add(int pos, int data) {
        if(isFull()){
            System.out.println("数组已满！");
            return;
        }
        if(pos(pos)){
            System.out.println("此位置不合法！");
            return;
        }
        for(int i = this.usedSize -1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    //判定是否包含某个元素
    public boolean contains (int toFind) {
        if(isEmpty()){
            return false;
        }
        for(int i = 0; i < this.usedSize; i++) {
            if( this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        if(isEmpty()){
            return -1;
        }
        for(int i = 0; i < this.usedSize; i++) {
            if( this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos) {
        if(isEmpty()){
            return -1;
        }
        if(pos(pos)){
            return -1;
        }
        return this.elem[pos];
    }

    //给pos位置的元素设定为 value;
    public void setPos(int pos, int value ){
        if(isEmpty()) {
            System.out.println("此数组为空");
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字Key
    public void remove (int toRemove) {
        if(isEmpty()) {
            System.out.println("次数组为空");
            return;
        }
        int i = 0;
        while((this.elem[i] != toRemove ) && (i <= this.usedSize)) {
            i++;
        }
        if (i >= this.usedSize) {
            System.out.println("无此数值");
            return;
        }
        for(; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        usedSize--;
    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    public void clear(){
        this.usedSize = 0;
    }
}


public class TestDemo {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.display();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.display();
        System.out.println(myArrayList.contains(3));
        System.out.println(myArrayList.search(3));
        System.out.println(myArrayList.getPos(2));
        myArrayList.setPos(2,4);
        myArrayList.display();
        myArrayList.remove(1);
        myArrayList.display();
        System.out.println(myArrayList.size());
    }
}


    //单链表长度
    public int size(Node a){
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return size;
    }

    //查找值
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null){
            if(cur.date == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }