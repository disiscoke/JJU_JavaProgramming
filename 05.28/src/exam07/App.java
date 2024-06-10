package exam07;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame {
    JLabel label1 = new JLabel("key : ");

    public App() {
        setTitle("Key event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);


        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        label1.setSize(120, 20);
        label1.setLocation(30, 30);
        container.add(label1);
        container.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                label1.setText("Key : " + e.getKeyChar());
                if (e.getKeyCode() == KeyEvent.VK_ADD) {
                    container.setBackground(Color.GREEN);
                } else if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
                    container.setBackground(Color.RED);
                } else if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
                    container.setBackground(Color.BLUE);
                } else if (e.getKeyCode() == KeyEvent.VK_DIVIDE) {
                    container.setBackground(Color.YELLOW);
                }
            }
        });
        container.setFocusable(true);
        container.requestFocus();
    }

        public static void main(String[] args) {
            App window = new App();
    }
}