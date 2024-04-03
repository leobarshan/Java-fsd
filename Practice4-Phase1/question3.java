package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given array: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(" ");
		System.out.println("Sorted array: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		System.out.println(" ");
        System.out.println("Enter the element to search for: ");
        int key = sc.nextInt();

        int index = exponentialSearch(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not present in array!");
        }
        sc.close();
    }

    public static int exponentialSearch(int arr[], int key) {
        int n = arr.length;
        if (arr[0] == key)
            return 0;

        int i = 1;
        while (i < n && arr[i] <= key)
            i *= 2;

        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), key);
    }
}

