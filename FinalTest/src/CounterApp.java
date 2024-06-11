import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int count = 0;
    private JLabel countLabel;
    private JButton button;

    public CounterApp() {
        // JFrame 설정
        setTitle("Counter Application");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Absolute layout 사용

        // JLabel 생성
        countLabel = new JLabel("Count: 0");
        countLabel.setBounds(100, 50, 100, 30); // 중앙에 위치하도록 설정
        add(countLabel);

        // JButton 생성
        button = new JButton("Increase Count");
        button.setBounds(80, 100, 140, 30); // 위치와 크기 설정
        add(button);

        // 버튼에 이벤트 리스너 추가
        button.addActionListener(new ActionListener() { // 1번: ActionListener
            @Override
            public void actionPerformed(ActionEvent e) { // 2번: actionPerformed
                count++;
                countLabel.setText("Count: " + count);
            }
        });
    }

    public static void main(String[] args) {
        // JFrame을 생성하고 화면에 표시
        CounterApp frame = new CounterApp();
        frame.setVisible(true);
    }
}
