interface Phoneinterface {
    void printlogo();   // 인터페이스에 선언된 메소드는 추상 메소드로 선언된다.
}

public class exam07 implements Phoneinterface { // 인터페이스를 구현하는 클래스

    @Override   
    public void printlogo() {

        System.out.println("it is exam05 phone");   // 인터페이스에 선언된 메소드를 구현한다.
    }

    public static void main(String[] args) {
        
        exam07 myPhone = new exam07();  // 인터페이스를 구현하는 클래스의 객체를 생성한다.

        myPhone.printlogo();    // 인터페이스에 선언된 메소드를 호출한다.
    }
}