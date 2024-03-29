package assignment2;

import java.util.Scanner;

public class question4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        try {
            System.out.print("Enter the first num: ");
            num1 = scanner.nextInt();
            System.out.print("Enter the second num: ");
            num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } 
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed.");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            scanner.close();
        }
    }
}
