package exam05;  //  패키지 정의
import java.awt.*;  //  AWT 패키지 임포트
import javax.swing.*;  //  Swing 패키지 임포트
import java.awt.event.*;  //  AWT 이벤트 패키지 임포트

public class AnonymousClassListener extends JFrame {  //  JFrame을 상속하는 AnonymousClassListener 클래스 정의

    public AnonymousClassListener() {  //  생성자
        setTitle("Main Window");  //  창의 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //  닫기 버튼 동작 설정

        Container container = getContentPane();  //  컨텐트 팬 가져오기

        container.setLayout(new FlowLayout());  //  레이아웃을 FlowLayout으로 설정

        JButton button = new JButton("Click Me");  //  "Click Me" 버튼 생성
        
        button.addActionListener(new ActionListener() {  //  버튼에 익명 클래스 액션 리스너 추가
            public void actionPerformed(ActionEvent e) {  //  버튼 클릭 시 호출되는 메서드
                JButton btn = (JButton) e.getSource();  //  이벤트 소스 가져오기
                if (btn.getText().equals("Click Me")) {  //  버튼 텍스트가 "Click Me"이면
                    btn.setText("Clicked");  //  텍스트를 "Clicked"로 변경
                } else {  //  그렇지 않으면
                    btn.setText("Click Me");  //  텍스트를 "Click Me"로 변경
                }
                System.out.println("Button Clicked");  //  콘솔에 "Button Clicked" 출력
            }
        });

        JLabel label1 = new JLabel("Hello World");  //  "Hello World" 라벨 생성
        container.add(label1);  //  라벨을 컨텐트 팬에 추가

        JLabel label2 = new JLabel("Hello World");  //  또 다른 "Hello World" 라벨 생성
        container.add(label2);  //  라벨을 컨텐트 팬에 추가

        container.add(button);  //  버튼을 컨텐트 팬에 추가

        setSize(300, 200);  //  창의 크기를 300x200으로 설정

        setVisible(true);  //  창을 보이게 설정
    }

    public static void main(String[] args) {  //  메인 메서드
        new AnonymousClassListener();  //  AnonymousClassListener 객체 생성 및 창 보이기
    }
}