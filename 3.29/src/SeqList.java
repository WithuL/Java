public class SeqList {
    private  int[] elem ;
    private  int usedSize;
    private static final int DEFAULT_SIZE = 10;

    public SeqList(){
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }
    // 打印顺序表
    public void display() {
        for(int i = 0; i < usedSize; i++) {
            System.out.print(elem[i]);
        }
        System.out.println();
    }

    private boolean isFull() {
        if(this.usedSize == DEFAULT_SIZE){
            return true;
        }else {
            return false;
        }
    }

    private void check (int pos) {
        if(pos <0 ||pos > usedSize){
            throw new ArrayIndexOutOfBoundsException("位置不合法！");
        }
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(isFull()) {
            System.out.println("顺序表已空");
            return;
        }
        check(pos);
        for(int i = usedSize; i > pos;i--) {
            elem[i] = elem[i-1];
        }
        elem[pos] = data;
        this.usedSize ++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i = 0; i<this.usedSize ; i++) {
            if(elem [i] == toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i = 0; i < this.usedSize; i++) {
            if(elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    private boolean isEmpty() {
        if(this.usedSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (isEmpty()) {
            throw new  RuntimeException("顺序表为空！");
        }
        check(pos);

        return this.elem[pos];
        }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        check(pos);
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没有这个关键字");
            return ;
        }
        for(int i = index; i < this.usedSize; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }
    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }


}
