package exam04;  //  패키지 정의

import java.awt.*;  //  AWT 패키지 임포트
import javax.swing.*;  //  Swing 패키지 임포트
import java.awt.event.*;  //  AWT 이벤트 패키지 임포트

public class mainwindow extends JFrame {  //  JFrame을 상속하는 mainwindow 클래스 정의

    private class MyActionListener implements ActionListener {  //  ActionListener를 구현하는 내부 클래스
        public void actionPerformed(ActionEvent e) {  //  버튼 클릭 시 호출되는 메서드
            System.out.println("Button Clicked");  //  "Button Clicked" 출력
        }
    }
    
    public mainwindow() {  //  생성자
        setTitle("Main Window");  //  창의 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //  닫기 버튼 동작 설정

        Container container = getContentPane();  //  컨텐트 팬 가져오기

        container.setLayout(new FlowLayout());  //  레이아웃을 FlowLayout으로 설정

        JButton button = new JButton("Click Me");  //  "Click Me" 버튼 생성

        button.addActionListener(new MyActionListener());  //  버튼에 액션 리스너 추가

        container.add(button);  //  버튼을 컨텐트 팬에 추가

        setSize(300, 200);  //  창의 크기를 300x200으로 설정

        setVisible(true);  //  창을 보이게 설정
    }

    public static void main(String[] args) {  //  메인 메서드
        mainwindow window = new mainwindow();  //  mainwindow 객체 생성
    }
}