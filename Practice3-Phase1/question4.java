package assignment3;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the first mx: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns of the first mx: ");
        int cols1 = scanner.nextInt();
        System.out.print("Enter the number of rows of the second mx: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns of the second mx: ");
        int cols2 = scanner.nextInt();
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] result = multiplyMatrices(matrix1, matrix2);
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows1; i++)
        {
            for (int j = 0; j < cols2; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;  
        int[][] result = new int[rows1][cols2];     
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }
}
