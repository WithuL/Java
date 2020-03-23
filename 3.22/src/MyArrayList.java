public class MyArrayList {
    public int[] elem;//null
    public int usedSize;//0

    //设置默认容量
    public static final int DEFAULT_SIZE = 10;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }

    public boolean contains(int toFind){
        if(isEmpty()) {
            return false;
        }
        for(int i = 0; i < this.usedSize; i++) {
            if( toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }

    public int search(int toFind) {
        if(isEmpty()) {
            return -1;
        }
        for(int i = 0; i < this.usedSize; i++) {
            if( toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }

    public int getPos(int pos){
        if(isEmpty()) {
            return 0;
        }
        if((pos < 0) || (pos > usedSize)){
            return 0;
        }
        return this.elem[pos-1];
    }

    public void remove(int key) {
        int index = search(key);
        if(index == -1){
            return;
        }
        for(int i = index; i < this.usedSize-1; i++){
            this.elem[i] = this.elem[i+1];
        }
    }

    public boolean isEmpty() {
        if(this.usedSize == 0) {
            return true;
        }else {
            return false;
        }
    }

    public void add(int val,int pos){
        if(isFull()){
            System.out.println("这个数组是满的");
            return;
        }
        for(int i = usedSize-1;i >= pos;i--) {
            this.elem[i] = elem[i-1];
        }
        this.elem[pos-1] = val;
        this.usedSize++;
    }

    public boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
