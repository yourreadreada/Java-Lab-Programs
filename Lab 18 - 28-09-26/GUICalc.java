// Assignment 18 - Exercise 1: GUI Calculator using Java Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUICalc implements ActionListener
{
    JFrame frame; // Top-level window frame
    JTextField num1txt, num2txt; // Input text fields
    JLabel resultlabel; // Label to display result
    JButton addbutton, subbutton; // Operation buttons

    GUICalc() // Constructor to build calculator GUI
    {
        frame = new JFrame("Simple Calculator"); // Creating window frame
        frame.setSize(350, 220); // Setting frame dimensions
        frame.setLayout(new GridLayout(4, 2, 10, 10)); // Setting grid layout with spacing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closing behavior

        JLabel lbl1 = new JLabel("First Number: "); // Label
        num1txt = new JTextField(); // Text field

        JLabel lbl2 = new JLabel("Second Number: "); //
        num2txt = new JTextField();

        addbutton = new JButton("Add (+)"); // Addition button
        subbutton = new JButton("Subtract (-)"); // Subtraction button

        resultlabel = new JLabel("Result: "); // Label for showing output
        resultlabel.setFont(new Font("Arial", Font.BOLD, 14));

        addbutton.addActionListener(this); // Registering addition button listener
        subbutton.addActionListener(this); // Registering subtraction button listener

        frame.add(lbl1); // Adding label
        frame.add(num1txt); // Adding textfield
        frame.add(lbl2);
        frame.add(num2txt);
        frame.add(addbutton);
        frame.add(subbutton);
        frame.add(resultlabel);

        frame.setVisible(true); // Making window visible
    }

    public void actionPerformed(ActionEvent e) // Event handler method
    {
        try // Handling parsing errors
        {
            double n1 = Double.parseDouble(num1txt.getText()); 
            double n2 = Double.parseDouble(num2txt.getText()); 
            double res = 0; // Variable to store answer

            if(e.getSource() == addbutton) // Addition condition
            {
                res = n1 + n2;
                resultlabel.setText("Result: " + res); 
            }
            else if(e.getSource() == subbutton) // Subtraction condition
            {
                res = n1 - n2;
                resultlabel.setText("Result: " + res);
            }
        }
        catch(NumberFormatException ex) // Catching invalid inputs
        {
            resultlabel.setText("Error: Enter valid numbers!");
        }
    }

    public static void main(String args[]) // Main Method
    {
        new GUICalc();
    }
}