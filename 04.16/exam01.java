class Circle {

    int radius; // 원의 반지름

    public Circle(int radius){  // 생성자
        this.radius = radius;   // radius 초기화
    }

    public double getArea() {   // 원의 면적을 구하는 메소드
        return Math.PI * radius * radius;   // 원의 면적 반환
    }
}

public  class exam01 {

    public static void main(String[] args) {
        
        Circle[] circleArray;   // Circle형 배열 circleArray 선언
        circleArray = new Circle[5];    // Circle형 배열 circleArray 생성

        for (int i=0;i<5;i++){  // 5번 반복
            circleArray[i]=new Circle(i);   // circleArray[i]에 Circle 객체 생성
        }

        for (int i=0;i<5;i++){  // 5번 반복
            System.out.printf("%f \n",circleArray[i].getArea());    // circleArray[i]의 면적 출력
        }
    }

}