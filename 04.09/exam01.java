import java.util.Scanner;

public  class exam01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("나뉨수를 입력하시오: ");
            int dividend = scanner.nextInt(); // 나뉨수 입력
            System.out.print("나눗수를 입력하시오: ");
            int divisor = scanner.nextInt(); // 나눗수 입력
            try {
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");    // 정상적인 나눗셈이 완료되면 실행되는 코드
                break;  // 정상적인 나눗셈이 완료되었으므로 while문을 빠져나감
            } catch (ArithmeticException e) {   // ArithmeticException 예외가 발생하면 실행되는 코드
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요."); // 예외 발생시 실행되는 코드
            }
        }
        scanner.close();
    }
}