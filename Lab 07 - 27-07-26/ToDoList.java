// Assignment 5 - Exercise 1: To-Do List using ArrayList and StringBuffer
import java.util.*;
public class ToDoList
{
    public static void main(String args[]) // Main method
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<String>(); // ArrayList for dynamic task storage
        
        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consuming leftover newline
        
        for(int i=0; i<n; i++) // Loop to accept tasks
        {
            System.out.print("Enter Task " + (i+1) + ": ");
            tasks.add(sc.nextLine()); // Adding user input to ArrayList
        }
        
        StringBuffer sb = new StringBuffer(); // StringBuffer for string manipulation
        sb.append("\n- TO-DO LIST -\n"); // Appending header

        for(int i=0; i<tasks.size(); i++) // Iterating through ArrayList
        {
            sb.append((i+1) + ". " + tasks.get(i) + "\n");
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}