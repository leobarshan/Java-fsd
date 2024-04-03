package assignment4;

import java.util.Scanner;

public class question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number of elements in array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];	
		System.out.println("Enter array elements: ");		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			
			while(j>=0 && temp<=arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		System.out.println("Sorted array by Insertion Sort: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		sc.close();
	}
}
