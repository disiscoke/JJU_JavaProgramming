import java.util.Scanner;

public class exam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        int sum = 0; // 합을 저장할 변수 sum 선언 및 초기화

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print((i + 1) + "번째 정수를 입력하시오: "); // i+1번째 정수 입력 요청
                sum += scanner.nextInt(); // 입력받은 정수를 sum에 더함
            } catch (Exception e) { // 예외가 발생하면 실행되는 코드
                System.out.println("정수가 아닙니다. 다시 입력하세요."); // 예외 메시지 출력
                i--; // i를 1 감소시켜 이전에 입력한 값을 다시 입력받도록 함
                scanner.nextLine(); // 입력 버퍼 비우기
                continue; // 반복문의 다음 반복으로 넘어감
            }

        }

        System.out.println("result : " + sum); // 합 출력

        scanner.close(); // Scanner 객체 닫기
    }
}
