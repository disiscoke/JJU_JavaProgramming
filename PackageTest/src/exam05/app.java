package exam05;

public class app {
    public static void main(String[] args) {
        Integer ten = Integer.valueOf(10);  // Integer 객체 ten을 10으로 초기화 //boxing
        int _ten = ten.intValue();  // Integer 객체 ten을 int로 변환하여 _ten에 저장 //unboxing

        System.out.println(_ten);  // 10
    }
}
