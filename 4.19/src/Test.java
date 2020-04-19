import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }

}
public class Test {

    static void preOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        preOrderTraversal(node);
    }
}
class MyStack {
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        A.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()) {
            return 0;
        }
        while(A.size() > 1) {
            B.add(A.poll());
        }
        Integer ret = A.poll();
        Queue<Integer> tmp = A;
        A = B;
        B = tmp;
        return ret;
    }

    /** Get the top element. */
    public int top() {
        if(empty()) {
            return 0;
        }
        while(A.size() > 1) {
            B.add(A.poll());
        }
        Integer ret = A.poll();
        B.add(ret);
        Queue<Integer> tmp = A;
        A = B;
        B = tmp;
        return ret;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(A.size() == 0) {
            return true;
        }else {
            return false;
        }
    }
}

class MyQueue {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while(B.size() > 0) {
            A.push(B.pop());
        }
        A.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(empty()) {
            return 0;
        }
        while(A.size() > 0) {
            B.push(A.pop());
        }
        return B.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(empty()){
            return 0;
        }
        while(! A.isEmpty()) {
            B.add(A.pop());
        }
        return B.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(A.size() == 0 && B.size() == 0) {
            return true;
        }else {
            return false;
        }
    }
}
class MinStack {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if(A.size() == 0) {
            B.push(x);
            A.push(x);
            return;
        }
        if(x < B.peek()) {
            B.push(x);
        }else{
            B.push(B.peek());
        }
        A.push(x);    }

    public void pop() {
        if(A.empty()) {
            return;
        }
        A.pop();
        B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int getMin() {
        return B.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */class MyCircularDeque {
    int[] myCircularDeque;
    int front = 0;
    int rear = 0;
    int size = 0;
    int length = 0;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        myCircularDeque = new int[k];
        length = k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull()) {
            return false;
        }
        front = (front-1 + length ) % length;
        myCircularDeque[front] = value;
        size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()) {
            return false;
        }
        myCircularDeque[rear] = value;
        rear = (rear+1) % length;
        size++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()) {
            return false;
        }
        front = (front + 1) % length;
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty()) {
            return false;
        }
        rear = (rear - 1 + length) % length;
        size--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return myCircularDeque[front];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return myCircularDeque[(rear - 1 + length) % length];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(size == length) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */class Solution {
    public boolean backspaceCompare(String S, String T) {
        if(newB(S).equals(newB(T))){
            return true;
        }
        return false;
    }
    public String newB(String T) {
        Stack<Character> stack = new Stack<>();
        char[] t = T.toCharArray();
        for(char x : t) {
            if(x != '#'){
                stack.push(x);
            }else if( !stack.empty() ) {
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}