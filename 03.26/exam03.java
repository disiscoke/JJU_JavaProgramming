import java.util.Scanner;

public class exam03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요(0~100): ");
        int nscore = scanner.nextInt();

        System.out.println("나이를 입력하세요 : ");
        int age = scanner.nextInt();

        if (nscore >= 60) { //
            if (age >= 60) {
                System.out.println("합격!");
            } else if (nscore >= 70) {
                System.out.println("합격!");
            } else {
                System.out.println("불합격!");
            }
        } else {
            System.out.println("불합격!");
        }
        scanner.close();
    }
}
