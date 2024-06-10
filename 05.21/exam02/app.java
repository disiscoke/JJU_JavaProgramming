package exam02;

import java.io.*; // 파일 처리 관련 패키지 import

public class app {
    public static void main(String[] args) {
        InputStreamReader in = null; // 파일을 읽기 위한 InputStreamReader 객체 생성
        FileInputStream fin = null; // 파일을 읽기 위한 FileInputStream 객체 생성
        int ch; // 파일에서 읽은 문자를 저장하기 위한 변수
        try {
            fin = new FileInputStream("Hangul.txt"); // 파일을 읽기 위한 FileInputStream 객체 생성
            in = new InputStreamReader(fin, "UTF-8"); // 파일을 읽기 위한 InputStreamReader 객체 생성
            //in = new InputStreamReader(fin, "MS949");
            System.out.println("encoding set : " + in.getEncoding()); // 인코딩 방식 출력
            while ((ch = in.read()) != -1) { // 파일 끝까지 읽기
                System.out.print((char) ch); // 읽은 문자를 화면에 출력
            }

        } catch (IOException e) { // 파일 처리 관련 예외 처리
            System.out.println(e.getMessage()); // 오류 메시지 출력
        }

    }
}