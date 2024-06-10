package exam07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class mainFrame extends JFrame {
    private TimerThread timerThread;
    private JLabel timerLabel;

    public class TimerThread extends Thread {
        private JLabel timerLabel;

        public TimerThread(JLabel timerLabel) {
            this.timerLabel = timerLabel;
        }

        public void run() {
            int n = 0;
            while (true) {
                timerLabel.setText(Integer.toString(n));
                n++;
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public mainFrame() {
        setTitle("Timer Thread Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        timerLabel = new JLabel("0");
        c.add(timerLabel);

        JButton startButton = new JButton("Start Timer");
        c.add(startButton);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (timerThread == null || !timerThread.isAlive()) {
                    timerThread = new TimerThread(timerLabel);
                    timerThread.start();
                }
            }
        });

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new mainFrame();
    }
}