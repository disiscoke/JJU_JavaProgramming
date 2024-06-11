import java.util.Iterator;
import java.util.Vector;

public class VectorSum {
    public static void main(String[] args) {
        // Vector 초기화
        Vector<Integer> numbers = new Vector<>(); // 1번: Vector<>()
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Iterator를 사용하여 모든 원소의 합 계산
        int sum = 0;
        Iterator<Integer> iterator = numbers.iterator(); // 2번: Integer, 3번: numbers
        while (iterator.hasNext()) { // 4번: hasNext
            sum += iterator.next(); // 5번: next
        }

        // 결과 출력
        System.out.println("Vector의 모든 원소의 합: " + sum);
    }
}
