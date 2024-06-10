public class exam05_Circle {
    int radius; // 원의 반지름 필드
    String name; // 원의 이름 필드

    public exam05_Circle() { // 매개변수 없는 생성자
        radius = 1; // 반지름을 1로 초기화
        name = ""; // 이름 없음
    }

    public double getArea() { // 원의 넓이를 계산해서 반환하는 메소드
        return 3.14 * radius * radius; // 원의 넓이 계산
    }

    public static void main(String[] args) {

        exam05_Circle pizza; // exam05_Circle 객체를 가리키는 참조변수 pizza 선언
        pizza = new exam05_Circle(); // exam05_Circle 객체 생성
        pizza.radius = 10; // 피자의 반지름을 10으로 설정
        pizza.name = "자바피자"; // 피자의 이름 설정
        double area = pizza.getArea(); // 피자의 넓이를 구하는 메소드 호출
        System.out.println(pizza.name + "의 면적은 " + area); // 피자의 이름과 면적 출력

        exam05_Circle donut = new exam05_Circle(); // exam05_Circle 객체 생성
        donut.radius = 2; // 도넛의 반지름을 2로 설정
        donut.name = "자바도넛"; // 도넛의 이름 설정
        area = donut.getArea(); // 도넛의 넓이를 구하는 메소드 호출
        System.out.println(donut.name + "의 면적은 " + area); // 도넛의 이름과 면적 출력
    }
}
