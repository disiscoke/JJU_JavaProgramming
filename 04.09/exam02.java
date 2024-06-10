public class exam02 {
    public static void main(String[] args) {
        int[] array = new int[5];   // 배열 생성
        array[0] = 0;   // 배열의 첫 번째 요소에 0 저장

        try {   // 예외가 발생할 수 있는 코드
            for (int i = 0; i < 5; i++) {   // 배열의 두 번째 요소부터 마지막 요소까지 반복
                array[i+1] = i + 1 + array[i];  // 배열의 i+1번째 요소에 i+1과 i번째 요소의 합 저장
                System.out.println(i + " : " + array[i]);   // i와 i번째 요소의 값을 출력
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {  // ArrayIndexOutOfBoundsException 예외가 발생하면 실행되는 코드
            System.out.println("경고 : " + e.getMessage() + " 발생");   // 예외 메시지 출력
        }
        System.out.println("done"); // done 출력
    }
}
