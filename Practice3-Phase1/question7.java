package assignment3;
import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void forwardTraversal() {
        Node current = head;
        System.out.println("Forward traversal:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void backwardTraversal() {
        Node current = tail;
        System.out.println("Backward traversal:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
public class question7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println("Enter elements to insert into the doubly linked list (enter -1 to stop):");
        int newData;
        while ((newData = scanner.nextInt()) != -1) 
        {
            dll.insertAtEnd(newData);
        }
        dll.forwardTraversal();
        dll.backwardTraversal();
        scanner.close();
    }
}





