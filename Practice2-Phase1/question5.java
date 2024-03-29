package assignment2;

import java.util.Scanner;

class InvalidInputException extends Exception {
 public InvalidInputException(String message) {
     super(message);
 }
}
public class question5 {
 public static double calculateSquareRoot(double num) throws InvalidInputException {
     if (num < 0) {
         throw new InvalidInputException("Input cannot be negative.");
     }
     return Math.sqrt(num);
 }
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);  
     try {
         System.out.print("Enter a number to calculate its square root: ");
         double input = scanner.nextDouble();
         
         double result = calculateSquareRoot(input);
         System.out.println("Square root of " + input + " is: " + result);
     } catch (InvalidInputException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
     } finally {
         scanner.close();
         System.out.println("Scanner closed in finally block.");
     }
 }
}

