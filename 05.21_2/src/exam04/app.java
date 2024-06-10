package exam04;

import java.io.*;

public class app {
    static void SaveTest() {
        byte _b[] = {7,51,3,4,-1,24}; // byte 배열 선언 및 초기화

        try {
            FileOutputStream fos = new FileOutputStream("test_hex.out"); // 파일을 쓰기 위한 FileOutputStream 객체 생성
            for (int i = 0; i < _b.length; i++) { // byte 배열의 길이만큼 반복
                fos.write(_b[i]); // 파일에 byte 배열의 내용을 쓰기
            }
            fos.close(); // 파일 닫기

        } catch (IOException e) { // 파일 처리 관련 예외 처리
            System.out.println("입출력 오류"); // 오류 메시지 출력
        }

        System.out.println("파일에 저장되었습니다.");
    }

    static void LoadTest() {
        byte _b[] = new byte[6]; // byte 배열 선언 및 초기화

        try {
            FileInputStream fis = new FileInputStream("test_hex.out"); // 파일을 읽기 위한 FileInputStream 객체 생성
            for (int i = 0; i < _b.length; i++) { // byte 배열의 길이만큼 반복
                //fos.write(_b[i]); // 파일에 byte 배열의 내용을 쓰기
                int _ch = fis.read(); // 파일에서 한 바이트 읽기
                _b[i] = (byte) _ch; // 읽은 바이트를 byte 배열에 저장
            }
            fis.close(); // 파일 닫기
            System.out.println("불러오기 완료"); // 메시지 출력

            for (int i = 0; i < _b.length; i++) { // byte 배열의 길이만큼 반복
                System.out.println(_b[i]); // byte 배열의 내용을 화면에 출력
            }

        } catch (IOException e) { // 파일 처리 관련 예외 처리
            System.out.println("입출력 오류"); // 오류 메시지 출력
        }
    }

    public static void main(String[] args) {
        SaveTest();
        LoadTest();
    }
}
