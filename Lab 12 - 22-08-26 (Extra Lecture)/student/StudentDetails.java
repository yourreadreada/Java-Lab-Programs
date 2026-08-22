// File 1: student/StudentDetails.java
package student; // Package declaration
public class StudentDetails // Class must be public to be accessed outside package
{
   public void showDetails(String name, int roll) // Public method
   {
       System.out.println("Student: " + name + " | Roll: " + roll);
   }
}