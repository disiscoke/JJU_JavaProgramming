package exam03;   // exam03 패키지에 속함

import exam02.Point;    // Point 클래스를 import

public class app {  // app 클래스
    public static void main(String[] args) {
        Point a = new Point(2,3);   // Point 클래스가 exam02 패키지에 있어서 import 필요
        Point b = new Point(2,3);
        Point c = new Point(3,4);

        System.out.println(a == b);   // false
        System.out.println(a.equals(b));   // true
    }
}
