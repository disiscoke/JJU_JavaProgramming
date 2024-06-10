package exam05;

import java.io.*;

public class app {
    public static void main(String args[]) {
        FileReader fin = null; // 파일을 읽기 위한 FileReader 객체 선언

        try {
            fin = new FileReader("test2.txt"); // 파일을 읽기 위한 FileReader 객체 생성
            int c; // 파일에서 읽은 문자를 저장할 변수 선언
            int _count = 0; // 파일에서 읽은 문자의 개수를 저장할 변수 선언
            BufferedOutputStream out = new BufferedOutputStream(System.out,4); // 파일에서 읽은 문자를 화면에 출력하기 위한 BufferedOutputStream 객체 생성

            while ((c = fin.read()) != -1) { // 파일에서 문자를 읽어 c에 저장하고, c가 -1이 아닐 때까지 반복
                out.write(c); // 읽은 문자를 화면에 출력
                
                // System.out.print((char) c); // 읽은 문자를 화면에 출력
                // _count++; // 읽은 문자의 개수를 1 증가
                // if (_count > 4) { // 읽은 문자의 개수가 4보다 크면
                //     break; // 반복문 종료
                // }
            }
            System.out.println("--------------------"); // 구분선 출력
            fin.close(); // 파일 닫기
            out.flush(); // 출력 버퍼 비우기
            out.close(); // 출력 버퍼 닫기
        }
        catch (IOException e) { // 파일 처리 관련 예외 처리
            System.out.println(e.getMessage()); // 오류 메시지 출력
            System.out.println("입출력 오류"); // 오류 메시지 출력
        }
    }
}
