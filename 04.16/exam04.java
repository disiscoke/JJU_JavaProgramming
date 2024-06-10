public class exam04 {

    static void _inc(int[] m) { // int형 배열 m을 받는 메소드

        m[0] = m[0] + 1; // m[0]을 1 증가시키는 메소드

    }

    public static void main(String[] args) { // main 메소드

        int a[] = { 1 }; // int형 배열 a 선언 및 초기화

        _inc(a); // _inc 메소드 호출

        System.out.println("in main : " + a[0]); // a[0] 출력
    }
}
