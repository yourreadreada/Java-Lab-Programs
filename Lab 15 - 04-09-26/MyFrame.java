import javax.swing.*;
public class MyFrame
{
    public static void main(String args[])
    {
        JFrame frame=new JFrame("My Application");
        JButton button=new JButton("Click Me");
        frame.add(button);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}