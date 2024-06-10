public class myCircle {
    
    int radius; // 원의 반지름 필드
    String name; // 원의 이름 필드

    public myCircle() { // 매개변수 없는 생성자
        radius = 1; // 반지름을 1로 초기화
        name = ""; // 이름 없음
    }

    public myCircle(int r, String n) { // 매개변수를 가진 생성자
        radius = r; // 반지름을 r로 초기화
        name = n; // 이름을 n으로 초기화
    }

    public double getArea() { // 원의 넓이를 계산해서 반환하는 메소드
        return 3.14 * radius * radius; // 원의 넓이 계산
    }
}
