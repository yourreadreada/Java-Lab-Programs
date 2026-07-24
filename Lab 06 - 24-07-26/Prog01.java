// Wrapper Classes
import java.util.*;
public class Prog01
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Numbers: "); // Taking Number Input From User
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.close();

        // Boxing
        // Integer bwrap=Integer.valueOf(x); // Primitive Type To Wrapper Object using valueOf()

        // Auto-Boxing
        Integer xwrap=x; // Primitive Type To Wrapper Object (direct conversion)
        Integer ywrap=y;

        // UnBoxing
        // int ub=bwrap.intValue(); // Wrapper Object To Primitive Type using intValue()

        // Auto-UnBoxing
        int a=xwrap; // Wrapper Object To Primitive Type (direct conversion)
        int b=ywrap;

        System.out.println("Arithmetic Operations: ");
        System.out.println("Addition = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Multiplication = "+(a*b));
        if(b!=0)
        {
            System.out.println("Division = "+(a/b));
        }
        else
        {
            System.out.println("Division By Zero Is Not Possible.");
        }
        System.out.println("Remainder = "+(a%b));
    }
}