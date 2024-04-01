package assignment3;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class question9 {

    private static Scanner scanner = new Scanner(System.in);
    private static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enqueueElement();
                    break;
                case 2:
                    dequeueElement();
                    break;
                case 3:
                    peekElement();
                    break;
                case 4:
                    displayQueue();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    private static void enqueueElement() {
        System.out.print("Enter the element to enqueue: ");
        int element = scanner.nextInt();
        queue.add(element);
        System.out.println("Element " + element + " enqueued.");
    }
    private static void dequeueElement() {
        if (!queue.isEmpty()) {
            int dequeuedElement = queue.poll();
            System.out.println("Element " + dequeuedElement + " dequeued.");
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }
    private static void peekElement() {
        if (!queue.isEmpty()) {
            System.out.println("Front element of the queue: " + queue.peek());
        } else {
            System.out.println("Queue is empty. No element to peek.");
        }
    }
    private static void displayQueue() {
        System.out.println("Queue elements:");
        if (!queue.isEmpty()) {
            for (Integer qElement : queue) {
                System.out.println(qElement);
            }
        } else {
            System.out.println("Queue is empty.");
        }
    }
}
