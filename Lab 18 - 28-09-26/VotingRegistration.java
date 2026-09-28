// Assignment 16 - Exercise 2: Age Validation with User-Defined Exception
import java.util.*;
class InvalidAgeException extends Exception // User-defined exception class
{
    InvalidAgeException(String msg) // Constructor
    {
        super(msg); // Passing error message to superclass
    }
}

public class VotingRegistration
{
    static void checkEligibility(int age) throws InvalidAgeException // Method declaring custom exception
    {
        if(age < 18) // Eligibility check condition
        {
            throw new InvalidAgeException("Candidate is under 18 years old and ineligible to vote."); // Throwing custom exception
        }
        else // Valid age condition
        {
            System.out.println("Eligible");
        }
    }

    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Candidate Age: ");
        int userAge = sc.nextInt();
        try
        {
            checkEligibility(userAge); // Calling validation method
        }
        catch(InvalidAgeException e) // Catching custom exception
        {
            System.out.println("Registration Rejected -> " + e.getMessage()); // Error message
        }
        finally // Finally block
        {
            System.out.println("Voter verification process finished.");
            sc.close();
        }
    }
}