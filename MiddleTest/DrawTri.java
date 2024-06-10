public class DrawTri {
    public static void main(String[] args) {
        int height = 5; // 역 삼각형의 높이 설정

        for (int i = height; i >= 1; i--) {
            // 공백 출력
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            // 별표 출력
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}