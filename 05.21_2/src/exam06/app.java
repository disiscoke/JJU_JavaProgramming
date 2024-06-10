package exam06;

import java.io.*;

public class app {
    public static void main(String[] args) {
        File _path = new File("./"); // 현재 디렉토리를 나타내는 File 객체 생성
        System.out.println(null == _path ? "null" : _path.getAbsolutePath()); // 현재 디렉토리의 절대 경로 출력

        File[] subFiles = _path.listFiles(); // 현재 디렉토리의 파일 목록을 File 배열로 저장

        for (File file : subFiles) {

            long t = file.lastModified(); // 파일의 마지막 수정 시간을 long 형으로 저장

            if (file.isDirectory()) { // 디렉토리인 경우
                System.out.println("[" + file.getName() + "]"); // 디렉토리 이름 출력
            }
            else { // 파일인 경우
                System.out.println(file.getName() + "\t" + file.length() + "bytes" + "\t" + t); // 파일 이름, 크기, 수정 시간 출력
                System.out.printf("%tb %td %ta %tT \n", t, t, t, t); // 수정 시간을 형식에 맞게 출력 (월, 일, 요일, 시간)
            }
        }
            
    }
}
