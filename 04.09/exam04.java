public class exam04 {
    public static void main(String[] args) {
        
        String[] strNumber = {"23","3.14"}; // 문자열 배열 선언 및 초기화

        for (int i= 0;i<strNumber.length;i++){  // 배열의 길이만큼 반복
            try {   // 예외가 발생할 수 있는 코드
                int _num= Integer.parseInt(strNumber[i]); // 문자열을 정수로 변환
                System.out.println("정수로 변환된 값은 " + _num); // 정수로 변환된 값을 출력
            }
            catch (NumberFormatException e) { // NumberFormatException 예외가 발생하면 실행되는 코드
                System.out.println("정수로 변환할 수 없습니다."); // 예외 메시지 출력
            }
        }
    }
}
