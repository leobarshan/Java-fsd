package assignment3;

import java.util.Scanner;
import java.util.Arrays;

public class question2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);   
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++)
	        {
	            arr[i] = scanner.nextInt();
	        }	        
	        int fourthSmallest = findFourthSmallest(arr);        
	        System.out.println("Array: " + Arrays.toString(arr));
	        System.out.println("Fourth smallest element: " + fourthSmallest);        
	        scanner.close();
	    }
	    
	    public static int findFourthSmallest(int[] arr) {
	        if (arr.length < 4)
	        {
	            System.out.println("Array has less than 4 elements.");
	            return -1; 
	        }	        
	        Arrays.sort(arr);         
	        return arr[3];
	    }
	}

