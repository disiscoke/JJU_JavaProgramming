class Point {
    int x, y; // x, y 좌표

    void set(int x, int y) { // x, y 좌표 설정
        this.x = x; // this.x는 인스턴스 변수 x를 의미
        this.y = y; // this.y는 인스턴스 변수 y를 의미
    }

    void ShowPoint() { // x, y 좌표 출력
        System.out.println(x + "," + y); // x, y 좌표 출력
    }
}

class PointColor extends Point {
    int color; // 색상
    void setColor(int color) { // 색상 설정
        this.color = color; // this.color는 인스턴스 변수 color를 의미
    }
    void ShowColorPoint() { // 색상과 x, y 좌표 출력
        System.out.println(color); // 색상 출력
        System.out.println(x + "," + y); // x, y 좌표 출력
    }
}

public class exam08 {
    public static void main(String[] args) {
        Point p1 = new Point(); // Point형 변수 p1 선언
        p1.set(1, 2); // p1의 x, y 좌표 설정
        p1.ShowPoint(); // p1의 x, y 좌표 출력
        PointColor p2 = new PointColor(); // PointColor형 변수 p2 선언
        p2.set(3, 4); // p2의 x, y 좌표 설정
        p2.setColor(256); // p2의 색상 설정
        p2.ShowColorPoint(); // p2의 색상과 x, y 좌표 출력
    }
}
