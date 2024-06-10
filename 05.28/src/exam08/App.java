package exam08;
import javax.swing.*;  //  javax.swing 패키지를 임포트
import java.awt.*;  //  java.awt 패키지를 임포트
import java.awt.event.ActionEvent;  //  ActionEvent 클래스를 임포트
import java.awt.event.ActionListener;  //  ActionListener 인터페이스를 임포트

public class App extends JFrame {  //  JFrame을 상속하는 App 클래스 정의
    JLabel label1 = new JLabel("Count : 0");  //  초기 텍스트가 "Count : 0"인 JLabel 생성

    public App() {  //  App 클래스의 생성자
        setTitle("Keyboard Event");  //  창의 제목을 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //  창 닫기 동작을 설정
        setSize(300, 200);  //  창의 크기를 설정

        Container container = getContentPane();  //  컨텐트 팬을 가져옴
        container.setLayout(new FlowLayout());  //  컨텐트 팬의 레이아웃을 FlowLayout으로 설정

        container.add(label1);  //  JLabel을 컨텐트 팬에 추가

        JButton btnAdd = new JButton("Add");  //  "Add" 버튼 생성
        container.add(btnAdd);  //  "Add" 버튼을 컨텐트 팬에 추가

        btnAdd.addActionListener(new ActionListener() {  //  "Add" 버튼에 액션 리스너 추가
            @Override
            public void actionPerformed(ActionEvent e) {  //  버튼 클릭 시 실행되는 메서드
                int count = Integer.parseInt(label1.getText().substring(8));  //  현재 카운트 값을 가져옴
                count++;  //  카운트를 1 증가시킴
                label1.setText("Count : " + count);  //  JLabel의 텍스트를 업데이트
            }
        });

        JButton btnSub = new JButton("Sub");  //  "Sub" 버튼 생성
        container.add(btnSub);  //  "Sub" 버튼을 컨텐트 팬에 추가

        btnSub.addActionListener(new ActionListener() {  //  "Sub" 버튼에 액션 리스너 추가
            @Override
            public void actionPerformed(ActionEvent e) {  //  버튼 클릭 시 실행되는 메서드
                int count = Integer.parseInt(label1.getText().substring(8));  //  현재 카운트 값을 가져옴
                count--;  //  카운트를 1 감소시킴
                label1.setText("Count : " + count);  //  JLabel의 텍스트를 업데이트
            }
        });
    }

    public static void main(String[] args) {  //  메인 메서드
        SwingUtilities.invokeLater(new Runnable() {  //  이벤트 디스패치 스레드에서 실행
            @Override
            public void run() {  //  실행할 코드 정의
                new App().setVisible(true);  //  App 객체를 생성하고 창을 보이게 함
            }
        });
    }
}