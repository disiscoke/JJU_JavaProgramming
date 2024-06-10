package exam07;

import java.awt.*;
import javax.swing.*;

public class app extends JFrame{    // JFrame is a class in javax.swing package
    
    public app() {
        setTitle("My First Swing App"); // set the title of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        setSize(300, 200);  // set the size of the window
        setVisible(true);   // make the window visible

        Container _c = getContentPane();    // get the content pane of the JFrame

        _c.setLayout(new FlowLayout()); // set the layout of the content pane
        _c.setBackground(Color.PINK);   // set the background color of the content pane

        _c.add(new JButton("OK"));  // add a button to the content pane
        _c.add(new JButton("Cancel"));  // add a button to the content pane
        _c.add(new JButton("Ignore"));  // add a button to the content pane



        
    }

    public static void main(String[] args) {
        new app();
    }
}
