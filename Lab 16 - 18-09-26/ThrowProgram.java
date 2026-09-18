// Assignment 15 - Exercise 2: Using throw keyword for user validation
import java.util.*;
public class ThrowProgram
{
    public static void validateAge(int age) // Validation method
    {
        if(age < 18) // Eligibility check
        {
            throw new ArithmeticException("Age is under 18: Not Eligible"); // Explicitly throwing exception
        }
        else // Valid age condition
        {
            System.out.println("Eligible"); // Success message
        }
    }

    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int userAge = sc.nextInt();
        try
        {
            validateAge(userAge); // Calling validation method
        }
        catch(ArithmeticException e) // Catching explicitly thrown exception
        {
            System.out.println("Exception: " + e.getMessage());
        }
        finally
        {
            System.out.println("Verification process complete."); // Final status
            sc.close();
        }
    }
}