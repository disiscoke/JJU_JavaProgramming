import java.util.Scanner;

public class exam01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        int nNum = scanner.nextInt();

        if (nNum % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
        scanner.close();
    }
}
