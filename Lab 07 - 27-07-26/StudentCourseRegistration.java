// Assignment 5 - Exercise 2: Course Registration using ArrayList and StringBuffer
import java.util.*;

public class StudentCourseRegistration
{
    public static void main(String args[]) // Main method
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<String>(); // ArrayList to store courses dynamically
        
        while(true) // Infinite loop for menu
        {
            System.out.println("\n1. Add Course  2. Remove Course  3. View Courses  4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // Consuming leftover newline
            
            if(ch == 1) // Add condition
            {
                System.out.print("Enter Course Name to Add: ");
                courses.add(sc.nextLine());
            }
            else if(ch == 2) // Remove condition
            {
                System.out.print("Enter Course Name to Remove: ");
                courses.remove(sc.nextLine());
            }
            else if(ch == 3) // View condition
            {
                StringBuffer sb = new StringBuffer();
                sb.append("\n=== Registered Courses ===\n"); // Appending header
                for(int i=0; i<courses.size(); i++)
                {
                    sb.append("- " + courses.get(i) + "\n"); // Appending course names
                }
                System.out.println(sb.toString());
            }
            else if(ch == 4)
            {
                break;
            }
        }
        sc.close();
    }
}