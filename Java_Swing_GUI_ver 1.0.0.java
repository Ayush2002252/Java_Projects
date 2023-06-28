

package college;

import java.awt.*;
import java.awt.event.*;
public class 10_C_07b extends Frame implements ActionListener              // Create Subclass of frame
{
    Button red,green,blue;
    Label label,l1;  
    public ThreeButtonGame()
    {
        label = new Label("click");
        label.setBounds(100,100,100,100);
        add(label);
             
        red= new Button("Red");
        green= new Button("Green");
        blue= new Button("Blue");
        
        setLayout(new FlowLayout());
        
        add(red);
        add(green);
        add(blue);
        
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        
        l1 = new Label("Score : ");
        l1.setBounds(200,200,200,50);
        add(l1);

    }
    
    public static void main(String[] args)
    {
        ThreeButtonGame bt = new ThreeButtonGame();
        bt.setTitle("Guess my real Background colour");
        bt.setSize(400,200);
        bt.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String clickedButton = e.getActionCommand();
        System.out.println(clickedButton + "clicked");
        
        if(e.getSource()==red)
        {
            setBackground(Color.red);
            label.setText("Right Choice");
            l1.setText("Score : 10");
        }
        else if(e.getSource()==green)
        {
            setBackground(Color.green);
            label.setText("Right Choice");
            l1.setText("Score : 10");
        }
        else
        {
            setBackground(Color.yellow);
            label.setText("Wrong Choice");
            l1.setText("Score : 0");
        }
        
    }
}