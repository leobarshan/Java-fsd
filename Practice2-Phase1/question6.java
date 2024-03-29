package assignment2;

import java.util.Scanner;

class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}
public class question6 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     try {
         System.out.print("Enter your age: ");
         int age = scanner.nextInt();
         validateAge(age);
         System.out.println("Your age is: " + age);
     } catch (InvalidAgeException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Error: Invalid input.");
         scanner.nextLine();
     } finally {
         scanner.close();
         System.out.println("Scanner closed.");
     }
 }
 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 0 || age > 120) {
         throw new InvalidAgeException("Age must be between 0 and 120.");
     }
 }
}

