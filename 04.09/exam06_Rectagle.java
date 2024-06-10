import java.util.Scanner;

public class exam06_Rectagle {
    int width; // 너비 필드
    int height; // 높이 필드

    public int getArea() { // 넓이를 계산해서 반환하는 메소드
        return width * height; // 넓이 계산
    }

    public static void main(String[] args) {
        exam06_Rectagle rect = new exam06_Rectagle(); // exam06_Rectagle 객체 생성
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        System.out.print(">> ");

        rect.width = scanner.nextInt(); // 너비를 입력 받아 width 필드에 저장
        rect.height = scanner.nextInt(); // 높이를 입력 받아 height 필드에 저장

        System.out.println("사각형의 면적은 " + rect.getArea()); // 사각형의 넓이 출력

        scanner.close(); // Scanner 객체 닫기
    }
}