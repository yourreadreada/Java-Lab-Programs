// Assignment 17 - Exercise 2: Employee Registration Form using Java Swing GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EmployeeRegForm
{
    public static void main(String args[]) // Main method
    {
        JFrame frame = new JFrame("Employee Registration Form"); // Creating JFrame window
        frame.setSize(420, 300); // Setting frame dimensions
        frame.setLayout(new GridLayout(5, 2, 10, 10)); // Setting grid layout with padding
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closing behavior

        JLabel idlabel = new JLabel("Employee ID: "); // Label for ID
        JTextField idtext = new JTextField(); // Text field for ID

        JLabel namelabel = new JLabel("Employee Name: "); // Label for name
        JTextField nametext = new JTextField(); // Text field for name

        JLabel deptlabel = new JLabel("Department: "); // Label for department
        JTextField depttext = new JTextField(); // Text field for department

        JLabel sallabel = new JLabel("Monthly Salary: "); // Label for salary
        JTextField saltext = new JTextField(); // Text field for salary

        JButton submitbutton = new JButton("Submit"); // Submit button
        JButton resetbutton = new JButton("Reset"); // Reset button

        resetbutton.addActionListener(new ActionListener() // Action listener for reset button
        {
            public void actionPerformed(ActionEvent e) // Event handler
            {
                idtext.setText(""); // Clearing ID
                nametext.setText(""); // Clearing Name
                depttext.setText(""); // Clearing Department
                saltext.setText(""); // Clearing Salary
            }
        });

        submitbutton.addActionListener(new ActionListener() // Action listener to show dialog box
        {
            public void actionPerformed(ActionEvent e) // Event handler
            {
                String id = idtext.getText(); // Reading ID
                String name = nametext.getText(); // Reading Name
                String dept = depttext.getText(); // Reading Department
                String sal = saltext.getText(); // Reading Salary

                String details = "--- Registered Employee Details ---\n" +
                                 "Employee ID: " + id + "\n" +
                                 "Name: " + name + "\n" +
                                 "Department: " + dept + "\n" +
                                 "Salary: $" + sal; // Building dialog display text

                JOptionPane.showMessageDialog(frame, details, "Employee Information", JOptionPane.INFORMATION_MESSAGE); // Displaying details in dialog box
            }
        });

        frame.add(idlabel); // Adding ID label
        frame.add(idtext); // Adding ID field
        frame.add(namelabel); // Adding Name label
        frame.add(nametext); // Adding Name field
        frame.add(deptlabel); // Adding Department label
        frame.add(depttext); // Adding Department field
        frame.add(sallabel); // Adding Salary label
        frame.add(saltext); // Adding Salary field
        frame.add(submitbutton); // Adding Submit button
        frame.add(resetbutton); // Adding Reset button

        frame.setVisible(true); // Making frame visible
    }
}