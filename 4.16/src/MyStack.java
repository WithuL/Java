public class MyStack {
    //数组栈
    private Integer[] arr = new Integer[100];
    private Integer size = 0;

    public void push(int x) {
        arr[size++] = x;
    }

    public Integer pop() {
        if(size == 0) {
            return null;
        }
        return arr[--size];
    }

    public Integer peek() {
        return arr[size-1];
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }else {
            return false;
        }
    }

    public Integer size () {
        return size;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        while(myStack.size >0) {
            System.out.println(myStack.pop());
        }
    }
}

