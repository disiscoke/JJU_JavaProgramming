package exam06;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class mainwindow extends JFrame{
    
    JLabel label1 = new JLabel("Mouse Position : ");

    public mainwindow() {
        setTitle("Mouse event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        label1.setSize(120,20);
        label1.setLocation(30, 30);
        container.add(label1);
        container.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                label1.setText("Mouse Position : " + e.getX() + ", " + e.getY());
            }
        });
            // @Override
            // public void mouseClicked(MouseEvent e) {
            //     label1.setText("Mouse Clicked");
            // }
            // @Override
            // public void mousePressed(MouseEvent e) {
            //     label1.setText("Mouse Pressed");
            // }
            // @Override
            // public void mouseReleased(MouseEvent e) {
            //     label1.setText("Mouse Released");
            // }
            // @Override
            // public void mouseEntered(MouseEvent e) {
            //     label1.setText("Mouse Entered");
            // }
            // public void mouseExited(MouseEvent e) {
            //     label1.setText("Mouse Exited");
            // }
        };
        public static void main(String[] args) {
            mainwindow window = new mainwindow();
        }
} // Add this closing brace
