public class exam03 {
    static void increase(int m) { // int형 변수 m을 받는 메소드
        m = m + 1; // m을 1 증가시키는 메소드
        System.out.println("in increase : " + m); // m 출력
    }

    static void increase(Circle m) { // Circle형 변수 m을 받는 메소드
        m.radius = m.radius + 1; // m의 radius를 1 증가시키는 메소드
        System.out.println("in increase : " + m.radius); // m의 radius 출력
    }

    public static void main(String[] args) {

        int m = 0; // int형 변수 m 선언 및 초기화
        increase(m); // increase 메소드 호출
        System.out.println("in main : " + m); // m 출력

        Circle cr = new Circle(0); // Circle형 변수 cr 선언 및 초기화
        increase(cr); // increase 메소드 호출
        System.out.println("in main : " + cr.radius); // cr의 radius 출력
    }
}