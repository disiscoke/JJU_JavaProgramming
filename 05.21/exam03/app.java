package exam03;

import java.io.*;
import java.util.*;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 키보드로부터 입력받기 위한 Scanner 객체 생성
        FileWriter fout = null; // 파일을 쓰기 위한 FileWriter 객체 생성
        int _ch; // 키보드로부터 입력받은 문자를 저장하기 위한 변수

        try {
            fout = new FileWriter("out.txt"); // 파일을 쓰기 위한 FileWriter 객체 생성
        while (true) {
            String line = scanner.nextLine(); // 키보드로부터 한 줄을 입력받아 line에 저장
            if (line.length() == 0) // 입력받은 문자열의 길이가 0이면
                break; // 반복문 종료
            fout.write(line, 0, line.length()); // 파일에 line의 내용을 쓰기
            fout.write("\r\n", 0, 2); // 파일에 개행 문자 쓰기
        }
        fout.close(); // 파일 닫기
        } catch (IOException e) { // 파일 처리 관련 예외 처리
            System.out.println("입출력 오류"); // 오류 메시지 출력
        }
        scanner.close(); // Scanner 객체 닫기
    }
    
}
