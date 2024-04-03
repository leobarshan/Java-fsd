package assignment4;

import java.util.Scanner;

public class question4 {
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
			int s_index = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[s_index])
					s_index = j;
			}
			
			int temp = arr[s_index];
			
			arr[s_index] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("Sorted array by Selection Sort: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		sc.close();
	}
}

