package lesson.day4.StackProgram;

public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean emptyStack() {
        return top == -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (!emptyStack()) {
            int value = stackArray[top];
            top--;
            return value;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a default value or throw an exception as needed.
        }
    }

    public void printStack() {
        if (emptyStack()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();

        int poppedValue = stack.pop();
        if (poppedValue != -1) {
            System.out.println("Popped value: " + poppedValue);
        }

        stack.printStack();
    }
}
