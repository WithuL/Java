public class MyQueue2 {
    private int[] arr = new int[100];
    private int size = 0;
    private int head = 0;
    //tail指向的是队尾元素的下一个
    private int tail = 0;
    //数组满了就不能插入了
    public boolean offer(int x) {
        if(size == arr.length) {
            return false;
        }
        arr[tail] = x;
        tail++;
        if(tail >= arr.length) {
            tail = 0;
        }
        size++;
        return true;
    }

    public Integer pool( ) {
        if(size == 0) {
            return null;
        }
        Integer ret = arr[head];
        head++;
        if(head >= arr.length) {
            head = 0;
        }
        size--;
        return ret;
    }

    public Integer peek() {
        if(size == 0) {
            return null;
        }
        return arr[head];
    }

    public static void main(String[] args) {
        MyQueue2 myQueue2 = new MyQueue2();
        myQueue2.offer(1);
        myQueue2.offer(2);
        myQueue2.offer(3);
        myQueue2.offer(4);
        while(true) {
            Integer ret = myQueue2.pool();
            if(ret == null) {
                break;
            }
            System.out.println(ret);
        }
    }

}
