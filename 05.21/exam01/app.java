package exam01;

import java.io.*;

public class app {
    public static void main(String[] args) {
        FileReader fin = null;

        String path = System.getProperty("user.dir");
        System.out.println(path);

        try {
            fin = new FileReader("test.txt"); // 파일을 읽기 위한 FileReader 객체 생성
            int c; // 파일에서 읽은 문자를 저장하기 위한 변수
            while ((c = fin.read()) != -1) { // 파일 끝까지 읽기
                System.out.print((char) c); // 읽은 문자를 화면에 출력
            } // 파일 끝까지 읽기
            fin.close(); // 파일 닫기
        } catch (IOException e) {   // 파일 처리 관련 예외 처리
            System.out.println("입출력 오류");  // 오류 메시지 출력
        }
    }
}