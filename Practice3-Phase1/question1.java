package assignment3;
import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int steps = 5;
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        rightRotate(arr, steps);
        
        System.out.println("Array after right rotation by " + steps + " steps: " + Arrays.toString(arr));
    }
    
    public static void rightRotate(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length; 
        
        reverse(arr, 0, length - 1);
        reverse(arr, 0, steps - 1);
        reverse(arr, steps, length - 1);
    }
    
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
