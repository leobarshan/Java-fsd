package assignment3;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of L (0 <= L <= n-1): ");
        int L = scanner.nextInt();
        System.out.print("Enter the value of R (L <= R <= n-1): ");
        int R = scanner.nextInt();

        int sum = findSumInRange(arr, L, R);
        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);

        scanner.close();
    }

    public static int findSumInRange(int[] arr, int L, int R) {
        if (L < 0 || R >= arr.length || L > R) {
            System.out.println("Invalid range.");
            return -1; 
        }

        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
