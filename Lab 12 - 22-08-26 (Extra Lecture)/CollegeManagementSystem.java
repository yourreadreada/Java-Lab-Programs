// File 3: CollegeManagementSystem.java (Main Program)
import student.StudentDetails; // Importing user-defined package class
import faculty.FacultyDetails; // Importing user-defined package class
import java.util.*;


public class CollegeManagementSystem
{
   public static void main(String args[]) // Main method
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Student Name and Roll No: ");
       String sn = sc.next();
       int sr = sc.nextInt();
       System.out.print("Enter Faculty Name and Department: ");
       String fn = sc.next();
       String fd = sc.next();
      
       StudentDetails sObj = new StudentDetails(); // Creating instance from student package
       FacultyDetails fObj = new FacultyDetails(); // Creating instance from faculty package
      
       System.out.println("\n-- College Management System --");
       sObj.showDetails(sn, sr); // Calling package method
       fObj.showDetails(fn, fd); // Calling package method
       sc.close();
   }
}
