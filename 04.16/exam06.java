class StaticSample { // 클래스 선언
    static int m; // int형 변수 m 선언
    int n; // int형 변수 n 선언

    int getNumber() {
        return m + n; // m+n 반환
    }

}

public class exam06 {
    public static void main(String[] args) {

        StaticSample a = new StaticSample(); // StaticSample형 변수 a 선언 및 초기화
        StaticSample b = new StaticSample(); // StaticSample형 변수 b 선언 및 초기화

        a.n = 1; // a.n에 1 대입
        b.n = 2; // b.n에 2 대입
        System.out.println(a.n + "," + b.n); // a.n, b.n 출력

        // a.m = 1; // a.m에 1 대입
        // b.m = 3; // b.m에 3 대입
        StaticSample.m = 3; // StaticSample.m에 3 대입
        System.out.println(a.m + "," + b.m); // a.m, b.m 출력
        System.out.println(a.getNumber());
        System.out.println(b.getNumber());

        StaticSample.m = 5; // StaticSample.m에 5 대입
        System.out.println(a.getNumber());
        System.out.println(b.getNumber());
        
    }
}
