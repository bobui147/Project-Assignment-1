package stackqueue;

public class Problem2 {
    private int[] arr;
    private int frontIndex;
    private int backIndex;
    private int count;
    private static final int DEFAULT_CAPACITY = 10;
    
    public Problem2() {
        arr = new int[DEFAULT_CAPACITY];
        frontIndex = 0;
        backIndex = -1;
        count = 0;
    }
    
    public Problem2(int capacity) {
        arr = new int[capacity];
        frontIndex = 0;
        backIndex = -1;
        count = 0;
    }
    
    public int size() {
        return count;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[frontIndex];
    }
    
    public int back() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[backIndex];
    }
    
    public void push(int element) {
        if (count == arr.length) {
            resize();
        }
        backIndex = (backIndex + 1) % arr.length;
        arr[backIndex] = element;
        count++;
    }
    
    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        frontIndex = (frontIndex + 1) % arr.length;
        count--;
    }
    
    private void resize() {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < count; i++) {
            newArr[i] = arr[(frontIndex + i) % arr.length];
        }
        arr = newArr;
        frontIndex = 0;
        backIndex = count - 1;
    }
    
    public static void main(String[] args) {
        Problem2 queue = new Problem2();
        
        queue.push(10);
        queue.push(20);
        queue.push(30);
        
        System.out.println("Size: " + queue.size());
        System.out.println("Front: " + queue.front());
        System.out.println("Back: " + queue.back());
        
        queue.pop();
        System.out.println("After pop, front: " + queue.front());
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());
    }
}
