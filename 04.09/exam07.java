public class exam07 {

    public static void main(String[] args) {

        myCircle _circle = new myCircle(); // myCircle 객체 생성

        System.out.println(_circle.name + "area is " + _circle.getArea()); // 원의 이름과 넓이 출력

        myCircle _circle2 = new myCircle(5, "myCircle2"); // myCircle 객체 생성

        System.out.println(_circle2.name + " area is " + _circle2.getArea()); // 원의 이름과 넓이 출력

    }
}
