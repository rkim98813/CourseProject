package lesson.day5;

class Queue {
    int[] queue;
    int front;
    int rear;
    int maxQueueSize;

    public Queue(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
        this.queue = new int[maxQueueSize];
        this.front = 0;
        this.rear = -1;
    }

    public boolean isFull() {
        return rear >= maxQueueSize - 1;
    }

    public boolean isEmpty() {
        return front == rear + 1;
    }

    public void addQ(int item) {
        if (!isFull()) {
            queue[++rear] = item;
        } else {
            System.out.println("Queue is full. Cannot add item.");
        }
    }

    public int deleteQ() {
        if (!isEmpty()) {
            int item = queue[front++];
            return item;
        } else {
            System.out.println("Queue is empty. Cannot delete item.");
            return -1; // You can choose a different return value to indicate an error.
        }
    }
}

public class QueuesDemo {
    public static void main(String[] args) {
        int maxQueueSize = 5;
        Queue myQueue = new Queue(maxQueueSize);

        myQueue.addQ(10);
        myQueue.addQ(20);
        myQueue.addQ(30);

        while (!myQueue.isEmpty()) {
            int item = myQueue.deleteQ();
            System.out.println("Removed item: " + item);
        }

        myQueue.addQ(40);
        myQueue.addQ(50);

        while (!myQueue.isEmpty()) {
            int item = myQueue.deleteQ();
            System.out.println("Removed item: " + item);
        }
    }
}
