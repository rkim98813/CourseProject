package lesson.day5;

class ListNode {
    int data;
    ListNode link;

    public ListNode(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            // If the list is empty, make the new node the head.
            head = newNode;
        } else {
            // Traverse the list to find the insertion point.
            ListNode current = head;
            while (current.link != null) {
                current = current.link;
            }

            // Insert the new node at the end.
            current.link = newNode;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.link;
        }
        System.out.println("null");
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.insert(50);
        myList.insert(30);
        myList.insert(70);

        System.out.println("Linked List:");
        myList.display();
    }
}
