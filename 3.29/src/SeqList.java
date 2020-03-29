

import java.util.Arrays;

public class SeqList {
    private int[] elem;
    private int usedSize;
    private static int DEFULT_SIZE = 10;
    public SeqList() {
        this.elem = new int[DEFULT_SIZE];
        this.usedSize = 0;
    }
    //扩容
    private void grow(){
        this.elem =Arrays.copyOf(this.elem,this.elem.length*2);
    }
    //打印顺序表
    public void display() {
        for(int i = 0; i < this.usedSize ; i++) {
            System.out.println(this.elem[i]);
        }
        System.out.println();
    }
    //判断顺序表是否已满
    private void isFull() {
        if(this.usedSize == this.elem.length){
            //此处进行扩容处理；
            grow();
            //或者可以直接不进行扩容：
            //throw new ArrayIndexOutOfBoundsException("该顺序表已满！");
        }
    }
    //判断是否为空
    private void isEmpty() {
        if(this.usedSize == 0) {
            throw new ArrayIndexOutOfBoundsException("该数组为空");
        }
    }
    //检查pos位置是否合法
    private void checkPos(int pos) {
        // 此判断条件只适合在 pos位置插入元素使用，因为pos可以等于usedSize,此时插入元素时相当于进行尾插
        //而检查某位置是谁时，pos就不能等于usedSize，条件应该为 if(pos <0 || pos>= this,usedSize);
        //这里个人为了体现方法的调用就不再改变条件。
        if(pos<0 || pos > this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("位置不正确！");
        }
    }
    //在pos位置新增元素
    public void add (int pos,int data) {
        //检查顺序表是否已满，满了则扩容
        isFull();
        //检查pos位置合法性
        checkPos(pos);
        for(int i = this.usedSize -1 ; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    //查看是否包含某个元素
    public boolean contains(int toFind){
        isEmpty();
        for(int i = 0 ;i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //查看某个元素对应的位置
    public int search(int toFind) {
        isEmpty();
        for(int i = 0 ;i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return-1;
    }
    //获取pos位置的元素
    public int getPos(int pos) {
        isEmpty();
        checkPos(pos);
        return this.elem[pos];
    }
    //删除第一次出现的元素
    public void remove (int key) {
        int index = search(key);
        for(int i = index; i < this.usedSize-1; i++){
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }
    //获取长度
    public int size() {
        return this.usedSize;
    }
    //清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
}