import java.util.Scanner;

public class exam04 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("연산자 선택 : ");
        String _op = scanner.nextLine(); // 사용자로부터 연산자를 입력받음

        System.out.println("2개의 수를 입력하세요 (,) : ");
        int num1 = scanner.nextInt(); // 첫 번째 수를 입력받음
        int num2 = scanner.nextInt(); // 두 번째 수를 입력받음

        char _op_Char = _op.charAt(0); // 입력받은 연산자를 문자로 변환

        if (_op_Char == '+') { // 입력받은 연산자가 '+'인 경우
            System.out.println(num1 + " " + _op + " " + num2 + " = " + (num1 + num2)); // 두 수를 더한 결과 출력
        } else if (_op_Char == '-') { // 입력받은 연산자가 '-'인 경우
            System.out.println(num1 + " " + _op + " " + num2 + " = " + (num1 - num2)); // 두 수를 뺀 결과 출력
        } else if (_op_Char == '*') { // 입력받은 연산자가 '*'인 경우
            System.out.println(num1 + " " + _op + " " + num2 + " = " + (num1 * num2)); // 두 수를 곱한 결과 출력
        } else if (_op_Char == '/') { // 입력받은 연산자가 '/'인 경우
            System.out.println(num1 + " " + _op + " " + num2 + " = " + (num1 / num2)); // 두 수를 나눈 결과 출력
        } else { // 입력받은 연산자가 위의 경우들에 해당하지 않는 경우
            System.out.println("연산자를 잘못 입력하셨습니다."); // 잘못된 연산자 입력 안내 메시지 출력
        }

        scanner.close(); // Scanner 객체 닫기
    }
}