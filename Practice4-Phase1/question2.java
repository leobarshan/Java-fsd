package assignment4;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
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
		
		int start = 0, 
			end = n-1;
		
		boolean flag = false;
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(arr[mid]==key) {
				System.out.println("Element found at index " +mid);
				flag = true;
				break;
			}
			else if(arr[mid]<key) {
				start = mid+1;
			}
			else
				end = mid-1;
		}
		
		if(flag==false) {
			System.out.println("Element not found in array!");
		}
		sc.close();
	}

}
