abstract class Carculater { // 계산기 클래스
    public abstract int add(int a, int b); // 덧셈

    public abstract int sub(int a, int b); // 뺄셈

    public abstract int mul(int a, int b); // 곱셈

    public abstract int div(int a, int b); // 나눗셈
}

public class exam06 extends Carculater {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        exam06 mycal = new exam06();

        System.out.println(mycal.add(10, 20));
        System.out.println(mycal.sub(10, 20));
    }
}