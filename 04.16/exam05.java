class SimpleMethod {
    static int getSum(int a, int b) { // int형 변수 a, b를 받는 메소드

        return a + b; // a와 b의 합 반환

    }

    static int getSum(int a, int b, int c) { // int형 변수 a, b, c를 받는 메소드

        return a + b + c; // a, b, c의 합 반환

    }
}

public class exam05 {

    public static void main(String[] args) {

        System.out.println(SimpleMethod.getSum(10, 20)); // getSum 메소드 호출
        System.out.println(SimpleMethod.getSum(10, 20, 30)); // getSum 메소드 호출

    }
}