package assignment3;
import java.util.Scanner;
import java.util.Stack;

public class question8 {

    private static Scanner scanner = new Scanner(System.in);
    private static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pushElement();
                    break;
                case 2:
                    popElement();
                    break;
                case 3:
                    peekElement();
                    break;
                case 4:
                    displayStack();
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
    private static void pushElement() {
        System.out.print("Enter the element to push: ");
        int element = scanner.nextInt();
        stack.push(element);
        System.out.println("Element " + element + " pushed to the stack.");
    }
    private static void popElement() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Element " + poppedElement + " popped from the stack.");
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }
    private static void peekElement() {
        if (!stack.isEmpty()) {
            System.out.println("Top element of the stack: " + stack.peek());
        } else {
            System.out.println("Stack is empty. No element to peek.");
        }
    }
    private static void displayStack() {
        System.out.println("Stack elements:");
        if (!stack.isEmpty()) {
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.println(stack.get(i));
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }
}
