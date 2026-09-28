// Assignment 18 - Exercise 2: Bank Balance Calculator GUI Application
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankBalanceGUICalc implements ActionListener
{
    JFrame frame; // Top-level window frame
    JTextField initbaltxt, transacamttxt; // Input text fields
    JLabel updatedballabel; // Label to display updated balance
    JButton depositbutton, withdrawbutton; // Action buttons
    double currentBal = 0.0; // Variable to track balance
    boolean initflag = false; // Flag to check initial balance set

    BankBalanceGUICalc() // Constructor to build GUI
    {
        frame = new JFrame("Bank Balance Calculator"); // Creating window frame
        frame.setSize(420, 260); // Setting frame dimensions
        frame.setLayout(new GridLayout(5, 2, 10, 10)); // Setting grid layout with padding
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closing behavior

        JLabel initlabel = new JLabel("Initial Balance: "); // Label for initial balance
        initbaltxt = new JTextField(); // Text field for initial balance

        JLabel transacamtlabel = new JLabel("Transaction Amount: "); // Label for transaction amount
        transacamttxt = new JTextField(); // Text field for transaction input

        depositbutton = new JButton("Deposit (+)");
        withdrawbutton = new JButton("Withdraw (-)");

        updatedballabel = new JLabel("Updated Balance: $0.00"); // Output label
        updatedballabel.setFont(new Font("Arial", Font.BOLD, 13));

        depositbutton.addActionListener(this); // Registering deposit listener
        withdrawbutton.addActionListener(this); // Registering withdraw listener

        frame.add(initlabel);
        frame.add(initbaltxt);
        frame.add(transacamtlabel);
        frame.add(transacamttxt);
        frame.add(depositbutton);
        frame.add(withdrawbutton);
        frame.add(updatedballabel);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) // Event handler method
    {
        try
        {
            if(!initflag) // Initializing starting balance on first action
            {
                currentBal = Double.parseDouble(initbaltxt.getText()); 
                initflag = true; // Setting initialized flag to true
                initbaltxt.setEditable(false); 
            }

            double amt = Double.parseDouble(transacamttxt.getText());

            if(amt <= 0) // Validating positive transaction amount
            {
                JOptionPane.showMessageDialog(frame, "Please enter an amount greater than 0.");
                return;
            }

            if(e.getSource() == depositbutton) // Deposit condition
            {
                currentBal += amt; // Adding amount to balance
                updatedballabel.setText("Updated Balance: $" + currentBal);
                transacamttxt.setText(""); // Clearing transaction field
            }
            else if(e.getSource() == withdrawbutton) // Withdraw condition
            {
                if(amt > currentBal) // Insufficient funds condition
                {
                    JOptionPane.showMessageDialog(frame, "Insufficient Balance for this withdrawal!");
                }
                else // Valid withdrawal
                {
                    currentBal -= amt; // Subtracting amount from balance
                    updatedballabel.setText("Updated Balance: $" + currentBal);
                    transacamttxt.setText(""); // Clearing transaction field
                }
            }
        }
        catch(NumberFormatException ex) // Catching invalid inputs
        {
            JOptionPane.showMessageDialog(frame, "Invalid numeric input entered!");
        }
    }

    public static void main(String args[]) // Main Method
    {
        new BankBalanceGUICalc();
    }
}