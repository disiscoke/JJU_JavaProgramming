package exam04; // exam04 패키지에 속함

public class app {  // app 클래스
    
    static void test(Integer _i) {  // Integer 객체를 전달받는 test 메소드
        //_i = Integer.valueOf(9);    // Integer 객체 _i를 9로 변경
        _i = 9;    // Integer 객체 _i를 9로 변경
    }

    public static void main(String[] args) {    // main 메소드
        
        Integer i = Integer.valueOf(10);    // Integer 클래스의 valueOf 메소드를 사용하여 10을 Integer 객체로 변환

        int ii = i.intValue();    // Integer 객체 i를 int로 변환하여 ii에 저장
        float fi = i.floatValue();    // Integer 객체 i를 float로 변환하여 fi에 저장

        System.out.println(ii);   // 10
        System.out.println(fi);   // 10.0

        test(i);    // Integer 객체 i를 test 메소드에 전달
        System.out.println(i);    // 10

        i = Integer.parseInt("8");  // "8"을 Integer로 변환하여 i에 저장
        System.out.println(i);    // 8
        boolean b = Boolean.parseBoolean("true");    // "true"를 boolean으로 변환하여 b에 저장
        System.out.println(b);    // true

        String str_b = Boolean.toString(b);    // boolean b를 String으로 변환하여 str_b에 저장
        System.out.println(str_b);    // true
        System.out.println(Integer.toHexString(15));    // f
        System.out.println(Integer.toBinaryString(15));    // 1111

    }    
}
