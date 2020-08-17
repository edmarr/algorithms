package algorithms.resolved.datastructure;

public class StackExample {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.printStack();
        System.out.println("Before popping out");
        stack.pop();
        System.out.println("After popping out");
        stack.printStack();

    }

}

class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.err.println("Error: Stack OverFlow");
            System.exit(1);
        }
        arr[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The Stack is empty!");
            System.exit(1);
        }
        int val = arr[top];
        arr[top--] = 0;
        return val;
    }

    public int peek() {
        return arr[top];
    }

    public int size() {
        return arr.length;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}