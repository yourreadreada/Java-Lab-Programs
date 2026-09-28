// Assignment 17 - Exercise 1: Swing GUI Window Application
import javax.swing.*; // For GUI Components
import java.awt.*; // For Layout
public class UserRegistration
{
    public static void main(String args[]) // Main Method
    {
        JFrame frame = new JFrame("Student Registration Form"); // Creating top-level window frame
        frame.setSize(400, 300); // Setting frame dimensions
        frame.setLayout(new GridLayout(4, 2, 10, 10)); // Setting grid layout with spacing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closing operation

        // Name
        JLabel lblName = new JLabel("Enter Name: "); // Label
        JTextField txtName = new JTextField(); // Textfield for input

        // Roll No
        JLabel lblRoll = new JLabel("Enter Roll No: "); // Label
        JTextField txtRoll = new JTextField(); // Textfield for input

        // Branch
        JLabel lblBranch = new JLabel("Enter Branch: "); // Label
        JTextField txtBranch = new JTextField(); // Textfield for input

        // Buttons
        JButton btnSubmit = new JButton("Submit"); // Submit button
        JButton btnReset = new JButton("Clear"); // Clear button

        frame.add(lblName); // Adding name label to frame
        frame.add(txtName); // Adding name textfield to frame
        frame.add(lblRoll); // Adding roll label to frame
        frame.add(txtRoll); // Adding roll textfield to frame
        frame.add(lblBranch); // Adding branch label to frame
        frame.add(txtBranch); // Adding branch textfield to frame
        frame.add(btnSubmit); // Adding submit button to frame
        frame.add(btnReset); // Adding reset button to frame

        frame.setVisible(true); // Displaying frame window
    }
}