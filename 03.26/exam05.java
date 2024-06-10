import java.util.Scanner;

public class exam05 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("연산자 선택 : ");
        String _op = scanner.nextLine(); // 사용자로부터 연산자를 입력받음

        System.out.println("2개의 수를 입력하세요 (,) : ");
        int num1 = scanner.nextInt(); // 첫 번째 수를 입력받음
        int num2 = scanner.nextInt(); // 두 번째 수를 입력받음

        char _op_Char = _op.charAt(0); // 입력받은 연산자를 문자로 변환

        switch (_op_Char) {
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
                break;
            case '/':
                System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
                break;
            case '$':
                System.out.println(num1 + "$" + num2 + "=" + ((num1 + num2) / 2));
                break;
        
            default:
                System.out.println("연산자를 잘못 입력하셨습니다. [+, -, *, /, $] 중 하나를 입력해주세요.");
                break;
        }
        scanner.close(); // Scanner 객체 닫기
    }
}