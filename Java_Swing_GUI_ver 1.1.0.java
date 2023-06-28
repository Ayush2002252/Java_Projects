package college;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class 10_C_07b
{
    // Declare the GUI Elements
    public static JFrame frame;
    public static JLabel lblCelsius;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateFtoC;
    
    public static void main(String[] args)
    {
        // Set up the frame
        frame = new JFrame("Temperature Converter ");
        frame.setSize(650, 100);
        frame.setLayout(new FlowLayout());
    
        // Create GUI Elements
        lblCelsius = new JLabel("Celsius:");
        textCelsius = new JTextField(10);
        lblFahrenheit = new JLabel("Fahrenheit:");
        textFahrenheit = new JTextField(10);
        btnCalculateCtoF = new JButton("Convert C to F");
        // Add ActionListener
        btnCalculateCtoF.addActionListener
                (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // Convert C to F
                    String cText = textCelsius.getText();
                    double c = Double.parseDouble(cText);
                    double f = (c * 9 / 5) + 32;
                    textFahrenheit.setText(String.valueOf(f));
                }
            }
        );
        
        btnCalculateFtoC = new JButton("Convert F to C");
        // Add ActionListener
        btnCalculateFtoC.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // Convert F to C
                    String fText = textFahrenheit.getText();
                    double f = Double.parseDouble(fText);
                    double c = (f - 32) * 5 / 9;
                    textCelsius.setText(String.valueOf(c)); 
                }
            }
        );
        // Add the GUI Elements to the frame
        frame.add(lblCelsius);
        frame.add(textCelsius);
        frame.add(lblFahrenheit);
        frame.add(textFahrenheit);
        frame.add(btnCalculateCtoF);
        frame.add(btnCalculateFtoC);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}