// Assignment 14 - Exercise 1: Exception handling with Multiple Catch Blocks
import java.util.*;
public class MultiCatch
{
    public static void main(String args[]) // Main method
    {
        Scanner sc = new Scanner(System.in); // Scanner object
        int arr[] = {10, 20, 30, 40, 50}; // Initializing sample array
        System.out.println("Sample Array:");
        for(int i=0; i<5; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        try
        {
            System.out.print("Enter index to access (0-4): ");
            int idx = sc.nextInt(); // Reading index
            System.out.println("Array value at index " + idx + " is: " + arr[idx]); // Accessing array element
            
            System.out.print("Enter divisor for the value: ");
            int div = sc.nextInt(); // Reading divisor
            int res = arr[idx] / div; // Arithmetic division
            System.out.println("Division Result = " + res); // Printing quotient
        }
        catch(ArrayIndexOutOfBoundsException e) // Catching invalid index
        {
            System.out.println("Error: Index entered is beyond array limits!"); // Handling array exception
        }
        catch(ArithmeticException e) // Catching division by zero
        {
            System.out.println("Error: Division by zero is not allowed!"); // Handling math exception
        }
        catch(Exception e) // Generic exception fallback
        {
            System.out.println("Error: Exception occurred! " + e.getMessage()); // Generic message
        }
        System.out.println("Program execution continues normally.");
        sc.close(); // Closing scanner
        System.out.println("\n");
    }
}