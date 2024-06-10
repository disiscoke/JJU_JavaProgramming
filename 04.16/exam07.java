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

public class exam07 {
    public static void main(String[] args) {
        StaticSample2 s1, s2; // StaticSample2형 변수 s1, s2 선언
        s1 = new StaticSample2(); // s1 초기화
        s1.n = 5; // s1의 인스턴스 변수 n에 5 대입
        s1.g(); // s1의 인스턴스 메소드 g() 호출
        s1.m = 50; // s1의 클래스 변수 m에 50 대입
        s2 = new StaticSample2(); // s2 초기화
        s2.n = 8; // s2의 인스턴스 변수 n에 8 대입
        s2.h(); // s2의 인스턴스 메소드 h() 호출
        s2.f(); // s2의 클래스 메소드 f() 호출
        System.out.println(s1.m); // s1의 클래스 변수 m 출력

    }
}
