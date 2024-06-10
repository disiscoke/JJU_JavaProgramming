public class exam02 {

    static void increase(int m) { // int형 변수 m을 받는 메소드
        m = m + 1; // m을 1 증가시키는 메소드
        System.out.println("in increase : " + m); // m 출력
    }

    public static void main(String[] args) { // main 메소드

        int m = 0; // int형 변수 m 선언 및 초기화
        increase(m); // increase 메소드 호출

        System.out.println("in main : " + m); // m 출력
    }
}
