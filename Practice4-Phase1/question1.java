package assignment4;

import java.util.Scanner;

public class question1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search for: ");
		int key = sc.nextInt();
		
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Element present at index " +i);
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
		sc.close();
	}
}