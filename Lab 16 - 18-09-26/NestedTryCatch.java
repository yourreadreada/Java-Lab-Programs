// Assignment 14 - Exercise 2: Exception handling with Nested Try-Catch Blocks
import java.util.*;

public class NestedTryCatch
{
    public static void main(String args[]) // Main method
    {
        Scanner sc = new Scanner(System.in); // Scanner object
        int nums[] = {100, 200, 300}; // Sample array
        System.out.println("Sample Array:");
        for(int i=0; i<3; i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
        
        try // Outer Block
        {
            System.out.print("Enter array index to divide: ");
            int index = sc.nextInt(); // Reading index
            int val = nums[index]; // Potentially throws ArrayIndexOutOfBoundsException
            
            try // Inner Block
            {
                System.out.print("Enter a divisor: ");
                int divisor = sc.nextInt(); // Reading divisor
                int quotient = val / divisor; // Potentially throws ArithmeticException
                System.out.println("Result: " + val + " / " + divisor + " = " + quotient); // Printing result
            }
            catch(ArithmeticException e) // Handling inner try block exception
            {
                System.out.println("Inner Catch: Cannot divide by zero!"); // Inner catch error
            }
        }
        catch(ArrayIndexOutOfBoundsException e) // Handling outer try block exception
        {
            System.out.println("Outer Catch: Selected index does not exist in array!"); // Outer catch error
        }
        System.out.println("Nested try-catch demonstration finished."); // Completion message
        sc.close();
        System.out.println("\n");
    }
}