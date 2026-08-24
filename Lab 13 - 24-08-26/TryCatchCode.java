public class TryCatchCode 
{
    public static void main(String args[])
    {
        int num1=10;
        int num2=0;

        String str=null;
        
        // // ArithmeticException
        // System.out.println("ArithmeticException");
        // try
        // {
        //     // Trying to divide by zero, which will throw an ArithmeticException
        //     int result = num1/num2;
        //     System.out.println("Result = "+result);
        // }
        // catch (ArithmeticException e)
        // {
        //     // This block catches the ArithmeticException if division by zero occurs.
        //     System.out.println("Error: Cannot divide by zero!");
        //     System.out.println("Exception Message: "+e.getMessage());
        // }

        // System.out.println("Program continues after exception handling.");
        
        
        // // NullPointerException
        // System.out.println(" ");
        // System.out.println("NullPointerException");
        // try
        // {
        //     System.out.println(str.length());
        // }
        // catch (NullPointerException e)
        // {
        //     System.out.println("NullPointerException");
        //     System.out.println("Error: "+e.getMessage());
        // }
        // catch (Exception e)
        // {
        //     System.out.println(" Some other exception occured. ");
        // }

        
        // // Some Other Exception
        // System.out.println(" ");
        // System.out.println("Some Other Exception");
        // try
        // {
        //     System.out.println(str.length());
        // }
        // catch (ArithmeticException e)
        // {
        //     System.out.println("Error: Cannot divide by zero!");
        //     System.out.println("Exception Message: "+e.getMessage());
        // }
        // catch (Exception e)
        // {
        //     System.out.println(" Some other exception occured. ");
        // }


        // Nested 
        System.out.println(" ");
        try
        {
            try
            {
                int result = num1/num2;
            }
            catch (ArithmeticException e)
            {
                // This block catches the ArithmeticException if division by zero occurs.
                System.out.println("Error: Cannot divide by zero!");
                System.out.println("Exception Message: "+e.getMessage());
            }

            System.out.println(str.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException");
            System.out.println("Error: "+e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(" Some other exception occured. ");
        }
        finally
        {
            System.out.println("Inside Finally");
        }
    }
}