class StaticSample2 {
    public int n; // 인스턴스 변수

    public void g() { // 인스턴스 메소드
        m = 20; // 클래스 변수 m에 20 대입
    }

    public void h() { // 인스턴스 메소드
        m = 30; // 클래스 변수 m에 30 대입
    }

    public static int m; // 클래스 변수

    public static void f() { // 클래스 메소드
        m = 5; // 클래스 변수 m에 5 대입
    }
}

public class exam07_2 {

    public static void main(String[] args) {
        StaticSample2.m = 10; // 클래스 변수 m에 10 대입

        StaticSample2 s1; // StaticSample2형 변수 s1 선언
        s1 = new StaticSample2(); // s1 초기화
        System.out.println(s1.m); // s1의 클래스 변수 m 출력
        s1.f(); // s1의 클래스 메소드 f() 호출
        StaticSample2.f(); // 클래스 메소드 f() 호출
    }
}