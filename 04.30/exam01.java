/**
 * Class_A 클래스는 부모 클래스로, 생성자를 가지고 있습니다.
 */
class Class_A { 
    /**
     * Class_A의 기본 생성자입니다.
     * "do Class_A"를 출력합니다.
     */
    Class_A() {
        System.out.println("do Class_A");
    }

    /**
     * Class_A의 매개변수를 받는 생성자입니다.
     * 주어진 x 값을 출력합니다.
     * @param x 출력할 정수 값
     */
    Class_A(int x) {
        System.out.println(x + " value class A");
    }
}

/**
 * Class_B 클래스는 Class_A 클래스를 상속받은 자식 클래스입니다.
 */
class Class_B extends Class_A {
    /**
     * Class_B의 기본 생성자입니다.
     * "do Class_B"를 출력합니다.
     */
    Class_B() {
        System.out.println("do Class_B");
    }

    /**
     * Class_B의 매개변수를 받는 생성자입니다.
     * 부모 클래스의 생성자를 호출한 후 주어진 x 값을 출력합니다.
     * @param x 출력할 정수 값
     */
    Class_B(int x) {
        super(x);
        System.out.println(x + " value class A");
    }
}

/**
 * Class_C 클래스는 Class_B 클래스를 상속받은 자식 클래스입니다.
 */
class Class_C extends Class_B {
    /**
     * Class_C의 기본 생성자입니다.
     * "do Class_C"를 출력합니다.
     */
    Class_C() {
        System.out.println("do Class_C");
    }
}

/**
 * exam01 클래스는 프로그램의 진입점을 포함하는 클래스입니다.
 */
public class exam01 {
    /**
     * main 메소드는 프로그램의 진입점입니다.
     * Class_C 객체와 Class_B 객체를 생성합니다.
     * @param args 명령행 인수 배열
     */
    public static void main(String[] args) {
        Class_C _Cobj = new Class_C();

        Class_B _Bobj = new Class_B(10);
    }
}