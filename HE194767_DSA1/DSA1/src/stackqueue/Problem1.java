package stackqueue;

public class Problem1 {
    private int[] arr;
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 10;
    
    public Problem1() {
        arr = new int[DEFAULT_CAPACITY];
        topIndex = -1;
    }
    
    public Problem1(int capacity) {
        arr = new int[capacity];
        topIndex = -1;
    }
    
    public int size() {
        return topIndex + 1;
    }
    
    public boolean isEmpty() {
        return topIndex == -1;
    }
    
    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[topIndex];
    }
    
    public void push(int element) {
        if (topIndex == arr.length - 1) {
            resize();
        }
        arr[++topIndex] = element;
    }
    
    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        topIndex--;
    }
    
    private void resize() {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i <= topIndex; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    
    public static void main(String[] args) {
        Problem1 stack = new Problem1();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Size: " + stack.size());
        System.out.println("Top: " + stack.top());
        
        stack.pop();
        System.out.println("After pop, top: " + stack.top());
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());
    }
}
