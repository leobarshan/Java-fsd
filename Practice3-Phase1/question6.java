package assignment3;
import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;
    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
public class question6 {
    private Node1 head;

    public question6() {
        this.head = null;
    }
    public void insert(int newData) {
        Node1 newNode = new Node1(newData);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node1 current = head;
        if (newData < head.data) {
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            head = newNode;
            return;
        }
        while (current.next != head && current.next.data < newData) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node1 current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        question6 list = new question6();
        System.out.println("Enter elements to insert into the sorted circular linked list (enter -1 to stop):");
        int newData;
        while ((newData = scanner.nextInt()) != -1) {
            list.insert(newData);
        }
        System.out.println("Sorted Circular Linked List:");
        list.display();
        scanner.close();
    }
}

