package exam06;

import java.io.*;

public class app {
    public static void main(String[] args) {
        File _path = new File("./"); // 현재 디렉토리를 나타내는 File 객체 생성
        System.out.println(null == _path ? "null" : _path.getAbsolutePath()); // 현재 디렉토리의 절대 경로 출력

        File[] subFiles = _path.listFiles(); // 현재 디렉토리의 파일 목록을 File 배열로 저장

        for (File file : subFiles) {
            System.out.println(file.getName()); // 파일 이름 출력
        }
    }
}
