package exam08;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Hello Event"); // set the title of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        setSize(400, 300); // set the size of the window
        setVisible(true); // make the window visible
        
        Container _c = getContentPane(); // get the content pane of the JFrame
        _c.setLayout(new FlowLayout()); // set the layout of the content pane
        
        JButton _btn1 = new JButton("Hello"); // create a button
        
        _btn1.addActionListener(new ActionListener() { // add an action listener to the button
            public void actionPerformed(ActionEvent e) { // override the actionPerformed method
                JButton _btn1 = (JButton)e.getSource(); // get the source of the event
                _btn1.setText("World"); // set the text of the button
            }
        });
        
        _c.add(_btn1); // add the button to the content pane
        _btn1.setLocation(10, 10); // set the location of the button
        setLocation(100, 100); // set the location of the window
        
    }
    
    public static void main(String[] args) {
        MainFrame _frame = new MainFrame();
    }
}
