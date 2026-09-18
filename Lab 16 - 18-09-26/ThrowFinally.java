// Assignment 15 - Exercise 1: Using throws keyword and finally block
import java.util.*;
public class ThrowFinally
{
    public static int divide(int a, int b) throws ArithmeticException // Method declaring exception using throws
    {
        return (a / b); // Division that can throw ArithmeticException
    }

    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numerator: ");
        int num = sc.nextInt();
        System.out.print("Enter Denominator: ");
        int den = sc.nextInt();

        try
        {
            int ans = divide(num, den); // Calling method that throws exception
            System.out.println("Division Result = " + ans);
        }
        catch(ArithmeticException e) // Catching arithmetic error
        {
            System.out.println("Exception: Cannot divide by zero!"); // Handling exception
        }
        finally // Always executes
        {
            System.out.println("Finally block executed."); // Always executed
            sc.close();
        }
    }
}