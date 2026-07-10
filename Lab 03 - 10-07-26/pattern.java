public class pattern 
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=5; i++) // Upper Loop
        {
            for(int j=0; j<(5-i); j++)
            {
                System.out.print("  ");
            }
            for(int k=0; k<((2*i)-1); k++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }

        for(int i=5; i>=1; i--) // Lower Loop
        {
            for(int j=0; j<(5-i); j++)
            {
                System.out.print("  ");
            }
            for(int k=0; k<((2*i)-1); k++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }    
}