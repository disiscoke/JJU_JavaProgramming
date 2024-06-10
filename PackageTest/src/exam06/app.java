package exam06;

public class app {
    public static void main(String[] args) {
        String strA = "apple";  // apple
        String strB = "banana"; // banana
        String strC = new String("apple");  // apple

        //int res = strA.compareTo(strB); // apple과 banana를 비교하여 결과를 res에 저장

        System.out.println(strA.compareTo(strB));   // -1
        System.out.println(strB.compareTo(strA));   // 1
        System.out.println(strA.compareTo(strC));   // 0
        System.out.println(strC.equals(strB));   // false
        System.out.println(strC.equals(strA));   // true
        System.out.println(strC == strA);   // false

    }
}
