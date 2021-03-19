//package stacksandqueues;

public class stacksandqueues {
	public static void main(String[] args) {
        Stack s = new Stack();
        for (int i = 10; i < 16; i++) 
        {
            s.push(i);
        }
        System.out.println("show peek");
       
            System.out.println(s.peek());
        
        System.out.println("pop values from stack");
        for (int i = 0; i < 6; i++) {
            System.out.println(s.pop());
        }
        Queue q = new Queue();
        for (int i = 10; i <16; i++) {
            q.enqueue(i);
        }
        System.out.println("dequeue");
        for (int i = 0; i < 6; i++) {
            System.out.println(q.dequeue());
        }
    }
}
class Stack {
    private int top = -1;
    private int [] arr = new int [5];
    private int n = 5;
    void push(int data) {
        if (top < arr.length-1)
            arr[++top] = data;
        else {
            int[] arr1 = new int[2 * n];
            n = 2*n;
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = new int [n];
            System.arraycopy(arr1, 0, arr, 0, arr1.length);
            push(data);
        }
    }
    int pop() {
        if (isNotEmpty()) return arr[top--];
        else return -1;
    }
    int peek() {
        if (isNotEmpty()) return arr[top];
        else return -1;
    }
    private boolean isNotEmpty() {
        return top != -1;
    }
}


class Queue {
    private int [] arr = new int[10];
    private int n = 5;
    private int front = -1;
    private int rear = -1;
    void enqueue (int data) {
        if (rear < arr.length-1) {
            if (isEmpty()) {
                front = 0;
            }
            arr[++rear] = data;
        }else {
            int[] arr1 = new int[2 * n];
            n = 2*n;
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = new int [2*arr.length];
            System.arraycopy(arr1, 0, arr, 0, arr1.length);
            enqueue(data);
        }
    }
    int dequeue () {
        if (!isEmpty()) {
            if (front == rear) {
                rear = -1;
            }
            return arr[front++];
        }else return -1;
    }
    private boolean isEmpty() {
        return front == -1;
    }
  
}


