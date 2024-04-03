package assignment4;

import java.util.Scanner;

public class question5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number of elements in array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];	
		System.out.println("Enter array elements: ");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
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
		System.out.println("Sorted array by Bubble Sort in ascending order: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Sorted array by Bubble Sort in descending order: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		sc.close();
	}
 }
