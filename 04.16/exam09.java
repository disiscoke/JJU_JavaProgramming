class Shape { // 도형 클래스
    int w, h; // 가로, 세로 길이
    int getArea() { // 넓이 구하는 메소드
        return 0; // 넓이 반환
    }
    public Shape(int w, int h) { // 가로, 세로 길이를 받는 생성자
        this.w = w; // 가로 길이 설정
        this.h = h; // 세로 길이 설정
    }
}

class Triangle extends Shape { // 삼각형 클래스
    public Triangle(int w, int h) { // 가로, 세로 길이를 받는 생성자
        super(w, h); // 부모 클래스 생성자 호출
    }
    int getArea() { // 넓이 구하는 메소드
        return w * h / 2; // 삼각형 넓이 반환
    }
    void show() { // 삼각형 넓이 출력 메소드
        System.out.println("삼각형의 넓이 : " + getArea()); // 삼각형 넓이 출력
    }

}

class Rectangle extends Shape { // 사각형 클래스
    public Rectangle(int w, int h) { // 가로, 세로 길이를 받는 생성자
        super(w, h); // 부모 클래스 생성자 호출
    }
    int getArea() { // 넓이 구하는 메소드
        return w * h; // 사각형 넓이 반환
    }
    void show() { // 사각형 넓이 출력 메소드
        System.out.println("사각형의 넓이 : " + getArea()); // 사각형 넓이 출력
    }
}

public class exam09 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10, 5); // 삼각형 객체 생성
        Rectangle r = new Rectangle(10, 5); // 사각형 객체 생성
        t.show(); // 삼각형 넓이 출력
        r.show(); // 사각형 넓이 출력
    }
}