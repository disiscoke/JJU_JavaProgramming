import javax.swing.*;



class TimerThread extends Thread { // 1번: Thread

    private JLabel label; // 2번: JLabel

    private int count = 0;



    public TimerThread(JLabel label) {

        this.label = label;

    }



    @Override

    public void run() {

        try {

            while (true) {

                Thread.sleep(1000); // 3번: sleep(1000) // 1초 대기

                count++;

                label.setText("Counter: " + count);

            }

        } catch (InterruptedException e) {

            System.out.println("Thread interrupted");

        }

    }

}



public class CenteredLabelFrame extends JFrame {

    private JLabel label;



    public CenteredLabelFrame() {

        // JFrame 설정

        setTitle("Centered Label Example");

        setSize(300, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 4번: JFrame.EXIT_ON_CLOSE

        setLayout(null); // Absolute layout 사용



        // JLabel 생성

        label = new JLabel("Counter: 0", SwingConstants.CENTER);

        label.setBounds(100, 130, 100, 30); // 중앙에 위치하도록 설정



        // JLabel을 JFrame에 추가

        add(label);



        // 카운트를 증가시키는 TimerThread 시작

        TimerThread timerThread = new TimerThread(label);

        timerThread.start(); // 5번: start

    }



    public static void main(String[] args) {

        // JFrame을 생성하고 화면에 표시

        CenteredLabelFrame frame = new CenteredLabelFrame();

        frame.setVisible(true);

    }

}