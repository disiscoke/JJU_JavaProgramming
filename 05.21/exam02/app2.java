package exam02;

import java.util.Vector;

public class app2 {
    public static void main(String[] args) throws Exception {
        Vector<Integer> _vt = new Vector<>(); // Vector 객체 생성

        _vt.add(1); // Vector에 요소 추가
        _vt.add(2); // Vector에 요소 추가
        _vt.add(3); // Vector에 요소 추가

        Integer num = _vt.get(1); // Vector의 1번째 요소를 가져와 num에 저장
        num = 7; // num의 값을 7로 변경

        for (int i = 0; i < _vt.size(); i++) { // Vector의 크기만큼 반복
            System.out.println(_vt.get(i)); // Vector의 i번째 요소를 출력
        }

        System.out.println("Hello, World!");
        
    }
}
