package assignment3;

import java.util.Scanner;

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        next = null;
    }
}
public class question5 {
    Node2 head;
    void append(int data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node2 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    void deleteNode(int key) {
        Node2 temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid key. Please enter elements from the list.");
            return;
        }
        prev.next = temp.next;
    }
    void printList() {
        Node2 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        question5 list = new question5();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        System.out.println("Linked List before deletion:");
        list.printList();
        System.out.print("Enter the key to delete: ");
        int keyToDelete = scanner.nextInt();
        list.deleteNode(keyToDelete);
        System.out.println("Linked List after deleting first occurrence of " + keyToDelete + ":");
        list.printList();   
        scanner.close();
    }
}
